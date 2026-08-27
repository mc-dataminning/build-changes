import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezt extends faz {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final uv a = uv.c("connect.aborted");
   public static final uv b = uv.a("disconnect.genericReason", uv.c("disconnect.unknownHost"));
   @Nullable
   volatile tw m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final faz p;
   private uv q = uv.c("connect.connecting");
   private long r = -1L;
   final uv t;

   private ezt(faz $$0, uv $$1) {
      super(eta.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(faz $$0, eti $$1, fna $$2, flz $$3, boolean $$4) {
      if ($$1.y instanceof ezt) {
         k.error("Attempt to connect while already connecting");
      } else {
         ezt $$5 = new ezt($$0, $$4 ? fqi.a : uu.q);
         $$1.y();
         $$1.aQ();
         $$1.a(fmo.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aY().a(fqj.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eti $$0, final fna $$1, @Nullable final flz $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ezt.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fnc.a.a($$1).map(fmz::d);
               if (ezt.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fab(ezt.this.p, ezt.this.t, ezt.b)));
                  return;
               }

               $$0 = $$1.get();
               tw $$2;
               synchronized (ezt.this) {
                  if (ezt.this.o) {
                     return;
                  }

                  $$2 = new tw(wp.b);
                  $$2.a($$0.aM().l());
                  ezt.this.n = tw.a($$0, $$0.m.aw(), $$2);
               }

               ezt.this.n.syncUninterruptibly();
               synchronized (ezt.this) {
                  if (ezt.this.o) {
                     $$2.a(ezt.a);
                     return;
                  }

                  ezt.this.m = $$2;
               }

               ezt.this.m.a($$0.getHostName(), $$0.getPort(), new fln(ezt.this.m, $$0, $$2, ezt.this.p, false, null, ezt.this::a));
               ezt.this.m.a(new afa($$0.U().c(), $$0.U().b()));
            } catch (Exception var9) {
               if (ezt.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ezt.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fab(ezt.this.p, ezt.this.t, uv.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(uv $$0) {
      this.q = $$0;
   }

   @Override
   public void d() {
      if (this.m != null) {
         if (this.m.k()) {
            this.m.d();
         } else {
            this.m.p();
         }
      }
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aQ_() {
      this.d(eve.a(uu.e, $$0 -> {
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
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aU().c(uv.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
