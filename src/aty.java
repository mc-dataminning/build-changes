import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class aty<T> implements Iterable<atw<T>> {
   private final ix<T> a;
   private final Map<T, atw<T>> b = new IdentityHashMap<>();
   private final vs c;
   private final xq<vd, atw<T>> d;

   public aty(ix<T> $$0, vs $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = xo.a($$0.c()).a(this::b, atw::b);
   }

   public xq<vd, atw<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public atw<T> a(T $$0, atx $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new atw<>(this, (T)$$1x, $$1));
   }

   public ix<T> b() {
      return this.a;
   }

   @Override
   public Iterator<atw<T>> iterator() {
      return this.b.values().iterator();
   }

   public atw<T> b(T $$0) {
      return this.a($$0, atx.b);
   }

   public vs c() {
      return this.c;
   }
}
