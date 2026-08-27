import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class aqw<T> implements Iterable<aqu<T>> {
   private final io<T> a;
   private final Map<T, aqu<T>> b = new IdentityHashMap<>();
   private final ur c;

   public aqw(io<T> $$0, ur $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public aqu<T> a(T $$0, aqv $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new aqu<>(this, (T)$$1x, $$1));
   }

   public io<T> a() {
      return this.a;
   }

   @Override
   public Iterator<aqu<T>> iterator() {
      return this.b.values().iterator();
   }

   public aqu<T> b(T $$0) {
      return this.a($$0, aqv.b);
   }

   public ur b() {
      return this.c;
   }
}
