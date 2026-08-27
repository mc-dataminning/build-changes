import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzq {
   private final aif a;
   private final Map<ebt<?>, Object> b;
   private final Map<acq, dzq.b> c;
   private final float d;

   public dzq(aif $$0, Map<ebt<?>, Object> $$1, Map<acq, dzq.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aif a() {
      return this.a;
   }

   public boolean a(ebt<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ebt<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ebt<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ebt<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(acq $$0, Consumer<cfz> $$1) {
      dzq.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aif a;
      private final Map<ebt<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<acq, dzq.b> c = Maps.newHashMap();
      private float d;

      public a(aif $$0) {
         this.a = $$0;
      }

      public aif a() {
         return this.a;
      }

      public <T> dzq.a a(ebt<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> dzq.a b(ebt<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ebt<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ebt<T> $$0) {
         return (T)this.b.get($$0);
      }

      public dzq.a a(acq $$0, dzq.b $$1) {
         dzq.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public dzq.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public dzq a(ebu $$0) {
         Set<ebt<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ebt<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new dzq(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cfz> var1);
   }
}
