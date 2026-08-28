import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class axe<T> implements Iterable<axc<T>> {
   private final kd<T> a;
   private final Map<T, axc<T>> b = new IdentityHashMap<>();
   private final xk c;
   private final zi<wv, axc<T>> d;

   public axe(kd<T> $$0, xk $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zg.a($$0.g()).a(this::b, axc::b);
   }

   public zi<wv, axc<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public axc<T> a(T $$0, axd $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new axc<>(this, (T)$$1x, $$1));
   }

   public kd<T> b() {
      return this.a;
   }

   @Override
   public Iterator<axc<T>> iterator() {
      return this.b.values().iterator();
   }

   public axc<T> b(T $$0) {
      return this.a($$0, axd.b);
   }

   public xk c() {
      return this.c;
   }
}
