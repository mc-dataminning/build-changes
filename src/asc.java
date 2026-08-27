import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class asc<T> implements Iterable<asa<T>> {
   private final it<T> a;
   private final Map<T, asa<T>> b = new IdentityHashMap<>();
   private final vg c;

   public asc(it<T> $$0, vg $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public asa<T> a(T $$0, asb $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new asa<>(this, (T)$$1x, $$1));
   }

   public it<T> a() {
      return this.a;
   }

   @Override
   public Iterator<asa<T>> iterator() {
      return this.b.values().iterator();
   }

   public asa<T> b(T $$0) {
      return this.a($$0, asb.b);
   }

   public vg b() {
      return this.c;
   }
}
