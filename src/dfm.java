import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfm implements Predicate<dfd> {
   public static final Predicate<dfd> a = $$0 -> true;
   private final dfe<ctc, dfd> b;
   private final Map<dgg<?>, Predicate<Object>> c = Maps.newHashMap();

   private dfm(dfe<ctc, dfd> $$0) {
      this.b = $$0;
   }

   public static dfm a(ctc $$0) {
      return new dfm($$0.n());
   }

   public boolean a(@Nullable dfd $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dgg<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dfd $$0, dgg<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dfm a(dgg<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
