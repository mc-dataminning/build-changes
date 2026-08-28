import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmi extends fnj {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger q = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final wu a = wu.c("connect.aborted");
   public static final wu b = wu.a("disconnect.genericReason", wu.c("disconnect.unknownHost"));
   @Nullable
   volatile vp s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fnj w;
   private wu x = wu.c("connect.connecting");
   private long y = -1L;
   final wu z;

   private fmi(fnj $$0, wu $$1) {
      super(ffl.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fnj $$0, fft $$1, gab $$2, fyx $$3, boolean $$4, @Nullable fzc $$5) {
      if ($$1.y instanceof fmi) {
         q.error("Attempt to connect while already connecting");
      } else {
         wu $$6;
         if ($$5 != null) {
            $$6 = wt.q;
         } else if ($$4) {
            $$6 = gdm.a;
         } else {
            $$6 = wt.r;
         }

         fmi $$9 = new fmi($$0, $$6);
         if ($$5 != null) {
            $$9.a(wu.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fzp.a($$3.b));
         $$1.bb().a(gdn.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fft $$0, final gab $$1, final fyx $$2, @Nullable final fzc $$3) {
      q.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fmi.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gad.a.a($$1).map(gaa::d);
               if (fmi.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fmq(fmi.this.w, fmi.this.z, fmi.b)));
                  return;
               }

               $$0 = $$1.get();
               vp $$2;
               synchronized (fmi.this) {
                  if (fmi.this.v) {
                     return;
                  }

                  $$2 = new vp(zc.b);
                  $$2.a($$0.aP().n());
                  fmi.this.u = vp.a($$0, $$0.m.az(), $$2);
               }

               fmi.this.u.syncUninterruptibly();
               synchronized (fmi.this) {
                  if (fmi.this.v) {
                     $$2.a(fmi.a);
                     return;
                  }

                  fmi.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fmi.this.s
                  .a($$0.getHostName(), $$0.getPort(), aio.a, aio.b, new fyi(fmi.this.s, $$0, $$2, fmi.this.w, false, null, fmi.this::a, $$3), $$3 != null);
               fmi.this.s.a(new air($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fmi.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fmi.q.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fmq(fmi.this.w, fmi.this.z, wu.a("disconnect.genericReason", $$8))));
            }
         }

         private static gsi.c a(fyx.a $$0x) {
            return switch ($$0) {
               case a -> gsi.c.b;
               case b -> gsi.c.c;
               case c -> gsi.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(q));
      $$4.start();
   }

   private void a(wu $$0) {
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
      this.c(fhs.a(wt.e, $$0 -> {
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
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.l.aX().c(wu.c("narrator.joining"));
      }

      $$0.a(this.o, this.x, this.m / 2, this.n / 2 - 50, 16777215);
   }
}
