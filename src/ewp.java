import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewp extends exv {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final te a = te.c("connect.aborted");
   public static final te b = te.a("disconnect.genericReason", te.c("disconnect.unknownHost"));
   @Nullable
   volatile sf m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final exv p;
   private te q = te.c("connect.connecting");
   private long s = -1L;
   final te t;

   private ewp(exv $$0, te $$1) {
      super(eqf.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(exv $$0, eqn $$1, fjk $$2, fin $$3, boolean $$4) {
      if ($$1.z instanceof ewp) {
         k.error("Attempt to connect while already connecting");
      } else {
         ewp $$5 = new ewp($$0, $$4 ? fmp.a : td.q);
         $$1.y();
         $$1.aQ();
         $$1.a(fja.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aY().a(fmq.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eqn $$0, final fjk $$1, @Nullable final fin $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ewp.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fjm.a.a($$1).map(fjj::d);
               if (ewp.this.o) {
                  return;
               }

               if (!$$1.isPresent()) {
                  $$0.execute(() -> $$0.a(new ewx(ewp.this.p, ewp.this.t, ewp.b)));
                  return;
               }

               $$0 = $$1.get();
               sf $$2;
               synchronized (ewp.this) {
                  if (ewp.this.o) {
                     return;
                  }

                  $$2 = new sf(ux.b);
                  ewp.this.n = sf.a($$0, $$0.m.at(), $$2);
               }

               ewp.this.n.syncUninterruptibly();
               synchronized (ewp.this) {
                  if (ewp.this.o) {
                     $$2.a(ewp.a);
                     return;
                  }

                  ewp.this.m = $$2;
               }

               ewp.this.m.a($$0.getHostName(), $$0.getPort(), new fid(ewp.this.m, $$0, $$2, ewp.this.p, false, null, ewp.this::a));
               ewp.this.m.a(new adf($$0.U().c(), $$0.U().b()));
            } catch (Exception var9) {
               if (ewp.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ewp.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ewx(ewp.this.p, ewp.this.t, te.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(te $$0) {
      this.q = $$0;
   }

   @Override
   public void c() {
      if (this.m != null) {
         if (this.m.k()) {
            this.m.d();
         } else {
            this.m.p();
         }
      }
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected void aE_() {
      this.d(esi.a(td.e, $$0 -> {
         synchronized (this) {
            this.o = true;
            if (this.n != null) {
               this.n.cancel(true);
               this.n = null;
            }

            if (this.m != null) {
               this.m.a(a);
            }
         }

         this.f.a(this.p);
      }).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aU().c(te.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
