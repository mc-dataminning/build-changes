import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eke {
   private final apa a;
   private final Map<emg<?>, Object> b;
   private final Map<ajc, eke.b> c;
   private final float d;

   public eke(apa $$0, Map<emg<?>, Object> $$1, Map<ajc, eke.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public apa a() {
      return this.a;
   }

   public boolean a(emg<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(emg<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(emg<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(emg<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ajc $$0, Consumer<cpq> $$1) {
      eke.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final apa a;
      private final Map<emg<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ajc, eke.b> c = Maps.newHashMap();
      private float d;

      public a(apa $$0) {
         this.a = $$0;
      }

      public apa a() {
         return this.a;
      }

      public <T> eke.a a(emg<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eke.a b(emg<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(emg<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(emg<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eke.a a(ajc $$0, eke.b $$1) {
         eke.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eke.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eke a(emh $$0) {
         Set<emg<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<emg<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eke(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cpq> var1);
   }
}
