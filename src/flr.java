import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flr extends fmy {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final xl a = xl.c("connect.aborted");
   public static final xl b = xl.a("disconnect.genericReason", xl.c("disconnect.unknownHost"));
   @Nullable
   volatile wj s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fmy w;
   private xl x = xl.c("connect.connecting");
   private long y = -1L;
   final xl z;

   private flr(fmy $$0, xl $$1) {
      super(fes.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fmy $$0, ffa $$1, fzh $$2, fye $$3, boolean $$4, @Nullable fyi $$5) {
      if ($$1.y instanceof flr) {
         d.error("Attempt to connect while already connecting");
      } else {
         xl $$6;
         if ($$5 != null) {
            $$6 = xk.q;
         } else if ($$4) {
            $$6 = gcs.a;
         } else {
            $$6 = xk.r;
         }

         flr $$9 = new flr($$0, $$6);
         if ($$5 != null) {
            $$9.a(xl.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fyv.a($$3.b));
         $$1.bb().a(gct.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final ffa $$0, final fzh $$1, final fye $$2, @Nullable final fyi $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (flr.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fzj.a.a($$1).map(fzg::d);
               if (flr.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new flz(flr.this.w, flr.this.z, flr.b)));
                  return;
               }

               $$0 = $$1.get();
               wj $$2;
               synchronized (flr.this) {
                  if (flr.this.v) {
                     return;
                  }

                  $$2 = new wj(zt.b);
                  $$2.a($$0.aP().n());
                  flr.this.u = wj.a($$0, $$0.m.az(), $$2);
               }

               flr.this.u.syncUninterruptibly();
               synchronized (flr.this) {
                  if (flr.this.v) {
                     $$2.a(flr.a);
                     return;
                  }

                  flr.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               flr.this.s
                  .a($$0.getHostName(), $$0.getPort(), ajf.a, ajf.b, new fxp(flr.this.s, $$0, $$2, flr.this.w, false, null, flr.this::a, $$3), $$3 != null);
               flr.this.s.a(new aji($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (flr.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               flr.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new flz(flr.this.w, flr.this.z, xl.a("disconnect.genericReason", $$8))));
            }
         }

         private static gro.c a(fye.a $$0x) {
            return switch ($$0) {
               case a -> gro.c.b;
               case b -> gro.c.c;
               case c -> gro.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xl $$0) {
      this.x = $$0;
   }

   @Override
   public void e() {
      if (this.s != null) {
         if (this.s.i()) {
            this.s.b();
         } else {
            this.s.n();
         }
      }
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.c(fgz.a(xk.e, $$0 -> {
         synchronized (this) {
            this.v = true;
            if (this.u != null) {
               this.u.cancel(true);
               this.u = null;
            }

            if (this.s != null) {
               this.s.a(a);
            }
         }

         this.m.a(this.w);
      }).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aX().c(xl.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
