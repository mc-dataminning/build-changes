import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class bir<R extends Runnable> implements bhz, bit<R>, Executor {
   private final String b;
   private static final Logger c = LogUtils.getLogger();
   private final Queue<R> d = Queues.newConcurrentLinkedQueue();
   private int e;

   protected bir(String $$0) {
      this.b = $$0;
      bhx.a.a(this);
   }

   protected abstract R f(Runnable var1);

   protected abstract boolean e(R var1);

   public boolean bq() {
      return Thread.currentThread() == this.aw();
   }

   protected abstract Thread aw();

   protected boolean av() {
      return !this.bq();
   }

   public int br() {
      return this.d.size();
   }

   @Override
   public String bs() {
      return this.b;
   }

   public <V> CompletableFuture<V> a(Supplier<V> $$0) {
      return this.av() ? CompletableFuture.supplyAsync($$0, this) : CompletableFuture.completedFuture($$0.get());
   }

   private CompletableFuture<Void> a(Runnable $$0) {
      return CompletableFuture.supplyAsync(() -> {
         $$0.run();
         return null;
      }, this);
   }

   public CompletableFuture<Void> g(Runnable $$0) {
      if (this.av()) {
         return this.a($$0);
      } else {
         $$0.run();
         return CompletableFuture.completedFuture(null);
      }
   }

   public void h(Runnable $$0) {
      if (!this.bq()) {
         this.a($$0).join();
      } else {
         $$0.run();
      }
   }

   public void i(R $$0) {
      this.d.add($$0);
      LockSupport.unpark(this.aw());
   }

   @Override
   public void execute(Runnable $$0) {
      if (this.av()) {
         this.i(this.f($$0));
      } else {
         $$0.run();
      }
   }

   public void c(Runnable $$0) {
      this.execute($$0);
   }

   protected void bt() {
      this.d.clear();
   }

   protected void bu() {
      while (this.x()) {
      }
   }

   public boolean x() {
      R $$0 = this.d.peek();
      if ($$0 == null) {
         return false;
      } else if (this.e == 0 && !this.e($$0)) {
         return false;
      } else {
         this.d(this.d.remove());
         return true;
      }
   }

   public void c(BooleanSupplier $$0) {
      this.e++;

      try {
         while (!$$0.getAsBoolean()) {
            if (!this.x()) {
               this.bv();
            }
         }
      } finally {
         this.e--;
      }
   }

   protected void bv() {
      Thread.yield();
      LockSupport.parkNanos("waiting for tasks", 100000L);
   }

   protected void d(R $$0) {
      try {
         $$0.run();
      } catch (Exception var3) {
         c.error(LogUtils.FATAL_MARKER, "Error executing task on {}", this.bs(), var3);
      }
   }

   @Override
   public List<bhw> bp() {
      return ImmutableList.of(bhw.a(this.b + "-pending-tasks", bhv.b, this::br));
   }
}
