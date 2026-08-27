import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class aqm<T> implements Iterable<aqk<T>> {
   private final io<T> a;
   private final Map<T, aqk<T>> b = new IdentityHashMap<>();
   private final ui c;

   public aqm(io<T> $$0, ui $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public aqk<T> a(T $$0, aql $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new aqk<>(this, (T)$$1x, $$1));
   }

   public io<T> a() {
      return this.a;
   }

   @Override
   public Iterator<aqk<T>> iterator() {
      return this.b.values().iterator();
   }

   public aqk<T> b(T $$0) {
      return this.a($$0, aql.b);
   }

   public ui b() {
      return this.c;
   }
}
