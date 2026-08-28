import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flv extends fnc {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final xo a = xo.c("connect.aborted");
   public static final xo b = xo.a("disconnect.genericReason", xo.c("disconnect.unknownHost"));
   @Nullable
   volatile wj s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fnc w;
   private xo x = xo.c("connect.connecting");
   private long y = -1L;
   final xo z;

   private flv(fnc $$0, xo $$1) {
      super(few.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fnc $$0, ffe $$1, fzl $$2, fyi $$3, boolean $$4, @Nullable fym $$5) {
      if ($$1.y instanceof flv) {
         d.error("Attempt to connect while already connecting");
      } else {
         xo $$6;
         if ($$5 != null) {
            $$6 = xn.q;
         } else if ($$4) {
            $$6 = gcw.a;
         } else {
            $$6 = xn.r;
         }

         flv $$9 = new flv($$0, $$6);
         if ($$5 != null) {
            $$9.a(xo.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fyz.a($$3.b));
         $$1.bb().a(gcx.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final ffe $$0, final fzl $$1, final fyi $$2, @Nullable final fym $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (flv.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fzn.a.a($$1).map(fzk::d);
               if (flv.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fmd(flv.this.w, flv.this.z, flv.b)));
                  return;
               }

               $$0 = $$1.get();
               wj $$2;
               synchronized (flv.this) {
                  if (flv.this.v) {
                     return;
                  }

                  $$2 = new wj(zw.b);
                  $$2.a($$0.aP().n());
                  flv.this.u = wj.a($$0, $$0.m.az(), $$2);
               }

               flv.this.u.syncUninterruptibly();
               synchronized (flv.this) {
                  if (flv.this.v) {
                     $$2.a(flv.a);
                     return;
                  }

                  flv.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               flv.this.s
                  .a($$0.getHostName(), $$0.getPort(), aji.a, aji.b, new fxt(flv.this.s, $$0, $$2, flv.this.w, false, null, flv.this::a, $$3), $$3 != null);
               flv.this.s.a(new ajl($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (flv.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               flv.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fmd(flv.this.w, flv.this.z, xo.a("disconnect.genericReason", $$8))));
            }
         }

         private static grs.c a(fyi.a $$0x) {
            return switch ($$0) {
               case a -> grs.c.b;
               case b -> grs.c.c;
               case c -> grs.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xo $$0) {
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
   public boolean aC_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.c(fhd.a(xn.e, $$0 -> {
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aX().c(xo.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
