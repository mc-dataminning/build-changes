import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fbx implements fby, AutoCloseable {
   private final int b;
   private final Deque<fbx.a<?>> c = new ArrayDeque<>();

   public fbx(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends fbx.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         fbx.a<?> $$1 = (fbx.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fca<T> $$0) {
      Iterator<? extends fbx.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         fbx.a<?> $$2 = (fbx.a<?>)$$1.next();
         if ($$2.a.equals($$0)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.e();
   }

   @Override
   public <T> void a(fca<T> $$0, T $$1) {
      this.c.addFirst(new fbx.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(fbx.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<fbx.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fca<T> a;
      final T b;
      int c;

      a(fca<T> $$0, T $$1, int $$2) {
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
