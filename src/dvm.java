import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvm implements Predicate<dvd> {
   public static final Predicate<dvd> a = $$0 -> true;
   private final dve<dhy, dvd> b;
   private final Map<dwg<?>, Predicate<Object>> c = Maps.newHashMap();

   private dvm(dve<dhy, dvd> $$0) {
      this.b = $$0;
   }

   public static dvm a(dhy $$0) {
      return new dvm($$0.l());
   }

   public boolean a(@Nullable dvd $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dwg<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dvd $$0, dwg<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dvm a(dwg<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
