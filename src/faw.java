import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faw extends fcc {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vb a = vb.c("connect.aborted");
   public static final vb b = vb.a("disconnect.genericReason", vb.c("disconnect.unknownHost"));
   @Nullable
   volatile uc m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fcc p;
   private vb q = vb.c("connect.connecting");
   private long r = -1L;
   final vb t;

   private faw(fcc $$0, vb $$1) {
      super(euc.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fcc $$0, euk $$1, fof $$2, fne $$3, boolean $$4) {
      if ($$1.y instanceof faw) {
         k.error("Attempt to connect while already connecting");
      } else {
         faw $$5 = new faw($$0, $$4 ? frr.a : va.q);
         $$1.y();
         $$1.aQ();
         $$1.a(fnt.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aY().a(frs.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final euk $$0, final fof $$1, @Nullable final fne $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (faw.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = foh.a.a($$1).map(foe::d);
               if (faw.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fbe(faw.this.p, faw.this.t, faw.b)));
                  return;
               }

               $$0 = $$1.get();
               uc $$2;
               synchronized (faw.this) {
                  if (faw.this.o) {
                     return;
                  }

                  $$2 = new uc(wv.b);
                  $$2.a($$0.aM().l());
                  faw.this.n = uc.a($$0, $$0.m.aw(), $$2);
               }

               faw.this.n.syncUninterruptibly();
               synchronized (faw.this) {
                  if (faw.this.o) {
                     $$2.a(faw.a);
                     return;
                  }

                  faw.this.m = $$2;
               }

               faw.this.m.a($$0.getHostName(), $$0.getPort(), new fms(faw.this.m, $$0, $$2, faw.this.p, false, null, faw.this::a));
               faw.this.m.a(new afh($$0.U().c(), $$0.U().b()));
            } catch (Exception var9) {
               if (faw.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               faw.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fbe(faw.this.p, faw.this.t, vb.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(vb $$0) {
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
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.d(ewh.a(va.e, $$0 -> {
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aU().c(vb.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
