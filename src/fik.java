import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fik implements fil, AutoCloseable {
   private final int b;
   private final Deque<fik.a<?>> c = new ArrayDeque<>();

   public fik(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends fik.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         fik.a<?> $$1 = (fik.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fin<T> $$0) {
      T $$1 = this.b($$0);
      $$0.b($$1);
      return $$1;
   }

   private <T> T b(fin<T> $$0) {
      Iterator<? extends fik.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         fik.a<?> $$2 = (fik.a<?>)$$1.next();
         if ($$0.a($$2.a)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.f();
   }

   @Override
   public <T> void a(fin<T> $$0, T $$1) {
      this.c.addFirst(new fik.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(fik.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<fik.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fin<T> a;
      final T b;
      int c;

      a(fin<T> $$0, T $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public void close() {
         this.a.a(this.b);
      }
   }
}
