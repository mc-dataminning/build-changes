import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewk {
   private final ash a;
   private final Map<eza<?>, Object> b;
   private final Map<alz, ewk.b> c;
   private final float d;

   public ewk(ash $$0, Map<eza<?>, Object> $$1, Map<alz, ewk.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ash a() {
      return this.a;
   }

   public boolean a(eza<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eza<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eza<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eza<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(alz $$0, Consumer<cxk> $$1) {
      ewk.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final ash a;
      private final Map<eza<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<alz, ewk.b> c = Maps.newHashMap();
      private float d;

      public a(ash $$0) {
         this.a = $$0;
      }

      public ash a() {
         return this.a;
      }

      public <T> ewk.a a(eza<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ewk.a b(eza<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eza<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eza<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ewk.a a(alz $$0, ewk.b $$1) {
         ewk.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ewk.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ewk a(ezb $$0) {
         Set<eza<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eza<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ewk(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cxk> var1);
   }
}
