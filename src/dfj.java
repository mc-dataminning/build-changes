import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfj implements Predicate<dfa> {
   public static final Predicate<dfa> a = $$0 -> true;
   private final dfb<csm, dfa> b;
   private final Map<dgd<?>, Predicate<Object>> c = Maps.newHashMap();

   private dfj(dfb<csm, dfa> $$0) {
      this.b = $$0;
   }

   public static dfj a(csm $$0) {
      return new dfj($$0.l());
   }

   public boolean a(@Nullable dfa $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for (Entry<dgd<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
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

   protected <T extends Comparable<T>> boolean a(dfa $$0, dgd<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> dfj a(dgd<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
