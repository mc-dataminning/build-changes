import com.google.common.collect.Sets;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class baj {
   private final Map<bah<?>, Object> a;

   baj(Map<bah<?>, Object> $$0) {
      this.a = $$0;
   }

   public boolean a(bah<?> $$0) {
      return this.a.containsKey($$0);
   }

   public <T> T b(bah<T> $$0) {
      T $$1 = (T)this.a.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(bah<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Nullable
   @Contract("_,!null->!null; _,_->_")
   public <T> T a(bah<T> $$0, @Nullable T $$1) {
      return (T)this.a.getOrDefault($$0, $$1);
   }

   public static class a {
      private final Map<bah<?>, Object> a = new IdentityHashMap<>();

      public <T> baj.a a(bah<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> baj.a b(bah<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.a.remove($$0);
         } else {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(bah<T> $$0) {
         T $$1 = (T)this.a.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(bah<T> $$0) {
         return (T)this.a.get($$0);
      }

      public baj a(bai $$0) {
         Set<bah<?>> $$1 = Sets.difference(this.a.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<bah<?>> $$2 = Sets.difference($$0.a(), this.a.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new baj(this.a);
            }
         }
      }
   }
}
