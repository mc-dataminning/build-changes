import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmw extends fnx {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger q = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final wy a = wy.c("connect.aborted");
   public static final wy b = wy.a("disconnect.genericReason", wy.c("disconnect.unknownHost"));
   @Nullable
   volatile vs s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fnx w;
   private wy x = wy.c("connect.connecting");
   private long y = -1L;
   final wy z;

   private fmw(fnx $$0, wy $$1) {
      super(fga.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fnx $$0, fgi $$1, gar $$2, fzn $$3, boolean $$4, @Nullable fzs $$5) {
      if ($$1.y instanceof fmw) {
         q.error("Attempt to connect while already connecting");
      } else {
         wy $$6;
         if ($$5 != null) {
            $$6 = wx.q;
         } else if ($$4) {
            $$6 = gec.a;
         } else {
            $$6 = wx.r;
         }

         fmw $$9 = new fmw($$0, $$6);
         if ($$5 != null) {
            $$9.a(wy.c("connect.transferring"));
         }

         $$1.y();
         $$1.aR();
         $$1.a(gaf.a($$3.b));
         $$1.aZ().a(ged.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fgi $$0, final gar $$1, final fzn $$2, @Nullable final fzs $$3) {
      q.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fmw.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gat.a.a($$1).map(gaq::d);
               if (fmw.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fne(fmw.this.w, fmw.this.z, fmw.b)));
                  return;
               }

               $$0 = $$1.get();
               vs $$2;
               synchronized (fmw.this) {
                  if (fmw.this.v) {
                     return;
                  }

                  $$2 = new vs(zg.b);
                  $$2.a($$0.aN().n());
                  fmw.this.u = vs.a($$0, $$0.m.az(), $$2);
               }

               fmw.this.u.syncUninterruptibly();
               synchronized (fmw.this) {
                  if (fmw.this.v) {
                     $$2.a(fmw.a);
                     return;
                  }

                  fmw.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fmw.this.s
                  .a($$0.getHostName(), $$0.getPort(), aiu.a, aiu.b, new fyy(fmw.this.s, $$0, $$2, fmw.this.w, false, null, fmw.this::a, $$3), $$3 != null);
               fmw.this.s.a(new aix($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fmw.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fmw.q.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fne(fmw.this.w, fmw.this.z, wy.a("disconnect.genericReason", $$8))));
            }
         }

         private static gsz.c a(fzn.a $$0x) {
            return switch ($$0) {
               case a -> gsz.c.b;
               case b -> gsz.c.c;
               case c -> gsz.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(q));
      $$4.start();
   }

   private void a(wy $$0) {
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
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.c(fig.a(wx.e, $$0 -> {
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

         this.l.a(this.w);
      }).a(this.m / 2 - 100, this.n / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.l.aV().c(wy.c("narrator.joining"));
      }

      $$0.a(this.o, this.x, this.m / 2, this.n / 2 - 50, 16777215);
   }
}
