import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dux implements Predicate<duo> {
   public static final Predicate<duo> a = $$0 -> true;
   private final dup<dhj, duo> b;
   private final Map<dvr<?>, Predicate<Object>> c = Maps.newHashMap();

   private dux(dup<dhj, duo> $$0) {
      this.b = $$0;
   }

   public static dux a(dhj $$0) {
      return new dux($$0.n());
   }

   public boolean a(@Nullable duo $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dvr<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(duo $$0, dvr<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dux a(dvr<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
