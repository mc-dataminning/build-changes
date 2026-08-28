import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fjh implements fji, AutoCloseable {
   private final int b;
   private final Deque<fjh.a<?>> c = new ArrayDeque<>();

   public fjh(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends fjh.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         fjh.a<?> $$1 = (fjh.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fjk<T> $$0) {
      T $$1 = this.b($$0);
      $$0.b($$1);
      return $$1;
   }

   private <T> T b(fjk<T> $$0) {
      Iterator<? extends fjh.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         fjh.a<?> $$2 = (fjh.a<?>)$$1.next();
         if ($$0.a($$2.a)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.f();
   }

   @Override
   public <T> void a(fjk<T> $$0, T $$1) {
      this.c.addFirst(new fjh.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(fjh.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<fjh.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fjk<T> a;
      final T b;
      int c;

      a(fjk<T> $$0, T $$1, int $$2) {
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
