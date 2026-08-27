import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eji {
   private final aow a;
   private final Map<elk<?>, Object> b;
   private final Map<aiy, eji.b> c;
   private final float d;

   public eji(aow $$0, Map<elk<?>, Object> $$1, Map<aiy, eji.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aow a() {
      return this.a;
   }

   public boolean a(elk<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(elk<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(elk<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(elk<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aiy $$0, Consumer<cpd> $$1) {
      eji.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aow a;
      private final Map<elk<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aiy, eji.b> c = Maps.newHashMap();
      private float d;

      public a(aow $$0) {
         this.a = $$0;
      }

      public aow a() {
         return this.a;
      }

      public <T> eji.a a(elk<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eji.a b(elk<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(elk<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(elk<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eji.a a(aiy $$0, eji.b $$1) {
         eji.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eji.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eji a(ell $$0) {
         Set<elk<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<elk<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eji(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cpd> var1);
   }
}
