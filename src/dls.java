import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dls implements Predicate<dlj> {
   public static final Predicate<dlj> a = $$0 -> true;
   private final dlk<cys, dlj> b;
   private final Map<dmm<?>, Predicate<Object>> c = Maps.newHashMap();

   private dls(dlk<cys, dlj> $$0) {
      this.b = $$0;
   }

   public static dls a(cys $$0) {
      return new dls($$0.n());
   }

   public boolean a(@Nullable dlj $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dmm<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dlj $$0, dmm<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dls a(dmm<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
