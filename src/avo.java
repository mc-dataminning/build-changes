import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avo<T> implements Iterable<avm<T>> {
   private final jw<T> a;
   private final Map<T, avm<T>> b = new IdentityHashMap<>();
   private final wu c;
   private final ys<wf, avm<T>> d;

   public avo(jw<T> $$0, wu $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yq.a($$0.d()).a(this::b, avm::b);
   }

   public ys<wf, avm<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avm<T> a(T $$0, avn $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avm<>(this, (T)$$1x, $$1));
   }

   public jw<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avm<T>> iterator() {
      return this.b.values().iterator();
   }

   public avm<T> b(T $$0) {
      return this.a($$0, avn.b);
   }

   public wu c() {
      return this.c;
   }
}
