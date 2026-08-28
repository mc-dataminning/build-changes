import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqz {
   private final aqm a;
   private final Map<etp<?>, Object> b;
   private final Map<akk, eqz.b> c;
   private final float d;

   public eqz(aqm $$0, Map<etp<?>, Object> $$1, Map<akk, eqz.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqm a() {
      return this.a;
   }

   public boolean a(etp<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(etp<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(etp<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(etp<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akk $$0, Consumer<cud> $$1) {
      eqz.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqm a;
      private final Map<etp<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akk, eqz.b> c = Maps.newHashMap();
      private float d;

      public a(aqm $$0) {
         this.a = $$0;
      }

      public aqm a() {
         return this.a;
      }

      public <T> eqz.a a(etp<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eqz.a b(etp<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(etp<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(etp<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eqz.a a(akk $$0, eqz.b $$1) {
         eqz.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eqz.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eqz a(etq $$0) {
         Set<etp<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<etp<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eqz(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cud> var1);
   }
}
