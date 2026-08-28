import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awj<T> implements Iterable<awh<T>> {
   private final jv<T> a;
   private final Map<T, awh<T>> b = new IdentityHashMap<>();
   private final xp c;
   private final zn<xa, awh<T>> d;

   public awj(jv<T> $$0, xp $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zl.a($$0.c()).a(this::b, awh::b);
   }

   public zn<xa, awh<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awh<T> a(T $$0, awi $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awh<>(this, (T)$$1x, $$1));
   }

   public jv<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awh<T>> iterator() {
      return this.b.values().iterator();
   }

   public awh<T> b(T $$0) {
      return this.a($$0, awi.b);
   }

   public xp c() {
      return this.c;
   }
}
