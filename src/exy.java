import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exy extends ezd {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final ui a = ui.c("connect.aborted");
   public static final ui b = ui.a("disconnect.genericReason", ui.c("disconnect.unknownHost"));
   @Nullable
   volatile tj m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final ezd p;
   private ui q = ui.c("connect.connecting");
   private long s = -1L;
   final ui t;

   private exy(ezd $$0, ui $$1) {
      super(erg.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(ezd $$0, ero $$1, fld $$2, fkc $$3, boolean $$4) {
      if ($$1.y instanceof exy) {
         k.error("Attempt to connect while already connecting");
      } else {
         exy $$5 = new exy($$0, $$4 ? foj.a : uh.q);
         $$1.z();
         $$1.aR();
         $$1.a(fkr.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fok.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final ero $$0, final fld $$1, @Nullable final fkc $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (exy.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = flf.a.a($$1).map(flc::d);
               if (exy.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new eyg(exy.this.p, exy.this.t, exy.b)));
                  return;
               }

               $$0 = $$1.get();
               tj $$2;
               synchronized (exy.this) {
                  if (exy.this.o) {
                     return;
                  }

                  $$2 = new tj(wc.b);
                  $$2.a($$0.aN().l());
                  exy.this.n = tj.a($$0, $$0.m.av(), $$2);
               }

               exy.this.n.syncUninterruptibly();
               synchronized (exy.this) {
                  if (exy.this.o) {
                     $$2.a(exy.a);
                     return;
                  }

                  exy.this.m = $$2;
               }

               exy.this.m.a($$0.getHostName(), $$0.getPort(), new fjq(exy.this.m, $$0, $$2, exy.this.p, false, null, exy.this::a));
               exy.this.m.a(new aek($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (exy.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               exy.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new eyg(exy.this.p, exy.this.t, ui.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(ui $$0) {
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
   public boolean aB_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.d(etj.a(uh.e, $$0 -> {
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
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aV().c(ui.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
