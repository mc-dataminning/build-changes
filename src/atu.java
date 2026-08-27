import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class atu<T> implements Iterable<ats<T>> {
   private final iv<T> a;
   private final Map<T, ats<T>> b = new IdentityHashMap<>();
   private final vq c;
   private final xo<vb, ats<T>> d;

   public atu(iv<T> $$0, vq $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = xm.a($$0.c()).a(this::b, ats::b);
   }

   public xo<vb, ats<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public ats<T> a(T $$0, att $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new ats<>(this, (T)$$1x, $$1));
   }

   public iv<T> b() {
      return this.a;
   }

   @Override
   public Iterator<ats<T>> iterator() {
      return this.b.values().iterator();
   }

   public ats<T> b(T $$0) {
      return this.a($$0, att.b);
   }

   public vq c() {
      return this.c;
   }
}
