import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class att<T> implements Iterable<atr<T>> {
   private final iv<T> a;
   private final Map<T, atr<T>> b = new IdentityHashMap<>();
   private final vq c;
   private final xo<vb, atr<T>> d;

   public att(iv<T> $$0, vq $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = xm.a($$0.c()).a(this::b, atr::b);
   }

   public xo<vb, atr<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public atr<T> a(T $$0, ats $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new atr<>(this, (T)$$1x, $$1));
   }

   public iv<T> b() {
      return this.a;
   }

   @Override
   public Iterator<atr<T>> iterator() {
      return this.b.values().iterator();
   }

   public atr<T> b(T $$0) {
      return this.a($$0, ats.b);
   }

   public vq c() {
      return this.c;
   }
}
