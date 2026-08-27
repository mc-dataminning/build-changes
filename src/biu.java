import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;

public class biu<T> implements bhz, bit<T>, AutoCloseable, Runnable {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 1;
   private static final int c = 2;
   private final AtomicInteger d = new AtomicInteger(0);
   private final biw<? super T, ? extends Runnable> e;
   private final Executor f;
   private final String g;

   public static biu<Runnable> a(Executor $$0, String $$1) {
      return new biu<>(new biw.c<>(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   public biu(biw<? super T, ? extends Runnable> $$0, Executor $$1, String $$2) {
      this.f = $$1;
      this.e = $$0;
      this.g = $$2;
      bhx.a.a(this);
   }

   private boolean d() {
      int $$0;
      do {
         $$0 = this.d.get();
         if (($$0 & 3) != 0) {
            return false;
         }
      } while (!this.d.compareAndSet($$0, $$0 | 2));

      return true;
   }

   private void e() {
      int $$0;
      do {
         $$0 = this.d.get();
      } while (!this.d.compareAndSet($$0, $$0 & -3));
   }

   private boolean f() {
      return (this.d.get() & 1) != 0 ? false : !this.e.b();
   }

   @Override
   public void close() {
      int $$0;
      do {
         $$0 = this.d.get();
      } while (!this.d.compareAndSet($$0, $$0 | 1));
   }

   private boolean g() {
      return (this.d.get() & 2) != 0;
   }

   private boolean h() {
      if (!this.g()) {
         return false;
      } else {
         Runnable $$0 = this.e.a();
         if ($$0 == null) {
            return false;
         } else {
            ac.a(this.g, $$0).run();
            return true;
         }
      }
   }

   @Override
   public void run() {
      try {
         this.a($$0 -> $$0 == 0);
      } finally {
         this.e();
         this.i();
      }
   }

   public void a() {
      try {
         this.a($$0 -> true);
      } finally {
         this.e();
         this.i();
      }
   }

   @Override
   public void a(T $$0) {
      this.e.a($$0);
      this.i();
   }

   private void i() {
      if (this.f() && this.d()) {
         try {
            this.f.execute(this);
         } catch (RejectedExecutionException var4) {
            try {
               this.f.execute(this);
            } catch (RejectedExecutionException var3) {
               a.error("Cound not schedule mailbox", var3);
            }
         }
      }
   }

   private int a(Int2BooleanFunction $$0) {
      int $$1 = 0;

      while ($$0.get($$1) && this.h()) {
         $$1++;
      }

      return $$1;
   }

   public int b() {
      return this.e.c();
   }

   public boolean c() {
      return this.g() && !this.e.b();
   }

   @Override
   public String toString() {
      return this.g + " " + this.d.get() + " " + this.e.b();
   }

   @Override
   public String bs() {
      return this.g;
   }

   @Override
   public List<bhw> bp() {
      return ImmutableList.of(bhw.a(this.g + "-queue-size", bhv.c, this::b));
   }
}
