import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exg extends eym {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final tn a = tn.c("connect.aborted");
   public static final tn b = tn.a("disconnect.genericReason", tn.c("disconnect.unknownHost"));
   @Nullable
   volatile so m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final eym p;
   private tn q = tn.c("connect.connecting");
   private long s = -1L;
   final tn t;

   private exg(eym $$0, tn $$1) {
      super(eqp.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(eym $$0, eqx $$1, fkk $$2, fjj $$3, boolean $$4) {
      if ($$1.y instanceof exg) {
         k.error("Attempt to connect while already connecting");
      } else {
         exg $$5 = new exg($$0, $$4 ? fnp.a : tm.q);
         $$1.z();
         $$1.aR();
         $$1.a(fjy.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fnq.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eqx $$0, final fkk $$1, @Nullable final fjj $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (exg.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fkm.a.a($$1).map(fkj::d);
               if (exg.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new exo(exg.this.p, exg.this.t, exg.b)));
                  return;
               }

               $$0 = $$1.get();
               so $$2;
               synchronized (exg.this) {
                  if (exg.this.o) {
                     return;
                  }

                  $$2 = new so(vg.b);
                  $$2.a($$0.aN().l());
                  exg.this.n = so.a($$0, $$0.m.av(), $$2);
               }

               exg.this.n.syncUninterruptibly();
               synchronized (exg.this) {
                  if (exg.this.o) {
                     $$2.a(exg.a);
                     return;
                  }

                  exg.this.m = $$2;
               }

               exg.this.m.a($$0.getHostName(), $$0.getPort(), new fiy(exg.this.m, $$0, $$2, exg.this.p, false, null, exg.this::a));
               exg.this.m.a(new ado($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (exg.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               exg.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new exo(exg.this.p, exg.this.t, tn.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(tn $$0) {
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
   public boolean ay_() {
      return false;
   }

   @Override
   protected void aH_() {
      this.d(ess.a(tm.e, $$0 -> {
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
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aV().c(tn.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
