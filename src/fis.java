import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fis implements fit, AutoCloseable {
   private final int b;
   private final Deque<fis.a<?>> c = new ArrayDeque<>();

   public fis(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends fis.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         fis.a<?> $$1 = (fis.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fiv<T> $$0) {
      T $$1 = this.b($$0);
      $$0.b($$1);
      return $$1;
   }

   private <T> T b(fiv<T> $$0) {
      Iterator<? extends fis.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         fis.a<?> $$2 = (fis.a<?>)$$1.next();
         if ($$0.a($$2.a)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.f();
   }

   @Override
   public <T> void a(fiv<T> $$0, T $$1) {
      this.c.addFirst(new fis.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(fis.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<fis.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fiv<T> a;
      final T b;
      int c;

      a(fiv<T> $$0, T $$1, int $$2) {
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
