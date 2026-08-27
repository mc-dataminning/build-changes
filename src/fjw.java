import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjw extends fld {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final wu a = wu.c("connect.aborted");
   public static final wu b = wu.a("disconnect.genericReason", wu.c("disconnect.unknownHost"));
   @Nullable
   volatile vs s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fld w;
   private wu x = wu.c("connect.connecting");
   private long y = -1L;
   final wu z;

   private fjw(fld $$0, wu $$1) {
      super(fcw.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fld $$0, fde $$1, fxn $$2, fwk $$3, boolean $$4, @Nullable fwo $$5) {
      if ($$1.y instanceof fjw) {
         d.error("Attempt to connect while already connecting");
      } else {
         wu $$6;
         if ($$5 != null) {
            $$6 = wt.q;
         } else if ($$4) {
            $$6 = gax.a;
         } else {
            $$6 = wt.r;
         }

         fjw $$9 = new fjw($$0, $$6);
         if ($$5 != null) {
            $$9.a(wu.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(fxb.a($$3.b));
         $$1.bd().a(gay.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fde $$0, final fxn $$1, final fwk $$2, @Nullable final fwo $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fjw.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fxp.a.a($$1).map(fxm::d);
               if (fjw.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fke(fjw.this.w, fjw.this.z, fjw.b)));
                  return;
               }

               $$0 = $$1.get();
               vs $$2;
               synchronized (fjw.this) {
                  if (fjw.this.v) {
                     return;
                  }

                  $$2 = new vs(zc.b);
                  $$2.a($$0.aQ().n());
                  fjw.this.u = vs.a($$0, $$0.m.az(), $$2);
               }

               fjw.this.u.syncUninterruptibly();
               synchronized (fjw.this) {
                  if (fjw.this.v) {
                     $$2.a(fjw.a);
                     return;
                  }

                  fjw.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fjw.this.s
                  .a($$0.getHostName(), $$0.getPort(), ail.a, ail.b, new fvv(fjw.this.s, $$0, $$2, fjw.this.w, false, null, fjw.this::a, $$3), $$3 != null);
               fjw.this.s.a(new aio($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fjw.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fjw.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fke(fjw.this.w, fjw.this.z, wu.a("disconnect.genericReason", $$8))));
            }
         }

         private static gps.c a(fwk.a $$0x) {
            return switch ($$0) {
               case a -> gps.c.b;
               case b -> gps.c.c;
               case c -> gps.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
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
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.c(ffe.a(wt.e, $$0 -> {
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aZ().c(wu.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
