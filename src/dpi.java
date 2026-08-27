import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpi implements Predicate<doz> {
   public static final Predicate<doz> a = $$0 -> true;
   private final dpa<dby, doz> b;
   private final Map<dqc<?>, Predicate<Object>> c = Maps.newHashMap();

   private dpi(dpa<dby, doz> $$0) {
      this.b = $$0;
   }

   public static dpi a(dby $$0) {
      return new dpi($$0.l());
   }

   public boolean a(@Nullable doz $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dqc<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(doz $$0, dqc<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dpi a(dqc<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
