import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duj implements Predicate<dua> {
   public static final Predicate<dua> a = $$0 -> true;
   private final dub<dgv, dua> b;
   private final Map<dvd<?>, Predicate<Object>> c = Maps.newHashMap();

   private duj(dub<dgv, dua> $$0) {
      this.b = $$0;
   }

   public static duj a(dgv $$0) {
      return new duj($$0.l());
   }

   public boolean a(@Nullable dua $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dvd<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dua $$0, dvd<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> duj a(dvd<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
