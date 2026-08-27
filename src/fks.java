import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fks extends flz {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final wx a = wx.c("connect.aborted");
   public static final wx b = wx.a("disconnect.genericReason", wx.c("disconnect.unknownHost"));
   @Nullable
   volatile vv s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final flz w;
   private wx x = wx.c("connect.connecting");
   private long y = -1L;
   final wx z;

   private fks(flz $$0, wx $$1) {
      super(fdt.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(flz $$0, feb $$1, fyi $$2, fxf $$3, boolean $$4, @Nullable fxj $$5) {
      if ($$1.y instanceof fks) {
         d.error("Attempt to connect while already connecting");
      } else {
         wx $$6;
         if ($$5 != null) {
            $$6 = ww.q;
         } else if ($$4) {
            $$6 = gbt.a;
         } else {
            $$6 = ww.r;
         }

         fks $$9 = new fks($$0, $$6);
         if ($$5 != null) {
            $$9.a(wx.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fxw.a($$3.b));
         $$1.bb().a(gbu.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final feb $$0, final fyi $$1, final fxf $$2, @Nullable final fxj $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fks.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fyk.a.a($$1).map(fyh::d);
               if (fks.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fla(fks.this.w, fks.this.z, fks.b)));
                  return;
               }

               $$0 = $$1.get();
               vv $$2;
               synchronized (fks.this) {
                  if (fks.this.v) {
                     return;
                  }

                  $$2 = new vv(zf.b);
                  $$2.a($$0.aP().n());
                  fks.this.u = vv.a($$0, $$0.m.az(), $$2);
               }

               fks.this.u.syncUninterruptibly();
               synchronized (fks.this) {
                  if (fks.this.v) {
                     $$2.a(fks.a);
                     return;
                  }

                  fks.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fks.this.s
                  .a($$0.getHostName(), $$0.getPort(), air.a, air.b, new fwq(fks.this.s, $$0, $$2, fks.this.w, false, null, fks.this::a, $$3), $$3 != null);
               fks.this.s.a(new aiu($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fks.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fks.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fla(fks.this.w, fks.this.z, wx.a("disconnect.genericReason", $$8))));
            }
         }

         private static gqp.c a(fxf.a $$0x) {
            return switch ($$0) {
               case a -> gqp.c.b;
               case b -> gqp.c.c;
               case c -> gqp.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wx $$0) {
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
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.c(fga.a(ww.e, $$0 -> {
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
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aX().c(wx.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
