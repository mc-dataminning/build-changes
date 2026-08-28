import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class axh<T> implements Iterable<axf<T>> {
   private final jt<T> a;
   private final Map<T, axf<T>> b = new IdentityHashMap<>();
   private final xg c;
   private final ze<wp, axf<T>> d;

   public axh(jt<T> $$0, xg $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zc.a($$0.g()).a(this::b, axf::b);
   }

   public ze<wp, axf<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public axf<T> a(T $$0, axg $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new axf<>(this, (T)$$1x, $$1));
   }

   public jt<T> b() {
      return this.a;
   }

   @Override
   public Iterator<axf<T>> iterator() {
      return this.b.values().iterator();
   }

   public axf<T> b(T $$0) {
      return this.a($$0, axg.b);
   }

   public xg c() {
      return this.c;
   }
}
