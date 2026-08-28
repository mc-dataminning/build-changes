import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvs implements Predicate<dvj> {
   public static final Predicate<dvj> a = $$0 -> true;
   private final dvk<die, dvj> b;
   private final Map<dwm<?>, Predicate<Object>> c = Maps.newHashMap();

   private dvs(dvk<die, dvj> $$0) {
      this.b = $$0;
   }

   public static dvs a(die $$0) {
      return new dvs($$0.l());
   }

   public boolean a(@Nullable dvj $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dwm<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dvj $$0, dwm<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dvs a(dwm<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
