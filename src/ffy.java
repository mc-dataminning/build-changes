import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffy extends fhf {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vu a = vu.c("connect.aborted");
   public static final vu b = vu.a("disconnect.genericReason", vu.c("disconnect.unknownHost"));
   @Nullable
   volatile us m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fhf p;
   private vu q = vu.c("connect.connecting");
   private long r = -1L;
   final vu t;

   private ffy(fhf $$0, vu $$1) {
      super(eyy.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fhf $$0, ezg $$1, ftp $$2, fsm $$3, boolean $$4, @Nullable fsq $$5) {
      if ($$1.y instanceof ffy) {
         k.error("Attempt to connect while already connecting");
      } else {
         vu $$6;
         if ($$5 != null) {
            $$6 = vt.q;
         } else if ($$4) {
            $$6 = fwz.a;
         } else {
            $$6 = vt.r;
         }

         ffy $$9 = new ffy($$0, $$6);
         if ($$5 != null) {
            $$9.a(vu.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(ftd.a($$3.b));
         $$1.bc().a(fxa.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final ezg $$0, final ftp $$1, final fsm $$2, @Nullable final fsq $$3) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ffy.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ftr.a.a($$1).map(fto::d);
               if (ffy.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fgg(ffy.this.p, ffy.this.t, ffy.b)));
                  return;
               }

               $$0 = $$1.get();
               us $$2;
               synchronized (ffy.this) {
                  if (ffy.this.o) {
                     return;
                  }

                  $$2 = new us(yc.b);
                  $$2.a($$0.aP().n());
                  ffy.this.n = us.a($$0, $$0.m.ax(), $$2);
               }

               ffy.this.n.syncUninterruptibly();
               synchronized (ffy.this) {
                  if (ffy.this.o) {
                     $$2.a(ffy.a);
                     return;
                  }

                  ffy.this.m = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               ffy.this.m
                  .a($$0.getHostName(), $$0.getPort(), ahl.a, ahl.b, new frx(ffy.this.m, $$0, $$2, ffy.this.p, false, null, ffy.this::a, $$3), $$3 != null);
               ffy.this.m.a(new aho($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (ffy.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ffy.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fgg(ffy.this.p, ffy.this.t, vu.a("disconnect.genericReason", $$8))));
            }
         }

         private static gls.c a(fsm.a $$0x) {
            return switch ($$0) {
               case a -> gls.c.b;
               case b -> gls.c.c;
               case c -> gls.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(k));
      $$4.start();
   }

   private void a(vu $$0) {
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
   public boolean aM_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.c(fbg.a(vt.e, $$0 -> {
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
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aY().c(vu.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
