import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avq<T> implements Iterable<avo<T>> {
   private final jk<T> a;
   private final Map<T, avo<T>> b = new IdentityHashMap<>();
   private final wx c;
   private final yv<wi, avo<T>> d;

   public avq(jk<T> $$0, wx $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yt.a($$0.c()).a(this::b, avo::b);
   }

   public yv<wi, avo<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avo<T> a(T $$0, avp $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avo<>(this, (T)$$1x, $$1));
   }

   public jk<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avo<T>> iterator() {
      return this.b.values().iterator();
   }

   public avo<T> b(T $$0) {
      return this.a($$0, avp.b);
   }

   public wx c() {
      return this.c;
   }
}
