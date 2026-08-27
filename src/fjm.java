import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjm extends fkt {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final ws a = ws.c("connect.aborted");
   public static final ws b = ws.a("disconnect.genericReason", ws.c("disconnect.unknownHost"));
   @Nullable
   volatile vq s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fkt w;
   private ws x = ws.c("connect.connecting");
   private long y = -1L;
   final ws z;

   private fjm(fkt $$0, ws $$1) {
      super(fcm.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fkt $$0, fcu $$1, fxd $$2, fwa $$3, boolean $$4, @Nullable fwe $$5) {
      if ($$1.y instanceof fjm) {
         d.error("Attempt to connect while already connecting");
      } else {
         ws $$6;
         if ($$5 != null) {
            $$6 = wr.q;
         } else if ($$4) {
            $$6 = gan.a;
         } else {
            $$6 = wr.r;
         }

         fjm $$9 = new fjm($$0, $$6);
         if ($$5 != null) {
            $$9.a(ws.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fwr.a($$3.b));
         $$1.bc().a(gao.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fcu $$0, final fxd $$1, final fwa $$2, @Nullable final fwe $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fjm.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fxf.a.a($$1).map(fxc::d);
               if (fjm.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fju(fjm.this.w, fjm.this.z, fjm.b)));
                  return;
               }

               $$0 = $$1.get();
               vq $$2;
               synchronized (fjm.this) {
                  if (fjm.this.v) {
                     return;
                  }

                  $$2 = new vq(za.b);
                  $$2.a($$0.aP().n());
                  fjm.this.u = vq.a($$0, $$0.m.az(), $$2);
               }

               fjm.this.u.syncUninterruptibly();
               synchronized (fjm.this) {
                  if (fjm.this.v) {
                     $$2.a(fjm.a);
                     return;
                  }

                  fjm.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fjm.this.s
                  .a($$0.getHostName(), $$0.getPort(), aij.a, aij.b, new fvl(fjm.this.s, $$0, $$2, fjm.this.w, false, null, fjm.this::a, $$3), $$3 != null);
               fjm.this.s.a(new aim($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fjm.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fjm.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fju(fjm.this.w, fjm.this.z, ws.a("disconnect.genericReason", $$8))));
            }
         }

         private static gph.c a(fwa.a $$0x) {
            return switch ($$0) {
               case a -> gph.c.b;
               case b -> gph.c.c;
               case c -> gph.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(ws $$0) {
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
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.c(feu.a(wr.e, $$0 -> {
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
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aY().c(ws.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
