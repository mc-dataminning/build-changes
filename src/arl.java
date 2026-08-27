import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class arl<T> implements Iterable<arj<T>> {
   private final ir<T> a;
   private final Map<T, arj<T>> b = new IdentityHashMap<>();
   private final vb c;

   public arl(ir<T> $$0, vb $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public arj<T> a(T $$0, ark $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new arj<>(this, (T)$$1x, $$1));
   }

   public ir<T> a() {
      return this.a;
   }

   @Override
   public Iterator<arj<T>> iterator() {
      return this.b.values().iterator();
   }

   public arj<T> b(T $$0) {
      return this.a($$0, ark.b);
   }

   public vb b() {
      return this.c;
   }
}
