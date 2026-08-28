import com.google.common.collect.Sets;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class bbp {
   private final Map<bbn<?>, Object> a;

   bbp(Map<bbn<?>, Object> $$0) {
      this.a = $$0;
   }

   public boolean a(bbn<?> $$0) {
      return this.a.containsKey($$0);
   }

   public <T> T b(bbn<T> $$0) {
      T $$1 = (T)this.a.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(bbn<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Nullable
   @Contract("_,!null->!null; _,_->_")
   public <T> T a(bbn<T> $$0, @Nullable T $$1) {
      return (T)this.a.getOrDefault($$0, $$1);
   }

   public static class a {
      private final Map<bbn<?>, Object> a = new IdentityHashMap<>();

      public <T> bbp.a a(bbn<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> bbp.a b(bbn<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.a.remove($$0);
         } else {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(bbn<T> $$0) {
         T $$1 = (T)this.a.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(bbn<T> $$0) {
         return (T)this.a.get($$0);
      }

      public bbp a(bbo $$0) {
         Set<bbn<?>> $$1 = Sets.difference(this.a.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<bbn<?>> $$2 = Sets.difference($$0.a(), this.a.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new bbp(this.a);
            }
         }
      }
   }
}
