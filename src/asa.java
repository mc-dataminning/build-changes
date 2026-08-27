import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class asa<T> implements Iterable<ary<T>> {
   private final it<T> a;
   private final Map<T, ary<T>> b = new IdentityHashMap<>();
   private final vf c;

   public asa(it<T> $$0, vf $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public ary<T> a(T $$0, arz $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new ary<>(this, (T)$$1x, $$1));
   }

   public it<T> a() {
      return this.a;
   }

   @Override
   public Iterator<ary<T>> iterator() {
      return this.b.values().iterator();
   }

   public ary<T> b(T $$0) {
      return this.a($$0, arz.b);
   }

   public vf b() {
      return this.c;
   }
}
