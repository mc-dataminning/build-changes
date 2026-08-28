import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awy<T> implements Iterable<aww<T>> {
   private final js<T> a;
   private final Map<T, aww<T>> b = new IdentityHashMap<>();
   private final xa c;
   private final yy<wl, aww<T>> d;

   public awy(js<T> $$0, xa $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yw.a($$0.g()).a(this::b, aww::b);
   }

   public yy<wl, aww<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public aww<T> a(T $$0, awx $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new aww<>(this, (T)$$1x, $$1));
   }

   public js<T> b() {
      return this.a;
   }

   @Override
   public Iterator<aww<T>> iterator() {
      return this.b.values().iterator();
   }

   public aww<T> b(T $$0) {
      return this.a($$0, awx.b);
   }

   public xa c() {
      return this.c;
   }
}
