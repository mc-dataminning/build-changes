import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbt extends fcz {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vf a = vf.c("connect.aborted");
   public static final vf b = vf.a("disconnect.genericReason", vf.c("disconnect.unknownHost"));
   @Nullable
   volatile ug m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fcz p;
   private vf q = vf.c("connect.connecting");
   private long r = -1L;
   final vf t;

   private fbt(fcz $$0, vf $$1) {
      super(euy.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fcz $$0, evg $$1, fpd $$2, fob $$3, boolean $$4) {
      if ($$1.y instanceof fbt) {
         k.error("Attempt to connect while already connecting");
      } else {
         fbt $$5 = new fbt($$0, $$4 ? fso.a : ve.q);
         $$1.y();
         $$1.aR();
         $$1.a(foq.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fsp.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final evg $$0, final fpd $$1, @Nullable final fob $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fbt.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fpf.a.a($$1).map(fpc::d);
               if (fbt.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fcb(fbt.this.p, fbt.this.t, fbt.b)));
                  return;
               }

               $$0 = $$1.get();
               ug $$2;
               synchronized (fbt.this) {
                  if (fbt.this.o) {
                     return;
                  }

                  $$2 = new ug(xg.b);
                  $$2.a($$0.aN().l());
                  fbt.this.n = ug.a($$0, $$0.m.aw(), $$2);
               }

               fbt.this.n.syncUninterruptibly();
               synchronized (fbt.this) {
                  if (fbt.this.o) {
                     $$2.a(fbt.a);
                     return;
                  }

                  fbt.this.m = $$2;
                  $$0.ac().a($$2, $$2 != null ? a($$2.b()) : ghe.c.a);
               }

               fbt.this.m.a($$0.getHostName(), $$0.getPort(), new fnp(fbt.this.m, $$0, $$2, fbt.this.p, false, null, fbt.this::a));
               fbt.this.m.a(new afu($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (fbt.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fbt.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fcb(fbt.this.p, fbt.this.t, vf.a("disconnect.genericReason", $$8))));
            }
         }

         private static ghe.c a(fob.a $$0x) {
            return switch ($$0) {
               case a -> ghe.c.b;
               case b -> ghe.c.c;
               case c -> ghe.c.a;
            };
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(vf $$0) {
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
   public boolean aL_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.d(exe.a(ve.e, $$0 -> {
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aV().c(vf.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
