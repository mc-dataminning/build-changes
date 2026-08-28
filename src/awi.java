import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awi<T> implements Iterable<awg<T>> {
   private final jv<T> a;
   private final Map<T, awg<T>> b = new IdentityHashMap<>();
   private final xo c;
   private final zm<wz, awg<T>> d;

   public awi(jv<T> $$0, xo $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zk.a($$0.c()).a(this::b, awg::b);
   }

   public zm<wz, awg<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awg<T> a(T $$0, awh $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awg<>(this, (T)$$1x, $$1));
   }

   public jv<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awg<T>> iterator() {
      return this.b.values().iterator();
   }

   public awg<T> b(T $$0) {
      return this.a($$0, awh.b);
   }

   public xo c() {
      return this.c;
   }
}
