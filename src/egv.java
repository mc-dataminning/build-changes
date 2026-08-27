import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class egv {
   private final amz a;
   private final Map<eix<?>, Object> b;
   private final Map<ahd, egv.b> c;
   private final float d;

   public egv(amz $$0, Map<eix<?>, Object> $$1, Map<ahd, egv.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public amz a() {
      return this.a;
   }

   public boolean a(eix<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eix<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eix<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eix<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ahd $$0, Consumer<cmr> $$1) {
      egv.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final amz a;
      private final Map<eix<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ahd, egv.b> c = Maps.newHashMap();
      private float d;

      public a(amz $$0) {
         this.a = $$0;
      }

      public amz a() {
         return this.a;
      }

      public <T> egv.a a(eix<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> egv.a b(eix<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eix<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eix<T> $$0) {
         return (T)this.b.get($$0);
      }

      public egv.a a(ahd $$0, egv.b $$1) {
         egv.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public egv.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public egv a(eiy $$0) {
         Set<eix<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eix<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new egv(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cmr> var1);
   }
}
