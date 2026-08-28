import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fkn implements fko, AutoCloseable {
   private final int b;
   private final Deque<fkn.a<?>> c = new ArrayDeque<>();

   public fkn(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends fkn.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         fkn.a<?> $$1 = (fkn.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fkq<T> $$0) {
      T $$1 = this.b($$0);
      $$0.b($$1);
      return $$1;
   }

   private <T> T b(fkq<T> $$0) {
      Iterator<? extends fkn.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         fkn.a<?> $$2 = (fkn.a<?>)$$1.next();
         if ($$0.a($$2.a)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.f();
   }

   @Override
   public <T> void a(fkq<T> $$0, T $$1) {
      this.c.addFirst(new fkn.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(fkn.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<fkn.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fkq<T> a;
      final T b;
      int c;

      a(fkq<T> $$0, T $$1, int $$2) {
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
