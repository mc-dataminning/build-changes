import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsj implements Predicate<dsa> {
   public static final Predicate<dsa> a = $$0 -> true;
   private final dsb<dex, dsa> b;
   private final Map<dtd<?>, Predicate<Object>> c = Maps.newHashMap();

   private dsj(dsb<dex, dsa> $$0) {
      this.b = $$0;
   }

   public static dsj a(dex $$0) {
      return new dsj($$0.l());
   }

   public boolean a(@Nullable dsa $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dtd<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dsa $$0, dtd<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dsj a(dtd<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
