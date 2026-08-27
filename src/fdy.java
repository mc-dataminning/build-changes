import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdy extends ffe {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vq a = vq.c("connect.aborted");
   public static final vq b = vq.a("disconnect.genericReason", vq.c("disconnect.unknownHost"));
   @Nullable
   volatile uo m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final ffe p;
   private vq q = vq.c("connect.connecting");
   private long r = -1L;
   final vq t;

   private fdy(ffe $$0, vq $$1) {
      super(ewz.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(ffe $$0, exh $$1, frk $$2, fqi $$3, boolean $$4, @Nullable fql $$5) {
      if ($$1.y instanceof fdy) {
         k.error("Attempt to connect while already connecting");
      } else {
         vq $$6;
         if ($$5 != null) {
            $$6 = vp.q;
         } else if ($$4) {
            $$6 = fuv.a;
         } else {
            $$6 = vp.r;
         }

         fdy $$9 = new fdy($$0, $$6);
         if ($$5 != null) {
            $$9.a(vq.c("connect.transferring"));
         }

         $$1.y();
         $$1.aR();
         $$1.a(fqy.a($$3.b));
         $$1.ba().a(fuw.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final exh $$0, final frk $$1, final fqi $$2, @Nullable final fql $$3) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fdy.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = frm.a.a($$1).map(frj::d);
               if (fdy.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new feg(fdy.this.p, fdy.this.t, fdy.b)));
                  return;
               }

               $$0 = $$1.get();
               uo $$2;
               synchronized (fdy.this) {
                  if (fdy.this.o) {
                     return;
                  }

                  $$2 = new uo(xy.b);
                  $$2.a($$0.aN().l());
                  fdy.this.n = uo.a($$0, $$0.m.aw(), $$2);
               }

               fdy.this.n.syncUninterruptibly();
               synchronized (fdy.this) {
                  if (fdy.this.o) {
                     $$2.a(fdy.a);
                     return;
                  }

                  fdy.this.m = $$2;
                  $$0.ac().a($$2, a($$2.b()));
               }

               fdy.this.m
                  .a($$0.getHostName(), $$0.getPort(), ahd.a, ahd.b, new fpw(fdy.this.m, $$0, $$2, fdy.this.p, false, null, fdy.this::a, $$3), $$3 != null);
               fdy.this.m.a(new ahg($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (fdy.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fdy.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new feg(fdy.this.p, fdy.this.t, vq.a("disconnect.genericReason", $$8))));
            }
         }

         private static gjn.c a(fqi.a $$0x) {
            return switch ($$0) {
               case a -> gjn.c.b;
               case b -> gjn.c.c;
               case c -> gjn.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(k));
      $$4.start();
   }

   private void a(vq $$0) {
      this.q = $$0;
   }

   @Override
   public void e() {
      if (this.m != null) {
         if (this.m.i()) {
            this.m.b();
         } else {
            this.m.n();
         }
      }
   }

   @Override
   public boolean aO_() {
      return false;
   }

   @Override
   protected void aQ_() {
      this.d(ezh.a(vp.e, $$0 -> {
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
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aW().c(vq.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
