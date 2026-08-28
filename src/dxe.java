import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxe implements Predicate<dwv> {
   public static final Predicate<dwv> a = $$0 -> true;
   private final dww<djk, dwv> b;
   private final Map<dxx<?>, Predicate<Object>> c = Maps.newHashMap();

   private dxe(dww<djk, dwv> $$0) {
      this.b = $$0;
   }

   public static dxe a(djk $$0) {
      return new dxe($$0.l());
   }

   public boolean a(@Nullable dwv $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dxx<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dwv $$0, dxx<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dxe a(dxx<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
