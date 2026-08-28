import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awu<T> implements Iterable<aws<T>> {
   private final kd<T> a;
   private final Map<T, aws<T>> b = new IdentityHashMap<>();
   private final xi c;
   private final zg<wt, aws<T>> d;

   public awu(kd<T> $$0, xi $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = ze.a($$0.g()).a(this::b, aws::b);
   }

   public zg<wt, aws<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public aws<T> a(T $$0, awt $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new aws<>(this, (T)$$1x, $$1));
   }

   public kd<T> b() {
      return this.a;
   }

   @Override
   public Iterator<aws<T>> iterator() {
      return this.b.values().iterator();
   }

   public aws<T> b(T $$0) {
      return this.a($$0, awt.b);
   }

   public xi c() {
      return this.c;
   }
}
