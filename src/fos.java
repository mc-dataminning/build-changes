import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fos extends fpt {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xd a = xd.c("connect.aborted");
   public static final xd b = xd.a("disconnect.genericReason", xd.c("disconnect.unknownHost"));
   @Nullable
   volatile vx u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fpt x;
   private xd y = xd.c("connect.connecting");
   private long z = -1L;
   final xd A;

   private fos(fpt $$0, xd $$1) {
      super(fhs.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fpt $$0, fib $$1, gco $$2, gbl $$3, boolean $$4, @Nullable gbp $$5) {
      if ($$1.z instanceof fos) {
         d.error("Attempt to connect while already connecting");
      } else {
         xd $$6;
         if ($$5 != null) {
            $$6 = xc.q;
         } else if ($$4) {
            $$6 = gfz.a;
         } else {
            $$6 = xc.r;
         }

         fos $$9 = new fos($$0, $$6);
         if ($$5 != null) {
            $$9.a(xd.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gcc.a($$3.b));
         $$1.bc().a(gga.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fib $$0, final gco $$1, final gbl $$2, @Nullable final gbp $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fos.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gcq.a.a($$1).map(gcn::d);
               if (fos.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fpa(fos.this.x, fos.this.A, fos.b)));
                  return;
               }

               $$0 = $$1.get();
               vx $$2;
               synchronized (fos.this) {
                  if (fos.this.w) {
                     return;
                  }

                  $$2 = new vx(zl.b);
                  $$2.a($$0.aQ().n());
                  fos.this.v = vx.a($$0, $$0.n.aC(), $$2);
               }

               fos.this.v.syncUninterruptibly();
               synchronized (fos.this) {
                  if (fos.this.w) {
                     $$2.a(fos.a);
                     return;
                  }

                  fos.this.u = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fos.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajf.b, ajf.d, new gaw(fos.this.u, $$0, $$2, fos.this.x, false, null, fos.this::a, $$3), $$3 != null);
               fos.this.u.a(new aji($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fos.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fos.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fpa(fos.this.x, fos.this.A, xd.a("disconnect.genericReason", $$8))));
            }
         }

         private static gzk.c a(gbl.a $$0x) {
            return switch ($$0) {
               case a -> gzk.c.b;
               case b -> gzk.c.c;
               case c -> gzk.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xd $$0) {
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
   public boolean aJ_() {
      return false;
   }

   @Override
   protected void aT_() {
      this.c(fka.a(xc.e, $$0 -> {
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(xd.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
