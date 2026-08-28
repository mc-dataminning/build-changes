import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public interface bss<T extends Runnable> {
   @Nullable
   Runnable a();

   boolean a(T var1);

   boolean b();

   int c();

   public static final class a implements bss<bss.c> {
      private final Queue<Runnable>[] a;
      private final AtomicInteger b = new AtomicInteger();

      public a(int $$0) {
         this.a = new Queue[$$0];

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            this.a[$$1] = Queues.newConcurrentLinkedQueue();
         }
      }

      @Nullable
      @Override
      public Runnable a() {
         for (Queue<Runnable> $$0 : this.a) {
            Runnable $$1 = $$0.poll();
            if ($$1 != null) {
               this.b.decrementAndGet();
               return $$1;
            }
         }

         return null;
      }

      public boolean a(bss.c $$0) {
         int $$1 = $$0.a;
         if ($$1 < this.a.length && $$1 >= 0) {
            this.a[$$1].add($$0);
            this.b.incrementAndGet();
            return true;
         } else {
            throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", $$1, this.a.length - 1));
         }
      }

      @Override
      public boolean b() {
         return this.b.get() == 0;
      }

      @Override
      public int c() {
         return this.b.get();
      }
   }

   public static final class b implements bss<Runnable> {
      private final Queue<Runnable> a;

      public b(Queue<Runnable> $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public Runnable a() {
         return this.a.poll();
      }

      @Override
      public boolean a(Runnable $$0) {
         return this.a.add($$0);
      }

      @Override
      public boolean b() {
         return this.a.isEmpty();
      }

      @Override
      public int c() {
         return this.a.size();
      }
   }

   public static record c(int a, Runnable b) implements Runnable {

      @Override
      public void run() {
         this.b.run();
      }
   }
}
