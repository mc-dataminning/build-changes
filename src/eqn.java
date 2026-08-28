import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqn {
   private final arf a;
   private final Map<etd<?>, Object> b;
   private final Map<alf, eqn.b> c;
   private final float d;

   public eqn(arf $$0, Map<etd<?>, Object> $$1, Map<alf, eqn.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arf a() {
      return this.a;
   }

   public boolean a(etd<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(etd<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(etd<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(etd<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(alf $$0, Consumer<cur> $$1) {
      eqn.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arf a;
      private final Map<etd<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<alf, eqn.b> c = Maps.newHashMap();
      private float d;

      public a(arf $$0) {
         this.a = $$0;
      }

      public arf a() {
         return this.a;
      }

      public <T> eqn.a a(etd<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eqn.a b(etd<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(etd<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(etd<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eqn.a a(alf $$0, eqn.b $$1) {
         eqn.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eqn.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eqn a(ete $$0) {
         Set<etd<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<etd<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eqn(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cur> var1);
   }
}
