import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class apn<T> implements Iterable<apl<T>> {
   private final ht<T> a;
   private final Map<T, apl<T>> b = new IdentityHashMap<>();
   private final tl c;

   public apn(ht<T> $$0, tl $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apl<T> a(T $$0, apm $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apl<>(this, (T)$$1x, $$1));
   }

   public ht<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apl<T>> iterator() {
      return this.b.values().iterator();
   }

   public apl<T> b(T $$0) {
      return this.a($$0, apm.b);
   }

   public tl b() {
      return this.c;
   }
}
