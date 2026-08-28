import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class aww<T> implements Iterable<awu<T>> {
   private final kd<T> a;
   private final Map<T, awu<T>> b = new IdentityHashMap<>();
   private final xj c;
   private final zh<wu, awu<T>> d;

   public aww(kd<T> $$0, xj $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zf.a($$0.g()).a(this::b, awu::b);
   }

   public zh<wu, awu<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awu<T> a(T $$0, awv $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awu<>(this, (T)$$1x, $$1));
   }

   public kd<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awu<T>> iterator() {
      return this.b.values().iterator();
   }

   public awu<T> b(T $$0) {
      return this.a($$0, awv.b);
   }

   public xj c() {
      return this.c;
   }
}
