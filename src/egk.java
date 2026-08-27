import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class egk {
   private final amp a;
   private final Map<eim<?>, Object> b;
   private final Map<agt, egk.b> c;
   private final float d;

   public egk(amp $$0, Map<eim<?>, Object> $$1, Map<agt, egk.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public amp a() {
      return this.a;
   }

   public boolean a(eim<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eim<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eim<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eim<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(agt $$0, Consumer<cmh> $$1) {
      egk.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final amp a;
      private final Map<eim<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<agt, egk.b> c = Maps.newHashMap();
      private float d;

      public a(amp $$0) {
         this.a = $$0;
      }

      public amp a() {
         return this.a;
      }

      public <T> egk.a a(eim<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> egk.a b(eim<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eim<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eim<T> $$0) {
         return (T)this.b.get($$0);
      }

      public egk.a a(agt $$0, egk.b $$1) {
         egk.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public egk.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public egk a(ein $$0) {
         Set<eim<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eim<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new egk(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cmh> var1);
   }
}
