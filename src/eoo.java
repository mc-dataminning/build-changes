import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eoo {
   private final aqh a;
   private final Map<eqz<?>, Object> b;
   private final Map<akh, eoo.b> c;
   private final float d;

   public eoo(aqh $$0, Map<eqz<?>, Object> $$1, Map<akh, eoo.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqh a() {
      return this.a;
   }

   public boolean a(eqz<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eqz<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eqz<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eqz<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akh $$0, Consumer<csz> $$1) {
      eoo.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqh a;
      private final Map<eqz<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akh, eoo.b> c = Maps.newHashMap();
      private float d;

      public a(aqh $$0) {
         this.a = $$0;
      }

      public aqh a() {
         return this.a;
      }

      public <T> eoo.a a(eqz<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eoo.a b(eqz<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eqz<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eqz<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eoo.a a(akh $$0, eoo.b $$1) {
         eoo.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eoo.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eoo a(era $$0) {
         Set<eqz<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eqz<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eoo(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<csz> var1);
   }
}
