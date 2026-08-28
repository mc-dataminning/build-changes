import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;

public abstract class bqv<T extends Runnable> implements bqd, brc<T>, Runnable {
   private static final Logger a = LogUtils.getLogger();
   private final AtomicReference<bqv.a> b = new AtomicReference<>(bqv.a.a);
   private final brb<T> c;
   private final Executor d;
   private final String e;

   public bqv(brb<T> $$0, Executor $$1, String $$2) {
      this.d = $$1;
      this.c = $$0;
      this.e = $$2;
      bqb.a.a(this);
   }

   private boolean e() {
      return !this.k() && !this.c.b();
   }

   @Override
   public void close() {
      this.b.set(bqv.a.c);
   }

   private boolean f() {
      if (!this.j()) {
         return false;
      } else {
         Runnable $$0 = this.c.a();
         if ($$0 == null) {
            return false;
         } else {
            ae.a($$0, this.e);
            return true;
         }
      }
   }

   @Override
   public void run() {
      try {
         this.f();
      } finally {
         this.i();
         this.g();
      }
   }

   public void a() {
      try {
         while (this.f()) {
         }
      } finally {
         this.i();
         this.g();
      }
   }

   @Override
   public void a_(T $$0) {
      this.c.a($$0);
      this.g();
   }

   private void g() {
      if (this.e() && this.h()) {
         try {
            this.d.execute(this);
         } catch (RejectedExecutionException var4) {
            try {
               this.d.execute(this);
            } catch (RejectedExecutionException var3) {
               a.error("Could not schedule ConsecutiveExecutor", var3);
            }
         }
      }
   }

   public int b() {
      return this.c.c();
   }

   public boolean c() {
      return this.j() && !this.c.b();
   }

   @Override
   public String toString() {
      return this.e + " " + this.b.get() + " " + this.c.b();
   }

   @Override
   public String x_() {
      return this.e;
   }

   @Override
   public List<bqa> bw() {
      return ImmutableList.of(bqa.a(this.e + "-queue-size", bpz.c, this::b));
   }

   private boolean h() {
      return this.b.compareAndSet(bqv.a.a, bqv.a.b);
   }

   private void i() {
      this.b.compareAndSet(bqv.a.b, bqv.a.a);
   }

   private boolean j() {
      return this.b.get() == bqv.a.b;
   }

   private boolean k() {
      return this.b.get() == bqv.a.c;
   }

   static enum a {
      a,
      b,
      c;
   }
}
