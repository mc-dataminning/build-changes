import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class asb<T> implements Iterable<arz<T>> {
   private final it<T> a;
   private final Map<T, arz<T>> b = new IdentityHashMap<>();
   private final vf c;

   public asb(it<T> $$0, vf $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public arz<T> a(T $$0, asa $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new arz<>(this, (T)$$1x, $$1));
   }

   public it<T> a() {
      return this.a;
   }

   @Override
   public Iterator<arz<T>> iterator() {
      return this.b.values().iterator();
   }

   public arz<T> b(T $$0) {
      return this.a($$0, asa.b);
   }

   public vf b() {
      return this.c;
   }
}
