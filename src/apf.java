import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class apf<T> implements Iterable<apd<T>> {
   private final hr<T> a;
   private final Map<T, apd<T>> b = new IdentityHashMap<>();
   private final tf c;

   public apf(hr<T> $$0, tf $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apd<T> a(T $$0, ape $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apd<>(this, (T)$$1x, $$1));
   }

   public hr<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apd<T>> iterator() {
      return this.b.values().iterator();
   }

   public apd<T> b(T $$0) {
      return this.a($$0, ape.b);
   }

   public tf b() {
      return this.c;
   }
}
