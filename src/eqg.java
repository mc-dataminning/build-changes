import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqg {
   private final arb a;
   private final Map<esw<?>, Object> b;
   private final Map<alb, eqg.b> c;
   private final float d;

   public eqg(arb $$0, Map<esw<?>, Object> $$1, Map<alb, eqg.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arb a() {
      return this.a;
   }

   public boolean a(esw<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(esw<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(esw<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(esw<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(alb $$0, Consumer<cuk> $$1) {
      eqg.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arb a;
      private final Map<esw<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<alb, eqg.b> c = Maps.newHashMap();
      private float d;

      public a(arb $$0) {
         this.a = $$0;
      }

      public arb a() {
         return this.a;
      }

      public <T> eqg.a a(esw<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eqg.a b(esw<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(esw<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(esw<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eqg.a a(alb $$0, eqg.b $$1) {
         eqg.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eqg.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eqg a(esx $$0) {
         Set<esw<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<esw<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eqg(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cuk> var1);
   }
}
