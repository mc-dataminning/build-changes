import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class axo<T> implements Iterable<axm<T>> {
   private final kd<T> a;
   private final Map<T, axm<T>> b = new IdentityHashMap<>();
   private final xv c;
   private final zt<xg, axm<T>> d;

   public axo(kd<T> $$0, xv $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zr.a($$0.g()).a(this::b, axm::b);
   }

   public zt<xg, axm<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public axm<T> a(T $$0, axn $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new axm<>(this, (T)$$1x, $$1));
   }

   public kd<T> b() {
      return this.a;
   }

   @Override
   public Iterator<axm<T>> iterator() {
      return this.b.values().iterator();
   }

   public axm<T> b(T $$0) {
      return this.a($$0, axn.b);
   }

   public xv c() {
      return this.c;
   }
}
