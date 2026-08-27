import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class edo {
   private final alq a;
   private final Map<efq<?>, Object> b;
   private final Map<afw, edo.b> c;
   private final float d;

   public edo(alq $$0, Map<efq<?>, Object> $$1, Map<afw, edo.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public alq a() {
      return this.a;
   }

   public boolean a(efq<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(efq<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(efq<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(efq<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(afw $$0, Consumer<ckj> $$1) {
      edo.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final alq a;
      private final Map<efq<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<afw, edo.b> c = Maps.newHashMap();
      private float d;

      public a(alq $$0) {
         this.a = $$0;
      }

      public alq a() {
         return this.a;
      }

      public <T> edo.a a(efq<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> edo.a b(efq<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(efq<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(efq<T> $$0) {
         return (T)this.b.get($$0);
      }

      public edo.a a(afw $$0, edo.b $$1) {
         edo.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public edo.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public edo a(efr $$0) {
         Set<efq<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<efq<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new edo(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<ckj> var1);
   }
}
