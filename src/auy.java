import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class auy<T> implements Iterable<auv<T>> {
   private final ja<T> a;
   private final Map<T, auv<T>> b = new IdentityHashMap<>();
   private final wi c;
   private final yg<vt, auv<T>> d;

   public auy(ja<T> $$0, wi $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = ye.a($$0.c()).a(this::b, auv::b);
   }

   public yg<vt, auv<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public auv<T> a(T $$0, auw $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new auv<>(this, (T)$$1x, $$1));
   }

   public ja<T> b() {
      return this.a;
   }

   @Override
   public Iterator<auv<T>> iterator() {
      return this.b.values().iterator();
   }

   public auv<T> b(T $$0) {
      return this.a($$0, auw.b);
   }

   public wi c() {
      return this.c;
   }
}
