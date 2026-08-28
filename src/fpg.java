import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpg extends fqh {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xe a = xe.c("connect.aborted");
   public static final xe b = xe.a("disconnect.genericReason", xe.c("disconnect.unknownHost"));
   @Nullable
   volatile vy u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fqh x;
   private xe y = xe.c("connect.connecting");
   private long z = -1L;
   final xe A;

   private fpg(fqh $$0, xe $$1) {
      super(fig.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fqh $$0, fip $$1, gdd $$2, gca $$3, boolean $$4, @Nullable gce $$5) {
      if ($$1.z instanceof fpg) {
         d.error("Attempt to connect while already connecting");
      } else {
         xe $$6;
         if ($$5 != null) {
            $$6 = xd.q;
         } else if ($$4) {
            $$6 = ggo.a;
         } else {
            $$6 = xd.r;
         }

         fpg $$9 = new fpg($$0, $$6);
         if ($$5 != null) {
            $$9.a(xe.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(gcr.a($$3.b));
         $$1.bd().a(ggp.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fip $$0, final gdd $$1, final gca $$2, @Nullable final gce $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fpg.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gdf.a.a($$1).map(gdc::d);
               if (fpg.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fpo(fpg.this.x, fpg.this.A, fpg.b)));
                  return;
               }

               $$0 = $$1.get();
               vy $$2;
               synchronized (fpg.this) {
                  if (fpg.this.w) {
                     return;
                  }

                  $$2 = new vy(zm.b);
                  $$2.a($$0.aR().n());
                  fpg.this.v = vy.a($$0, $$0.n.aC(), $$2);
               }

               fpg.this.v.syncUninterruptibly();
               synchronized (fpg.this) {
                  if (fpg.this.w) {
                     $$2.a(fpg.a);
                     return;
                  }

                  fpg.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fpg.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajg.b, ajg.d, new gbl(fpg.this.u, $$0, $$2, fpg.this.x, false, null, fpg.this::a, $$3), $$3 != null);
               fpg.this.u.a(new ajj($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fpg.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fpg.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fpo(fpg.this.x, fpg.this.A, xe.a("disconnect.genericReason", $$8))));
            }
         }

         private static hag.c a(gca.a $$0x) {
            return switch ($$0) {
               case a -> hag.c.b;
               case b -> hag.c.c;
               case c -> hag.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xe $$0) {
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
   public boolean aI_() {
      return false;
   }

   @Override
   protected void aS_() {
      this.c(fko.a(xd.e, $$0 -> {
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
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xe.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
