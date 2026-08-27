import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class apo<T> implements Iterable<apm<T>> {
   private final ht<T> a;
   private final Map<T, apm<T>> b = new IdentityHashMap<>();
   private final tn c;

   public apo(ht<T> $$0, tn $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apm<T> a(T $$0, apn $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apm<>(this, (T)$$1x, $$1));
   }

   public ht<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apm<T>> iterator() {
      return this.b.values().iterator();
   }

   public apm<T> b(T $$0) {
      return this.a($$0, apn.b);
   }

   public tn b() {
      return this.c;
   }
}
