import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class ara<T> implements Iterable<aqy<T>> {
   private final io<T> a;
   private final Map<T, aqy<T>> b = new IdentityHashMap<>();
   private final ur c;

   public ara(io<T> $$0, ur $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public aqy<T> a(T $$0, aqz $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new aqy<>(this, (T)$$1x, $$1));
   }

   public io<T> a() {
      return this.a;
   }

   @Override
   public Iterator<aqy<T>> iterator() {
      return this.b.values().iterator();
   }

   public aqy<T> b(T $$0) {
      return this.a($$0, aqz.b);
   }

   public ur b() {
      return this.c;
   }
}
