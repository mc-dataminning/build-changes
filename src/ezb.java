import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezb extends fah {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final ur a = ur.c("connect.aborted");
   public static final ur b = ur.a("disconnect.genericReason", ur.c("disconnect.unknownHost"));
   @Nullable
   volatile ts m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fah p;
   private ur q = ur.c("connect.connecting");
   private long r = -1L;
   final ur t;

   private ezb(fah $$0, ur $$1) {
      super(esj.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fah $$0, esr $$1, fmi $$2, flh $$3, boolean $$4) {
      if ($$1.y instanceof ezb) {
         k.error("Attempt to connect while already connecting");
      } else {
         ezb $$5 = new ezb($$0, $$4 ? fpq.a : uq.q);
         $$1.y();
         $$1.aQ();
         $$1.a(flw.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aY().a(fpr.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final esr $$0, final fmi $$1, @Nullable final flh $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ezb.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fmk.a.a($$1).map(fmh::d);
               if (ezb.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new ezj(ezb.this.p, ezb.this.t, ezb.b)));
                  return;
               }

               $$0 = $$1.get();
               ts $$2;
               synchronized (ezb.this) {
                  if (ezb.this.o) {
                     return;
                  }

                  $$2 = new ts(wl.b);
                  $$2.a($$0.aM().l());
                  ezb.this.n = ts.a($$0, $$0.m.aw(), $$2);
               }

               ezb.this.n.syncUninterruptibly();
               synchronized (ezb.this) {
                  if (ezb.this.o) {
                     $$2.a(ezb.a);
                     return;
                  }

                  ezb.this.m = $$2;
               }

               ezb.this.m.a($$0.getHostName(), $$0.getPort(), new fkv(ezb.this.m, $$0, $$2, ezb.this.p, false, null, ezb.this::a));
               ezb.this.m.a(new aeu($$0.U().c(), $$0.U().b()));
            } catch (Exception var9) {
               if (ezb.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ezb.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ezj(ezb.this.p, ezb.this.t, ur.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(ur $$0) {
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
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.d(eum.a(uq.e, $$0 -> {
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
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aU().c(ur.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
