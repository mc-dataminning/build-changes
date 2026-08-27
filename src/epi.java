import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class epi {
   private final aqm a;
   private final Map<eru<?>, Object> b;
   private final Map<akm, epi.b> c;
   private final float d;

   public epi(aqm $$0, Map<eru<?>, Object> $$1, Map<akm, epi.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqm a() {
      return this.a;
   }

   public boolean a(eru<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eru<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eru<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eru<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akm $$0, Consumer<cto> $$1) {
      epi.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqm a;
      private final Map<eru<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akm, epi.b> c = Maps.newHashMap();
      private float d;

      public a(aqm $$0) {
         this.a = $$0;
      }

      public aqm a() {
         return this.a;
      }

      public <T> epi.a a(eru<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> epi.a b(eru<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eru<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eru<T> $$0) {
         return (T)this.b.get($$0);
      }

      public epi.a a(akm $$0, epi.b $$1) {
         epi.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public epi.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public epi a(erv $$0) {
         Set<eru<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eru<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new epi(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cto> var1);
   }
}
