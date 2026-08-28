import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqj {
   private final are a;
   private final Map<esz<?>, Object> b;
   private final Map<ale, eqj.b> c;
   private final float d;

   public eqj(are $$0, Map<esz<?>, Object> $$1, Map<ale, eqj.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public are a() {
      return this.a;
   }

   public boolean a(esz<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(esz<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(esz<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(esz<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ale $$0, Consumer<cun> $$1) {
      eqj.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final are a;
      private final Map<esz<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ale, eqj.b> c = Maps.newHashMap();
      private float d;

      public a(are $$0) {
         this.a = $$0;
      }

      public are a() {
         return this.a;
      }

      public <T> eqj.a a(esz<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eqj.a b(esz<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(esz<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(esz<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eqj.a a(ale $$0, eqj.b $$1) {
         eqj.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eqj.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eqj a(eta $$0) {
         Set<esz<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<esz<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eqj(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cun> var1);
   }
}
