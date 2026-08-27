import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ehl {
   private final ane a;
   private final Map<ejn<?>, Object> b;
   private final Map<ahh, ehl.b> c;
   private final float d;

   public ehl(ane $$0, Map<ejn<?>, Object> $$1, Map<ahh, ehl.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ane a() {
      return this.a;
   }

   public boolean a(ejn<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ejn<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ejn<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ejn<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ahh $$0, Consumer<cng> $$1) {
      ehl.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final ane a;
      private final Map<ejn<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ahh, ehl.b> c = Maps.newHashMap();
      private float d;

      public a(ane $$0) {
         this.a = $$0;
      }

      public ane a() {
         return this.a;
      }

      public <T> ehl.a a(ejn<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ehl.a b(ejn<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ejn<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ejn<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ehl.a a(ahh $$0, ehl.b $$1) {
         ehl.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ehl.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ehl a(ejo $$0) {
         Set<ejn<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ejn<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ehl(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cng> var1);
   }
}
