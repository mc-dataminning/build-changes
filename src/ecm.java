import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ecm {
   private final akk a;
   private final Map<eeo<?>, Object> b;
   private final Map<aer, ecm.b> c;
   private final float d;

   public ecm(akk $$0, Map<eeo<?>, Object> $$1, Map<aer, ecm.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public akk a() {
      return this.a;
   }

   public boolean a(eeo<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eeo<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eeo<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eeo<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aer $$0, Consumer<cix> $$1) {
      ecm.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final akk a;
      private final Map<eeo<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aer, ecm.b> c = Maps.newHashMap();
      private float d;

      public a(akk $$0) {
         this.a = $$0;
      }

      public akk a() {
         return this.a;
      }

      public <T> ecm.a a(eeo<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ecm.a b(eeo<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eeo<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eeo<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ecm.a a(aer $$0, ecm.b $$1) {
         ecm.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ecm.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ecm a(eep $$0) {
         Set<eeo<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eeo<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ecm(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cix> var1);
   }
}
