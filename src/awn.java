import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awn<T> implements Iterable<awl<T>> {
   private final ka<T> a;
   private final Map<T, awl<T>> b = new IdentityHashMap<>();
   private final xd c;
   private final zb<wo, awl<T>> d;

   public awn(ka<T> $$0, xd $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yz.a($$0.d()).a(this::b, awl::b);
   }

   public zb<wo, awl<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awl<T> a(T $$0, awm $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awl<>(this, (T)$$1x, $$1));
   }

   public ka<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awl<T>> iterator() {
      return this.b.values().iterator();
   }

   public awl<T> b(T $$0) {
      return this.a($$0, awm.b);
   }

   public xd c() {
      return this.c;
   }
}
