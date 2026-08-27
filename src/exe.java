import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exe extends eyk {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final tl a = tl.c("connect.aborted");
   public static final tl b = tl.a("disconnect.genericReason", tl.c("disconnect.unknownHost"));
   @Nullable
   volatile sm m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final eyk p;
   private tl q = tl.c("connect.connecting");
   private long s = -1L;
   final tl t;

   private exe(eyk $$0, tl $$1) {
      super(eqn.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(eyk $$0, eqv $$1, fki $$2, fjh $$3, boolean $$4) {
      if ($$1.y instanceof exe) {
         k.error("Attempt to connect while already connecting");
      } else {
         exe $$5 = new exe($$0, $$4 ? fnn.a : tk.q);
         $$1.z();
         $$1.aR();
         $$1.a(fjw.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fno.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eqv $$0, final fki $$1, @Nullable final fjh $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (exe.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fkk.a.a($$1).map(fkh::d);
               if (exe.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new exm(exe.this.p, exe.this.t, exe.b)));
                  return;
               }

               $$0 = $$1.get();
               sm $$2;
               synchronized (exe.this) {
                  if (exe.this.o) {
                     return;
                  }

                  $$2 = new sm(ve.b);
                  $$2.a($$0.aN().l());
                  exe.this.n = sm.a($$0, $$0.m.av(), $$2);
               }

               exe.this.n.syncUninterruptibly();
               synchronized (exe.this) {
                  if (exe.this.o) {
                     $$2.a(exe.a);
                     return;
                  }

                  exe.this.m = $$2;
               }

               exe.this.m.a($$0.getHostName(), $$0.getPort(), new fiw(exe.this.m, $$0, $$2, exe.this.p, false, null, exe.this::a));
               exe.this.m.a(new adn($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (exe.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               exe.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new exm(exe.this.p, exe.this.t, tl.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(tl $$0) {
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
   protected void aI_() {
      this.d(esq.a(tk.e, $$0 -> {
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aV().c(tl.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
