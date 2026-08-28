import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class axa<T> implements Iterable<awy<T>> {
   private final jt<T> a;
   private final Map<T, awy<T>> b = new IdentityHashMap<>();
   private final xc c;
   private final za<wn, awy<T>> d;

   public axa(jt<T> $$0, xc $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yy.a($$0.g()).a(this::b, awy::b);
   }

   public za<wn, awy<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awy<T> a(T $$0, awz $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awy<>(this, (T)$$1x, $$1));
   }

   public jt<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awy<T>> iterator() {
      return this.b.values().iterator();
   }

   public awy<T> b(T $$0) {
      return this.a($$0, awz.b);
   }

   public xc c() {
      return this.c;
   }
}
