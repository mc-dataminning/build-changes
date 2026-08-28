import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awx<T> implements Iterable<awv<T>> {
   private final kd<T> a;
   private final Map<T, awv<T>> b = new IdentityHashMap<>();
   private final xl c;
   private final zj<ww, awv<T>> d;

   public awx(kd<T> $$0, xl $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zh.a($$0.g()).a(this::b, awv::b);
   }

   public zj<ww, awv<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awv<T> a(T $$0, aww $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awv<>(this, (T)$$1x, $$1));
   }

   public kd<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awv<T>> iterator() {
      return this.b.values().iterator();
   }

   public awv<T> b(T $$0) {
      return this.a($$0, aww.b);
   }

   public xl c() {
      return this.c;
   }
}
