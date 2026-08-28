import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awf<T> implements Iterable<awd<T>> {
   private final jv<T> a;
   private final Map<T, awd<T>> b = new IdentityHashMap<>();
   private final xl c;
   private final zj<ww, awd<T>> d;

   public awf(jv<T> $$0, xl $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zh.a($$0.c()).a(this::b, awd::b);
   }

   public zj<ww, awd<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awd<T> a(T $$0, awe $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awd<>(this, (T)$$1x, $$1));
   }

   public jv<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awd<T>> iterator() {
      return this.b.values().iterator();
   }

   public awd<T> b(T $$0) {
      return this.a($$0, awe.b);
   }

   public xl c() {
      return this.c;
   }
}
