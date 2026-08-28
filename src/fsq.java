import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsq extends ftr {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xk a = xk.c("connect.aborted");
   public static final xk b = xk.a("disconnect.genericReason", xk.c("disconnect.unknownHost"));
   @Nullable
   volatile we u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final ftr x;
   private xk y = xk.c("connect.connecting");
   private long z = -1L;
   final xk A;

   private fsq(ftr $$0, xk $$1) {
      super(flq.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(ftr $$0, flz $$1, ggx $$2, gfu $$3, boolean $$4, @Nullable gfy $$5) {
      if ($$1.z instanceof fsq) {
         d.error("Attempt to connect while already connecting");
      } else {
         xk $$6;
         if ($$5 != null) {
            $$6 = xj.q;
         } else if ($$4) {
            $$6 = gkj.a;
         } else {
            $$6 = xj.r;
         }

         fsq $$9 = new fsq($$0, $$6);
         if ($$5 != null) {
            $$9.a(xk.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(ggl.a($$3.b));
         $$1.bd().a(gkk.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final flz $$0, final ggx $$1, final gfu $$2, @Nullable final gfy $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fsq.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ggz.a.a($$1).map(ggw::d);
               if (fsq.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fsy(fsq.this.x, fsq.this.A, fsq.b)));
                  return;
               }

               $$0 = $$1.get();
               we $$2;
               synchronized (fsq.this) {
                  if (fsq.this.w) {
                     return;
                  }

                  $$2 = new we(zs.b);
                  $$2.a($$0.aQ().n());
                  fsq.this.v = we.a($$0, $$0.n.aD(), $$2);
               }

               fsq.this.v.syncUninterruptibly();
               synchronized (fsq.this) {
                  if (fsq.this.w) {
                     $$2.a(fsq.a);
                     return;
                  }

                  fsq.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fsq.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajr.b, ajr.d, new gfe(fsq.this.u, $$0, $$2, fsq.this.x, false, null, fsq.this::a, $$3), $$3 != null);
               fsq.this.u.a(new aju($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fsq.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fsq.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fsy(fsq.this.x, fsq.this.A, xk.a("disconnect.genericReason", $$8))));
            }
         }

         private static hej.c a(gfu.a $$0x) {
            return switch ($$0) {
               case a -> hej.c.b;
               case b -> hej.c.c;
               case c -> hej.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xk $$0) {
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
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aT_() {
      this.c(fny.a(xj.e, $$0 -> {
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
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xk.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
