import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvx implements Predicate<dvo> {
   public static final Predicate<dvo> a = $$0 -> true;
   private final dvp<dij, dvo> b;
   private final Map<dwq<?>, Predicate<Object>> c = Maps.newHashMap();

   private dvx(dvp<dij, dvo> $$0) {
      this.b = $$0;
   }

   public static dvx a(dij $$0) {
      return new dvx($$0.l());
   }

   public boolean a(@Nullable dvo $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dwq<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dvo $$0, dwq<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dvx a(dwq<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
