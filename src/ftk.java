import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftk extends ful {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wp a = wp.c("connect.aborted");
   public static final wp b = wp.a("disconnect.genericReason", wp.c("disconnect.unknownHost"));
   @Nullable
   volatile vi u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final ful x;
   private wp y = wp.c("connect.connecting");
   private long z = -1L;
   final wp A;

   private ftk(ful $$0, wp $$1) {
      super(fla.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(ful $$0, flj $$1, ghr $$2, ggo $$3, boolean $$4, @Nullable ggs $$5) {
      if ($$1.z instanceof ftk) {
         d.error("Attempt to connect while already connecting");
      } else {
         wp $$6;
         if ($$5 != null) {
            $$6 = wo.q;
         } else if ($$4) {
            $$6 = gld.a;
         } else {
            $$6 = wo.r;
         }

         ftk $$9 = new ftk($$0, $$6);
         if ($$5 != null) {
            $$9.a(wp.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(ghf.a($$3.b));
         $$1.bc().a(gle.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final flj $$0, final ghr $$1, final ggo $$2, @Nullable final ggs $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ftk.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ght.a.a($$1).map(ghq::d);
               if (ftk.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fts(ftk.this.x, ftk.this.A, ftk.b)));
                  return;
               }

               $$0 = $$1.get();
               vi $$2;
               synchronized (ftk.this) {
                  if (ftk.this.w) {
                     return;
                  }

                  $$2 = new vi(yx.b);
                  $$2.a($$0.aQ().n());
                  ftk.this.v = vi.a($$0, $$0.n.aD(), $$2);
               }

               ftk.this.v.syncUninterruptibly();
               synchronized (ftk.this) {
                  if (ftk.this.w) {
                     $$2.a(ftk.a);
                     return;
                  }

                  ftk.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               ftk.this.u
                  .a($$0.getHostName(), $$0.getPort(), aix.b, aix.d, new gfy(ftk.this.u, $$0, $$2, ftk.this.x, false, null, ftk.this::a, $$3), $$3 != null);
               ftk.this.u.a(new aja($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (ftk.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ftk.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fts(ftk.this.x, ftk.this.A, wp.a("disconnect.genericReason", $$8))));
            }
         }

         private static hhv.c a(ggo.a $$0x) {
            return switch ($$0) {
               case a -> hhv.c.b;
               case b -> hhv.c.c;
               case c -> hhv.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wp $$0) {
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
      this.c(fot.a(wo.e, $$0 -> {
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
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wp.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
