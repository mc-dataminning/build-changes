import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ecr {
   private final akn a;
   private final Map<eet<?>, Object> b;
   private final Map<aeu, ecr.b> c;
   private final float d;

   public ecr(akn $$0, Map<eet<?>, Object> $$1, Map<aeu, ecr.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public akn a() {
      return this.a;
   }

   public boolean a(eet<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eet<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eet<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eet<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aeu $$0, Consumer<cja> $$1) {
      ecr.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final akn a;
      private final Map<eet<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aeu, ecr.b> c = Maps.newHashMap();
      private float d;

      public a(akn $$0) {
         this.a = $$0;
      }

      public akn a() {
         return this.a;
      }

      public <T> ecr.a a(eet<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ecr.a b(eet<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eet<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eet<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ecr.a a(aeu $$0, ecr.b $$1) {
         ecr.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ecr.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ecr a(eeu $$0) {
         Set<eet<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eet<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ecr(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cja> var1);
   }
}
