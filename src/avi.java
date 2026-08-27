import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avi<T> implements Iterable<avg<T>> {
   private final ji<T> a;
   private final Map<T, avg<T>> b = new IdentityHashMap<>();
   private final ws c;
   private final yq<wd, avg<T>> d;

   public avi(ji<T> $$0, ws $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yo.a($$0.c()).a(this::b, avg::b);
   }

   public yq<wd, avg<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avg<T> a(T $$0, avh $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avg<>(this, (T)$$1x, $$1));
   }

   public ji<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avg<T>> iterator() {
      return this.b.values().iterator();
   }

   public avg<T> b(T $$0) {
      return this.a($$0, avh.b);
   }

   public ws c() {
      return this.c;
   }
}
