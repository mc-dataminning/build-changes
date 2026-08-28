import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avx<T> implements Iterable<avv<T>> {
   private final jz<T> a;
   private final Map<T, avv<T>> b = new IdentityHashMap<>();
   private final wy c;
   private final yw<wj, avv<T>> d;

   public avx(jz<T> $$0, wy $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yu.a($$0.d()).a(this::b, avv::b);
   }

   public yw<wj, avv<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avv<T> a(T $$0, avw $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avv<>(this, (T)$$1x, $$1));
   }

   public jz<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avv<T>> iterator() {
      return this.b.values().iterator();
   }

   public avv<T> b(T $$0) {
      return this.a($$0, avw.b);
   }

   public wy c() {
      return this.c;
   }
}
