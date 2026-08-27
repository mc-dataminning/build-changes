import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avl<T> implements Iterable<avj<T>> {
   private final jj<T> a;
   private final Map<T, avj<T>> b = new IdentityHashMap<>();
   private final wu c;
   private final ys<wf, avj<T>> d;

   public avl(jj<T> $$0, wu $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yq.a($$0.c()).a(this::b, avj::b);
   }

   public ys<wf, avj<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avj<T> a(T $$0, avk $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avj<>(this, (T)$$1x, $$1));
   }

   public jj<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avj<T>> iterator() {
      return this.b.values().iterator();
   }

   public avj<T> b(T $$0) {
      return this.a($$0, avk.b);
   }

   public wu c() {
      return this.c;
   }
}
