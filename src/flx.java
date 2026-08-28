import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flx extends fne {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final xp a = xp.c("connect.aborted");
   public static final xp b = xp.a("disconnect.genericReason", xp.c("disconnect.unknownHost"));
   @Nullable
   volatile wk s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fne w;
   private xp x = xp.c("connect.connecting");
   private long y = -1L;
   final xp z;

   private flx(fne $$0, xp $$1) {
      super(fey.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fne $$0, ffg $$1, fzn $$2, fyk $$3, boolean $$4, @Nullable fyo $$5) {
      if ($$1.y instanceof flx) {
         d.error("Attempt to connect while already connecting");
      } else {
         xp $$6;
         if ($$5 != null) {
            $$6 = xo.q;
         } else if ($$4) {
            $$6 = gcy.a;
         } else {
            $$6 = xo.r;
         }

         flx $$9 = new flx($$0, $$6);
         if ($$5 != null) {
            $$9.a(xp.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fzb.a($$3.b));
         $$1.bb().a(gcz.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final ffg $$0, final fzn $$1, final fyk $$2, @Nullable final fyo $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (flx.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fzp.a.a($$1).map(fzm::d);
               if (flx.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fmf(flx.this.w, flx.this.z, flx.b)));
                  return;
               }

               $$0 = $$1.get();
               wk $$2;
               synchronized (flx.this) {
                  if (flx.this.v) {
                     return;
                  }

                  $$2 = new wk(zx.b);
                  $$2.a($$0.aP().n());
                  flx.this.u = wk.a($$0, $$0.m.az(), $$2);
               }

               flx.this.u.syncUninterruptibly();
               synchronized (flx.this) {
                  if (flx.this.v) {
                     $$2.a(flx.a);
                     return;
                  }

                  flx.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               flx.this.s
                  .a($$0.getHostName(), $$0.getPort(), ajj.a, ajj.b, new fxv(flx.this.s, $$0, $$2, flx.this.w, false, null, flx.this::a, $$3), $$3 != null);
               flx.this.s.a(new ajm($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (flx.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               flx.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fmf(flx.this.w, flx.this.z, xp.a("disconnect.genericReason", $$8))));
            }
         }

         private static gru.c a(fyk.a $$0x) {
            return switch ($$0) {
               case a -> gru.c.b;
               case b -> gru.c.c;
               case c -> gru.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xp $$0) {
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
      this.c(fhf.a(xo.e, $$0 -> {
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aX().c(xp.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
