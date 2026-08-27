import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djp implements Predicate<djg> {
   public static final Predicate<djg> a = $$0 -> true;
   private final djh<cwp, djg> b;
   private final Map<dkj<?>, Predicate<Object>> c = Maps.newHashMap();

   private djp(djh<cwp, djg> $$0) {
      this.b = $$0;
   }

   public static djp a(cwp $$0) {
      return new djp($$0.n());
   }

   public boolean a(@Nullable djg $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dkj<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(djg $$0, dkj<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> djp a(dkj<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
