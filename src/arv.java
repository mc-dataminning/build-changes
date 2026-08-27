import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class arv<T> implements Iterable<art<T>> {
   private final it<T> a;
   private final Map<T, art<T>> b = new IdentityHashMap<>();
   private final vd c;

   public arv(it<T> $$0, vd $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public art<T> a(T $$0, aru $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new art<>(this, (T)$$1x, $$1));
   }

   public it<T> a() {
      return this.a;
   }

   @Override
   public Iterator<art<T>> iterator() {
      return this.b.values().iterator();
   }

   public art<T> b(T $$0) {
      return this.a($$0, aru.b);
   }

   public vd b() {
      return this.c;
   }
}
