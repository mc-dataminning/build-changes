import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djj implements Predicate<dja> {
   public static final Predicate<dja> a = $$0 -> true;
   private final djb<cwj, dja> b;
   private final Map<dkd<?>, Predicate<Object>> c = Maps.newHashMap();

   private djj(djb<cwj, dja> $$0) {
      this.b = $$0;
   }

   public static djj a(cwj $$0) {
      return new djj($$0.n());
   }

   public boolean a(@Nullable dja $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dkd<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dja $$0, dkd<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> djj a(dkd<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
