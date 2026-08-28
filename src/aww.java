import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class aww<T> implements Iterable<awu<T>> {
   private final js<T> a;
   private final Map<T, awu<T>> b = new IdentityHashMap<>();
   private final wy c;
   private final yw<wj, awu<T>> d;

   public aww(js<T> $$0, wy $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yu.a($$0.g()).a(this::b, awu::b);
   }

   public yw<wj, awu<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awu<T> a(T $$0, awv $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awu<>(this, (T)$$1x, $$1));
   }

   public js<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awu<T>> iterator() {
      return this.b.values().iterator();
   }

   public awu<T> b(T $$0) {
      return this.a($$0, awv.b);
   }

   public wy c() {
      return this.c;
   }
}
