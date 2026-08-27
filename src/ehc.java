import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ehc {
   private final and a;
   private final Map<eje<?>, Object> b;
   private final Map<ahg, ehc.b> c;
   private final float d;

   public ehc(and $$0, Map<eje<?>, Object> $$1, Map<ahg, ehc.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public and a() {
      return this.a;
   }

   public boolean a(eje<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eje<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eje<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eje<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ahg $$0, Consumer<cmy> $$1) {
      ehc.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final and a;
      private final Map<eje<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ahg, ehc.b> c = Maps.newHashMap();
      private float d;

      public a(and $$0) {
         this.a = $$0;
      }

      public and a() {
         return this.a;
      }

      public <T> ehc.a a(eje<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ehc.a b(eje<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eje<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eje<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ehc.a a(ahg $$0, ehc.b $$1) {
         ehc.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ehc.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ehc a(ejf $$0) {
         Set<eje<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eje<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ehc(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cmy> var1);
   }
}
