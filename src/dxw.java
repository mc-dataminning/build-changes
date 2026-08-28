import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxw implements Predicate<dxn> {
   public static final Predicate<dxn> a = $$0 -> true;
   private final dxo<dke, dxn> b;
   private final Map<dyp<?>, Predicate<Object>> c = Maps.newHashMap();

   private dxw(dxo<dke, dxn> $$0) {
      this.b = $$0;
   }

   public static dxw a(dke $$0) {
      return new dxw($$0.l());
   }

   public boolean a(@Nullable dxn $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dyp<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
               if (!this.a($$0, $$1.getKey(), $$1.getValue())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   protected <T extends Comparable<T>> boolean a(dxn $$0, dyp<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dxw a(dyp<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
