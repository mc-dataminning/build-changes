import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awi<T> implements Iterable<awg<T>> {
   private final ke<T> a;
   private final Map<T, awg<T>> b = new IdentityHashMap<>();
   private final wo c;
   private final ym<vz, awg<T>> d;

   public awi(ke<T> $$0, wo $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yk.a($$0.g()).a(this::b, awg::b);
   }

   public ym<vz, awg<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awg<T> a(T $$0, awh $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awg<>(this, (T)$$1x, $$1));
   }

   public ke<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awg<T>> iterator() {
      return this.b.values().iterator();
   }

   public awg<T> b(T $$0) {
      return this.a($$0, awh.b);
   }

   public wo c() {
      return this.c;
   }
}
