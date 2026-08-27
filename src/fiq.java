import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fiq extends fjx {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long o = 2000L;
   public static final wi a = wi.c("connect.aborted");
   public static final wi b = wi.a("disconnect.genericReason", wi.c("disconnect.unknownHost"));
   @Nullable
   volatile vg p;
   @Nullable
   ChannelFuture q;
   volatile boolean r;
   final fjx s;
   private wi u = wi.c("connect.connecting");
   private long v = -1L;
   final wi w;

   private fiq(fjx $$0, wi $$1) {
      super(fbq.a);
      this.s = $$0;
      this.w = $$1;
   }

   public static void a(fjx $$0, fby $$1, fwh $$2, fve $$3, boolean $$4, @Nullable fvi $$5) {
      if ($$1.y instanceof fiq) {
         d.error("Attempt to connect while already connecting");
      } else {
         wi $$6;
         if ($$5 != null) {
            $$6 = wh.q;
         } else if ($$4) {
            $$6 = fzr.a;
         } else {
            $$6 = wh.r;
         }

         fiq $$9 = new fiq($$0, $$6);
         if ($$5 != null) {
            $$9.a(wi.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fvv.a($$3.b));
         $$1.bc().a(fzs.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fby $$0, final fwh $$1, final fve $$2, @Nullable final fvi $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fiq.this.r) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fwj.a.a($$1).map(fwg::d);
               if (fiq.this.r) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fiy(fiq.this.s, fiq.this.w, fiq.b)));
                  return;
               }

               $$0 = $$1.get();
               vg $$2;
               synchronized (fiq.this) {
                  if (fiq.this.r) {
                     return;
                  }

                  $$2 = new vg(yq.b);
                  $$2.a($$0.aP().n());
                  fiq.this.q = vg.a($$0, $$0.m.az(), $$2);
               }

               fiq.this.q.syncUninterruptibly();
               synchronized (fiq.this) {
                  if (fiq.this.r) {
                     $$2.a(fiq.a);
                     return;
                  }

                  fiq.this.p = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fiq.this.p
                  .a($$0.getHostName(), $$0.getPort(), ahz.a, ahz.b, new fup(fiq.this.p, $$0, $$2, fiq.this.s, false, null, fiq.this::a, $$3), $$3 != null);
               fiq.this.p.a(new aic($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fiq.this.r) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fiq.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fiy(fiq.this.s, fiq.this.w, wi.a("disconnect.genericReason", $$8))));
            }
         }

         private static gol.c a(fve.a $$0x) {
            return switch ($$0) {
               case a -> gol.c.b;
               case b -> gol.c.c;
               case c -> gol.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wi $$0) {
      this.u = $$0;
   }

   @Override
   public void e() {
      if (this.p != null) {
         if (this.p.i()) {
            this.p.b();
         } else {
            this.p.n();
         }
      }
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.c(fdy.a(wh.e, $$0 -> {
         synchronized (this) {
            this.r = true;
            if (this.q != null) {
               this.q.cancel(true);
               this.q = null;
            }

            if (this.p != null) {
               this.p.a(a);
            }
         }

         this.j.a(this.s);
      }).a(this.k / 2 - 100, this.l / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.v > 2000L) {
         this.v = $$4;
         this.j.aY().c(wi.c("narrator.joining"));
      }

      $$0.a(this.m, this.u, this.k / 2, this.l / 2 - 50, 16777215);
   }
}
