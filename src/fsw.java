import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsw extends ftx {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xv a = xv.c("connect.aborted");
   public static final xv b = xv.a("disconnect.genericReason", xv.c("disconnect.unknownHost"));
   @Nullable
   volatile wp u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final ftx x;
   private xv y = xv.c("connect.connecting");
   private long z = -1L;
   final xv A;

   private fsw(ftx $$0, xv $$1) {
      super(flw.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(ftx $$0, fmf $$1, ghb $$2, gfy $$3, boolean $$4, @Nullable ggc $$5) {
      if ($$1.z instanceof fsw) {
         d.error("Attempt to connect while already connecting");
      } else {
         xv $$6;
         if ($$5 != null) {
            $$6 = xu.q;
         } else if ($$4) {
            $$6 = gkn.a;
         } else {
            $$6 = xu.r;
         }

         fsw $$9 = new fsw($$0, $$6);
         if ($$5 != null) {
            $$9.a(xv.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(ggp.a($$3.b));
         $$1.bd().a(gko.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fmf $$0, final ghb $$1, final gfy $$2, @Nullable final ggc $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fsw.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ghd.a.a($$1).map(gha::d);
               if (fsw.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fte(fsw.this.x, fsw.this.A, fsw.b)));
                  return;
               }

               $$0 = $$1.get();
               wp $$2;
               synchronized (fsw.this) {
                  if (fsw.this.w) {
                     return;
                  }

                  $$2 = new wp(aad.b);
                  $$2.a($$0.aQ().n());
                  fsw.this.v = wp.a($$0, $$0.n.aD(), $$2);
               }

               fsw.this.v.syncUninterruptibly();
               synchronized (fsw.this) {
                  if (fsw.this.w) {
                     $$2.a(fsw.a);
                     return;
                  }

                  fsw.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fsw.this.u
                  .a($$0.getHostName(), $$0.getPort(), akb.b, akb.d, new gfi(fsw.this.u, $$0, $$2, fsw.this.x, false, null, fsw.this::a, $$3), $$3 != null);
               fsw.this.u.a(new ake($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fsw.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fsw.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fte(fsw.this.x, fsw.this.A, xv.a("disconnect.genericReason", $$8))));
            }
         }

         private static hen.c a(gfy.a $$0x) {
            return switch ($$0) {
               case a -> hen.c.b;
               case b -> hen.c.c;
               case c -> hen.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xv $$0) {
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
      this.c(foe.a(xu.e, $$0 -> {
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
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xv.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
