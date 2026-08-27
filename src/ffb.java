import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffb extends fgh {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vs a = vs.c("connect.aborted");
   public static final vs b = vs.a("disconnect.genericReason", vs.c("disconnect.unknownHost"));
   @Nullable
   volatile uq m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fgh p;
   private vs q = vs.c("connect.connecting");
   private long r = -1L;
   final vs t;

   private ffb(fgh $$0, vs $$1) {
      super(eyc.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fgh $$0, eyk $$1, fsp $$2, frn $$3, boolean $$4, @Nullable frq $$5) {
      if ($$1.y instanceof ffb) {
         k.error("Attempt to connect while already connecting");
      } else {
         vs $$6;
         if ($$5 != null) {
            $$6 = vr.q;
         } else if ($$4) {
            $$6 = fvz.a;
         } else {
            $$6 = vr.r;
         }

         ffb $$9 = new ffb($$0, $$6);
         if ($$5 != null) {
            $$9.a(vs.c("connect.transferring"));
         }

         $$1.x();
         $$1.aS();
         $$1.a(fsd.a($$3.b));
         $$1.bb().a(fwa.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final eyk $$0, final fsp $$1, final frn $$2, @Nullable final frq $$3) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ffb.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fsr.a.a($$1).map(fso::d);
               if (ffb.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new ffj(ffb.this.p, ffb.this.t, ffb.b)));
                  return;
               }

               $$0 = $$1.get();
               uq $$2;
               synchronized (ffb.this) {
                  if (ffb.this.o) {
                     return;
                  }

                  $$2 = new uq(ya.b);
                  $$2.a($$0.aO().n());
                  ffb.this.n = uq.a($$0, $$0.m.aw(), $$2);
               }

               ffb.this.n.syncUninterruptibly();
               synchronized (ffb.this) {
                  if (ffb.this.o) {
                     $$2.a(ffb.a);
                     return;
                  }

                  ffb.this.m = $$2;
                  $$0.ad().a($$2, a($$2.b()));
               }

               ffb.this.m
                  .a($$0.getHostName(), $$0.getPort(), ahh.a, ahh.b, new fqz(ffb.this.m, $$0, $$2, ffb.this.p, false, null, ffb.this::a, $$3), $$3 != null);
               ffb.this.m.a(new ahk($$0.W().c(), $$0.W().b()));
            } catch (Exception var9) {
               if (ffb.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ffb.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ffj(ffb.this.p, ffb.this.t, vs.a("disconnect.genericReason", $$8))));
            }
         }

         private static gks.c a(frn.a $$0x) {
            return switch ($$0) {
               case a -> gks.c.b;
               case b -> gks.c.c;
               case c -> gks.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(k));
      $$4.start();
   }

   private void a(vs $$0) {
      this.q = $$0;
   }

   @Override
   public void e() {
      if (this.m != null) {
         if (this.m.i()) {
            this.m.b();
         } else {
            this.m.n();
         }
      }
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.c(fak.a(vr.e, $$0 -> {
         synchronized (this) {
            this.o = true;
            if (this.n != null) {
               this.n.cancel(true);
               this.n = null;
            }

            if (this.m != null) {
               this.m.a(a);
            }
         }

         this.f.a(this.p);
      }).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aX().c(vs.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
