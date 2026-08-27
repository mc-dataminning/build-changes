import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eog {
   private final aqe a;
   private final Map<eqq<?>, Object> b;
   private final Map<akf, eog.b> c;
   private final float d;

   public eog(aqe $$0, Map<eqq<?>, Object> $$1, Map<akf, eog.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqe a() {
      return this.a;
   }

   public boolean a(eqq<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eqq<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eqq<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eqq<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akf $$0, Consumer<csd> $$1) {
      eog.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqe a;
      private final Map<eqq<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akf, eog.b> c = Maps.newHashMap();
      private float d;

      public a(aqe $$0) {
         this.a = $$0;
      }

      public aqe a() {
         return this.a;
      }

      public <T> eog.a a(eqq<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eog.a b(eqq<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eqq<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eqq<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eog.a a(akf $$0, eog.b $$1) {
         eog.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eog.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eog a(eqr $$0) {
         Set<eqq<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eqq<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eog(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<csd> var1);
   }
}
