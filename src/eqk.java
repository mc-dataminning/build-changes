import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqk {
   private final are a;
   private final Map<eta<?>, Object> b;
   private final Map<ale, eqk.b> c;
   private final float d;

   public eqk(are $$0, Map<eta<?>, Object> $$1, Map<ale, eqk.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public are a() {
      return this.a;
   }

   public boolean a(eta<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eta<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eta<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eta<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ale $$0, Consumer<cuo> $$1) {
      eqk.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final are a;
      private final Map<eta<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ale, eqk.b> c = Maps.newHashMap();
      private float d;

      public a(are $$0) {
         this.a = $$0;
      }

      public are a() {
         return this.a;
      }

      public <T> eqk.a a(eta<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eqk.a b(eta<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eta<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eta<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eqk.a a(ale $$0, eqk.b $$1) {
         eqk.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eqk.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eqk a(etb $$0) {
         Set<eta<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eta<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eqk(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cuo> var1);
   }
}
