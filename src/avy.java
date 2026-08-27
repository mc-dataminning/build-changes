import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avy<T> implements Iterable<avw<T>> {
   private final jn<T> a;
   private final Map<T, avw<T>> b = new IdentityHashMap<>();
   private final xe c;
   private final zc<wp, avw<T>> d;

   public avy(jn<T> $$0, xe $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = za.a($$0.c()).a(this::b, avw::b);
   }

   public zc<wp, avw<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avw<T> a(T $$0, avx $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avw<>(this, (T)$$1x, $$1));
   }

   public jn<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avw<T>> iterator() {
      return this.b.values().iterator();
   }

   public avw<T> b(T $$0) {
      return this.a($$0, avx.b);
   }

   public xe c() {
      return this.c;
   }
}
