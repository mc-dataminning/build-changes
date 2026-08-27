import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class api<T> implements Iterable<apg<T>> {
   private final ht<T> a;
   private final Map<T, apg<T>> b = new IdentityHashMap<>();
   private final ti c;

   public api(ht<T> $$0, ti $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apg<T> a(T $$0, aph $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apg<>(this, (T)$$1x, $$1));
   }

   public ht<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apg<T>> iterator() {
      return this.b.values().iterator();
   }

   public apg<T> b(T $$0) {
      return this.a($$0, aph.b);
   }

   public ti b() {
      return this.c;
   }
}
