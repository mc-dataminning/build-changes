import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class apm<T> implements Iterable<apk<T>> {
   private final hq<T> a;
   private final Map<T, apk<T>> b = new IdentityHashMap<>();
   private final tl c;

   public apm(hq<T> $$0, tl $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apk<T> a(T $$0, apl $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apk<>(this, (T)$$1x, $$1));
   }

   public hq<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apk<T>> iterator() {
      return this.b.values().iterator();
   }

   public apk<T> b(T $$0) {
      return this.a($$0, apl.b);
   }

   public tl b() {
      return this.c;
   }
}
