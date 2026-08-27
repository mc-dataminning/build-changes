import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class auv<T> implements Iterable<aut<T>> {
   private final iy<T> a;
   private final Map<T, aut<T>> b = new IdentityHashMap<>();
   private final wg c;
   private final ye<vr, aut<T>> d;

   public auv(iy<T> $$0, wg $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yc.a($$0.c()).a(this::b, aut::b);
   }

   public ye<vr, aut<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public aut<T> a(T $$0, auu $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new aut<>(this, (T)$$1x, $$1));
   }

   public iy<T> b() {
      return this.a;
   }

   @Override
   public Iterator<aut<T>> iterator() {
      return this.b.values().iterator();
   }

   public aut<T> b(T $$0) {
      return this.a($$0, auu.b);
   }

   public wg c() {
      return this.c;
   }
}
