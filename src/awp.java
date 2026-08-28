import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awp<T> implements Iterable<awn<T>> {
   private final kb<T> a;
   private final Map<T, awn<T>> b = new IdentityHashMap<>();
   private final xe c;
   private final zc<wp, awn<T>> d;

   public awp(kb<T> $$0, xe $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = za.a($$0.g()).a(this::b, awn::b);
   }

   public zc<wp, awn<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awn<T> a(T $$0, awo $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awn<>(this, (T)$$1x, $$1));
   }

   public kb<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awn<T>> iterator() {
      return this.b.values().iterator();
   }

   public awn<T> b(T $$0) {
      return this.a($$0, awo.b);
   }

   public xe c() {
      return this.c;
   }
}
