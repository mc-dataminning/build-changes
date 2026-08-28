import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awj<T> implements Iterable<awh<T>> {
   private final ke<T> a;
   private final Map<T, awh<T>> b = new IdentityHashMap<>();
   private final wo c;
   private final ym<vz, awh<T>> d;

   public awj(ke<T> $$0, wo $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yk.a($$0.g()).a(this::b, awh::b);
   }

   public ym<vz, awh<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awh<T> a(T $$0, awi $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awh<>(this, (T)$$1x, $$1));
   }

   public ke<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awh<T>> iterator() {
      return this.b.values().iterator();
   }

   public awh<T> b(T $$0) {
      return this.a($$0, awi.b);
   }

   public wo c() {
      return this.c;
   }
}
