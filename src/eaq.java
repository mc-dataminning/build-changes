import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eaq implements Predicate<eah> {
   public static final Predicate<eah> a = $$0 -> true;
   private final eai<dmf, eah> b;
   private final Map<ebk<?>, Predicate<Object>> c = Maps.newHashMap();

   private eaq(eai<dmf, eah> $$0) {
      this.b = $$0;
   }

   public static eaq a(dmf $$0) {
      return new eaq($$0.l());
   }

   public boolean a(@Nullable eah $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<ebk<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(eah $$0, ebk<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> eaq a(ebk<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
