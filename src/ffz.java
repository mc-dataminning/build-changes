import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class ffz implements fga, AutoCloseable {
   private final int b;
   private final Deque<ffz.a<?>> c = new ArrayDeque<>();

   public ffz(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends ffz.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         ffz.a<?> $$1 = (ffz.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fgc<T> $$0) {
      Iterator<? extends ffz.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         ffz.a<?> $$2 = (ffz.a<?>)$$1.next();
         if ($$2.a.equals($$0)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.e();
   }

   @Override
   public <T> void a(fgc<T> $$0, T $$1) {
      this.c.addFirst(new ffz.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(ffz.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<ffz.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fgc<T> a;
      final T b;
      int c;

      a(fgc<T> $$0, T $$1, int $$2) {
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
