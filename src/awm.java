import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awm<T> implements Iterable<awk<T>> {
   private final ka<T> a;
   private final Map<T, awk<T>> b = new IdentityHashMap<>();
   private final xd c;
   private final zb<wo, awk<T>> d;

   public awm(ka<T> $$0, xd $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yz.a($$0.d()).a(this::b, awk::b);
   }

   public zb<wo, awk<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awk<T> a(T $$0, awl $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awk<>(this, (T)$$1x, $$1));
   }

   public ka<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awk<T>> iterator() {
      return this.b.values().iterator();
   }

   public awk<T> b(T $$0) {
      return this.a($$0, awl.b);
   }

   public xd c() {
      return this.c;
   }
}
