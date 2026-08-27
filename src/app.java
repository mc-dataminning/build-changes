import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class app<T> implements Iterable<apn<T>> {
   private final hq<T> a;
   private final Map<T, apn<T>> b = new IdentityHashMap<>();
   private final tl c;

   public app(hq<T> $$0, tl $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apn<T> a(T $$0, apo $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apn<>(this, (T)$$1x, $$1));
   }

   public hq<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apn<T>> iterator() {
      return this.b.values().iterator();
   }

   public apn<T> b(T $$0) {
      return this.a($$0, apo.b);
   }

   public tl b() {
      return this.c;
   }
}
