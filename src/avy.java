import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avy<T> implements Iterable<avw<T>> {
   private final jz<T> a;
   private final Map<T, avw<T>> b = new IdentityHashMap<>();
   private final wz c;
   private final yx<wk, avw<T>> d;

   public avy(jz<T> $$0, wz $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yv.a($$0.d()).a(this::b, avw::b);
   }

   public yx<wk, avw<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avw<T> a(T $$0, avx $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avw<>(this, (T)$$1x, $$1));
   }

   public jz<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avw<T>> iterator() {
      return this.b.values().iterator();
   }

   public avw<T> b(T $$0) {
      return this.a($$0, avx.b);
   }

   public wz c() {
      return this.c;
   }
}
