import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.CheckReturnValue;
import org.slf4j.Logger;

public abstract class brn<R extends Runnable> implements bqw, brt<R>, Executor {
   public static final long k = 100000L;
   private final String b;
   private static final Logger c = LogUtils.getLogger();
   private final Queue<R> d = Queues.newConcurrentLinkedQueue();
   private int e;

   protected brn(String $$0) {
      this.b = $$0;
      bqu.a.a(this);
   }

   protected abstract boolean e(R var1);

   public boolean bx() {
      return Thread.currentThread() == this.ay();
   }

   protected abstract Thread ay();

   protected boolean ax() {
      return !this.bx();
   }

   public int by() {
      return this.d.size();
   }

   @Override
   public String v_() {
      return this.b;
   }

   public <V> CompletableFuture<V> a(Supplier<V> $$0) {
      return this.ax() ? CompletableFuture.supplyAsync($$0, this) : CompletableFuture.completedFuture($$0.get());
   }

   private CompletableFuture<Void> b(Runnable $$0) {
      return CompletableFuture.supplyAsync(() -> {
         $$0.run();
         return null;
      }, this);
   }

   @CheckReturnValue
   public CompletableFuture<Void> g(Runnable $$0) {
      if (this.ax()) {
         return this.b($$0);
      } else {
         $$0.run();
         return CompletableFuture.completedFuture(null);
      }
   }

   public void h(Runnable $$0) {
      if (!this.bx()) {
         this.b($$0).join();
      } else {
         $$0.run();
      }
   }

   @Override
   public void a_(R $$0) {
      this.d.add($$0);
      LockSupport.unpark(this.ay());
   }

   @Override
   public void execute(Runnable $$0) {
      if (this.ax()) {
         this.a_(this.f($$0));
      } else {
         $$0.run();
      }
   }

   public void c(Runnable $$0) {
      this.execute($$0);
   }

   protected void bz() {
      this.d.clear();
   }

   protected void bA() {
      while (this.B()) {
      }
   }

   public boolean B() {
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

   public void b(BooleanSupplier $$0) {
      this.e++;

      try {
         while (!$$0.getAsBoolean()) {
            if (!this.B()) {
               this.A();
            }
         }
      } finally {
         this.e--;
      }
   }

   protected void A() {
      Thread.yield();
      LockSupport.parkNanos("waiting for tasks", 100000L);
   }

   protected void d(R $$0) {
      try {
         Zone $$1 = TracyClient.beginZone("Task", ab.aU);

         try {
            $$0.run();
         } catch (Throwable var6) {
            if ($$1 != null) {
               try {
                  $$1.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if ($$1 != null) {
            $$1.close();
         }
      } catch (Exception var7) {
         c.error(LogUtils.FATAL_MARKER, "Error executing task on {}", this.v_(), var7);
         throw var7;
      }
   }

   @Override
   public List<bqt> bw() {
      return ImmutableList.of(bqt.a(this.b + "-pending-tasks", bqs.b, this::by));
   }

   public static boolean a(Throwable $$0) {
      return $$0 instanceof z $$1 ? a($$1.getCause()) : $$0 instanceof OutOfMemoryError || $$0 instanceof StackOverflowError;
   }
}
