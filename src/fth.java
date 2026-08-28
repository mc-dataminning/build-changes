import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fth extends fui {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wo a = wo.c("connect.aborted");
   public static final wo b = wo.a("disconnect.genericReason", wo.c("disconnect.unknownHost"));
   @Nullable
   volatile vi u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fui x;
   private wo y = wo.c("connect.connecting");
   private long z = -1L;
   final wo A;

   private fth(fui $$0, wo $$1) {
      super(fky.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fui $$0, flh $$1, gho $$2, ggl $$3, boolean $$4, @Nullable ggp $$5) {
      if ($$1.z instanceof fth) {
         d.error("Attempt to connect while already connecting");
      } else {
         wo $$6;
         if ($$5 != null) {
            $$6 = wn.q;
         } else if ($$4) {
            $$6 = gla.a;
         } else {
            $$6 = wn.r;
         }

         fth $$9 = new fth($$0, $$6);
         if ($$5 != null) {
            $$9.a(wo.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(ghc.a($$3.b));
         $$1.bc().a(glb.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final flh $$0, final gho $$1, final ggl $$2, @Nullable final ggp $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fth.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ghq.a.a($$1).map(ghn::d);
               if (fth.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new ftp(fth.this.x, fth.this.A, fth.b)));
                  return;
               }

               $$0 = $$1.get();
               vi $$2;
               synchronized (fth.this) {
                  if (fth.this.w) {
                     return;
                  }

                  $$2 = new vi(yw.b);
                  $$2.a($$0.aQ().n());
                  fth.this.v = vi.a($$0, $$0.n.aD(), $$2);
               }

               fth.this.v.syncUninterruptibly();
               synchronized (fth.this) {
                  if (fth.this.w) {
                     $$2.a(fth.a);
                     return;
                  }

                  fth.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fth.this.u
                  .a($$0.getHostName(), $$0.getPort(), aiw.b, aiw.d, new gfv(fth.this.u, $$0, $$2, fth.this.x, false, null, fth.this::a, $$3), $$3 != null);
               fth.this.u.a(new aiz($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fth.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fth.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ftp(fth.this.x, fth.this.A, wo.a("disconnect.genericReason", $$8))));
            }
         }

         private static hhp.c a(ggl.a $$0x) {
            return switch ($$0) {
               case a -> hhp.c.b;
               case b -> hhp.c.c;
               case c -> hhp.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wo $$0) {
      this.y = $$0;
   }

   @Override
   public void e() {
      if (this.u != null) {
         if (this.u.i()) {
            this.u.b();
         } else {
            this.u.n();
         }
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
      this.c(fop.a(wn.e, $$0 -> {
         synchronized (this) {
            this.w = true;
            if (this.v != null) {
               this.v.cancel(true);
               this.v = null;
            }

            if (this.u != null) {
               this.u.a(a);
            }
         }

         this.m.a(this.x);
      }).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wo.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
