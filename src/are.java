import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class are<T> implements Iterable<arc<T>> {
   private final is<T> a;
   private final Map<T, arc<T>> b = new IdentityHashMap<>();
   private final uv c;

   public are(is<T> $$0, uv $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public arc<T> a(T $$0, ard $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new arc<>(this, (T)$$1x, $$1));
   }

   public is<T> a() {
      return this.a;
   }

   @Override
   public Iterator<arc<T>> iterator() {
      return this.b.values().iterator();
   }

   public arc<T> b(T $$0) {
      return this.a($$0, ard.b);
   }

   public uv b() {
      return this.c;
   }
}
