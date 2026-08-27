import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

public class apd<T> implements Iterable<apb<T>> {
   private final hs<T> a;
   private final Map<T, apb<T>> b = new IdentityHashMap<>();
   @Nullable
   private te c;

   public apd(hs<T> $$0) {
      this.a = $$0;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public apb<T> a(T $$0, apc $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new apb<>(this, (T)$$1x, $$1));
   }

   public hs<T> a() {
      return this.a;
   }

   @Override
   public Iterator<apb<T>> iterator() {
      return this.b.values().iterator();
   }

   public apb<T> b(T $$0) {
      return this.a($$0, apc.b);
   }

   public String b() {
      return "stat_type." + jc.y.b(this).toString().replace(':', '.');
   }

   public te c() {
      if (this.c == null) {
         this.c = te.c(this.b());
      }

      return this.c;
   }
}
