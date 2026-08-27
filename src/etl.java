import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etl extends euq {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final long k = 2000L;
   public static final sw a = sw.a("disconnect.genericReason", sw.c("disconnect.unknownHost"));
   @Nullable
   volatile sd l;
   volatile boolean m;
   final euq n;
   private sw o = sw.c("connect.connecting");
   private long p = -1L;
   final sw q;

   private etl(euq $$0, sw $$1) {
      super(enf.a);
      this.n = $$0;
      this.q = $$1;
   }

   public static void a(euq $$0, enn $$1, fga $$2, ffd $$3, boolean $$4) {
      if ($$1.z instanceof etl) {
         c.error("Attempt to connect while already connecting");
      } else {
         etl $$5 = new etl($$0, $$4 ? fjf.a : sv.p);
         $$1.y();
         $$1.aQ();
         $$1.a(ffq.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aY().a(fjg.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final enn $$0, final fga $$1, @Nullable final ffd $$2) {
      c.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + b.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (etl.this.m) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fgc.a.a($$1).map(ffz::d);
               if (etl.this.m) {
                  return;
               }

               if (!$$1.isPresent()) {
                  $$0.execute(() -> $$0.a(new ett(etl.this.n, etl.this.q, etl.a)));
                  return;
               }

               $$0 = $$1.get();
               synchronized (etl.this) {
                  if (etl.this.m) {
                     return;
                  }

                  etl.this.l = sd.a($$0, $$0.m.at());
                  etl.this.l.a(new fev(etl.this.l, $$0, $$2, etl.this.n, false, null, etl.this::a));
                  etl.this.l.a(new abb($$0.getHostName(), $$0.getPort(), se.d));
                  etl.this.l.a(new abm($$0.U().c(), Optional.ofNullable($$0.U().g())));
               }
            } catch (Exception var7) {
               if (etl.this.m) {
                  return;
               }

               Exception $$4;
               if (var7.getCause() instanceof Exception $$3) {
                  $$4 = $$3;
               } else {
                  $$4 = var7;
               }

               etl.c.error("Couldn't connect to server", var7);
               String $$6 = $$0 == null
                  ? $$4.getMessage()
                  : $$4.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ett(etl.this.n, etl.this.q, sw.a("disconnect.genericReason", $$6))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(c));
      $$3.start();
   }

   private void a(sw $$0) {
      this.o = $$0;
   }

   @Override
   public void f() {
      if (this.l != null) {
         if (this.l.h()) {
            this.l.a();
         } else {
            this.l.m();
         }
      }
   }

   @Override
   public boolean av_() {
      return false;
   }

   @Override
   protected void b() {
      this.d(epi.a(sv.e, $$0 -> {
         synchronized (this) {
            this.m = true;
            if (this.l != null) {
               this.l.a(sw.c("connect.aborted"));
            }
         }

         this.f.a(this.n);
      }).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      long $$4 = ac.b();
      if ($$4 - this.p > 2000L) {
         this.p = $$4;
         this.f.aU().c(sw.c("narrator.joining"));
      }

      $$0.a(this.i, this.o, this.g / 2, this.h / 2 - 50, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }
}
