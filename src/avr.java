import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class avr<T> implements Iterable<avp<T>> {
   private final jk<T> a;
   private final Map<T, avp<T>> b = new IdentityHashMap<>();
   private final wx c;
   private final yv<wi, avp<T>> d;

   public avr(jk<T> $$0, wx $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yt.a($$0.c()).a(this::b, avp::b);
   }

   public yv<wi, avp<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public avp<T> a(T $$0, avq $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new avp<>(this, (T)$$1x, $$1));
   }

   public jk<T> b() {
      return this.a;
   }

   @Override
   public Iterator<avp<T>> iterator() {
      return this.b.values().iterator();
   }

   public avp<T> b(T $$0) {
      return this.a($$0, avq.b);
   }

   public wx c() {
      return this.c;
   }
}
