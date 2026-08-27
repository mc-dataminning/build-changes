import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class enq {
   private final apu a;
   private final Map<epu<?>, Object> b;
   private final Map<ajv, enq.b> c;
   private final float d;

   public enq(apu $$0, Map<epu<?>, Object> $$1, Map<ajv, enq.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public apu a() {
      return this.a;
   }

   public boolean a(epu<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(epu<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(epu<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(epu<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ajv $$0, Consumer<crs> $$1) {
      enq.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final apu a;
      private final Map<epu<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ajv, enq.b> c = Maps.newHashMap();
      private float d;

      public a(apu $$0) {
         this.a = $$0;
      }

      public apu a() {
         return this.a;
      }

      public <T> enq.a a(epu<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> enq.a b(epu<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(epu<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(epu<T> $$0) {
         return (T)this.b.get($$0);
      }

      public enq.a a(ajv $$0, enq.b $$1) {
         enq.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public enq.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public enq a(epv $$0) {
         Set<epu<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<epu<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new enq(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<crs> var1);
   }
}
