import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fef extends ffl {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vq a = vq.c("connect.aborted");
   public static final vq b = vq.a("disconnect.genericReason", vq.c("disconnect.unknownHost"));
   @Nullable
   volatile uo m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final ffl p;
   private vq q = vq.c("connect.connecting");
   private long r = -1L;
   final vq t;

   private fef(ffl $$0, vq $$1) {
      super(exg.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(ffl $$0, exo $$1, frs $$2, fqq $$3, boolean $$4, @Nullable fqt $$5) {
      if ($$1.y instanceof fef) {
         k.error("Attempt to connect while already connecting");
      } else {
         vq $$6;
         if ($$5 != null) {
            $$6 = vp.q;
         } else if ($$4) {
            $$6 = fvc.a;
         } else {
            $$6 = vp.r;
         }

         fef $$9 = new fef($$0, $$6);
         if ($$5 != null) {
            $$9.a(vq.c("connect.transferring"));
         }

         $$1.z();
         $$1.aS();
         $$1.a(frg.a($$3.b));
         $$1.bb().a(fvd.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final exo $$0, final frs $$1, final fqq $$2, @Nullable final fqt $$3) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fef.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fru.a.a($$1).map(frr::d);
               if (fef.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fen(fef.this.p, fef.this.t, fef.b)));
                  return;
               }

               $$0 = $$1.get();
               uo $$2;
               synchronized (fef.this) {
                  if (fef.this.o) {
                     return;
                  }

                  $$2 = new uo(xy.b);
                  $$2.a($$0.aO().m());
                  fef.this.n = uo.a($$0, $$0.m.aw(), $$2);
               }

               fef.this.n.syncUninterruptibly();
               synchronized (fef.this) {
                  if (fef.this.o) {
                     $$2.a(fef.a);
                     return;
                  }

                  fef.this.m = $$2;
                  $$0.ad().a($$2, a($$2.b()));
               }

               fef.this.m
                  .a($$0.getHostName(), $$0.getPort(), ahd.a, ahd.b, new fqd(fef.this.m, $$0, $$2, fef.this.p, false, null, fef.this::a, $$3), $$3 != null);
               fef.this.m.a(new ahg($$0.W().c(), $$0.W().b()));
            } catch (Exception var9) {
               if (fef.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fef.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fen(fef.this.p, fef.this.t, vq.a("disconnect.genericReason", $$8))));
            }
         }

         private static gju.c a(fqq.a $$0x) {
            return switch ($$0) {
               case a -> gju.c.b;
               case b -> gju.c.c;
               case c -> gju.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(k));
      $$4.start();
   }

   private void a(vq $$0) {
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
   public boolean aO_() {
      return false;
   }

   @Override
   protected void aQ_() {
      this.c(ezo.a(vp.e, $$0 -> {
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aX().c(vq.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
