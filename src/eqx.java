import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqx {
   private final aqm a;
   private final Map<etn<?>, Object> b;
   private final Map<akk, eqx.b> c;
   private final float d;

   public eqx(aqm $$0, Map<etn<?>, Object> $$1, Map<akk, eqx.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqm a() {
      return this.a;
   }

   public boolean a(etn<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(etn<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(etn<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(etn<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akk $$0, Consumer<cuc> $$1) {
      eqx.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqm a;
      private final Map<etn<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akk, eqx.b> c = Maps.newHashMap();
      private float d;

      public a(aqm $$0) {
         this.a = $$0;
      }

      public aqm a() {
         return this.a;
      }

      public <T> eqx.a a(etn<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eqx.a b(etn<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(etn<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(etn<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eqx.a a(akk $$0, eqx.b $$1) {
         eqx.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eqx.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eqx a(eto $$0) {
         Set<etn<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<etn<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eqx(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cuc> var1);
   }
}
