import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class auh<T> implements Iterable<auf<T>> {
   private final iy<T> a;
   private final Map<T, auf<T>> b = new IdentityHashMap<>();
   private final vu c;
   private final xs<vf, auf<T>> d;

   public auh(iy<T> $$0, vu $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = xq.a($$0.c()).a(this::b, auf::b);
   }

   public xs<vf, auf<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public auf<T> a(T $$0, aug $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new auf<>(this, (T)$$1x, $$1));
   }

   public iy<T> b() {
      return this.a;
   }

   @Override
   public Iterator<auf<T>> iterator() {
      return this.b.values().iterator();
   }

   public auf<T> b(T $$0) {
      return this.a($$0, aug.b);
   }

   public vu c() {
      return this.c;
   }
}
