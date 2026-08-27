import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

public class amq<T> implements Iterable<amo<T>> {
   private final hr<T> a;
   private final Map<T, amo<T>> b = new IdentityHashMap<>();
   @Nullable
   private sw c;

   public amq(hr<T> $$0) {
      this.a = $$0;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public amo<T> a(T $$0, amp $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new amo<>(this, (T)$$1x, $$1));
   }

   public hr<T> a() {
      return this.a;
   }

   @Override
   public Iterator<amo<T>> iterator() {
      return this.b.values().iterator();
   }

   public amo<T> b(T $$0) {
      return this.a($$0, amp.b);
   }

   public String b() {
      return "stat_type." + jb.y.b(this).toString().replace(':', '.');
   }

   public sw c() {
      if (this.c == null) {
         this.c = sw.c(this.b());
      }

      return this.c;
   }
}
