import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class elc {
   private final apf a;
   private final Map<ene<?>, Object> b;
   private final Map<ajh, elc.b> c;
   private final float d;

   public elc(apf $$0, Map<ene<?>, Object> $$1, Map<ajh, elc.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public apf a() {
      return this.a;
   }

   public boolean a(ene<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ene<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ene<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ene<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ajh $$0, Consumer<cqm> $$1) {
      elc.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final apf a;
      private final Map<ene<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ajh, elc.b> c = Maps.newHashMap();
      private float d;

      public a(apf $$0) {
         this.a = $$0;
      }

      public apf a() {
         return this.a;
      }

      public <T> elc.a a(ene<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> elc.a b(ene<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ene<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ene<T> $$0) {
         return (T)this.b.get($$0);
      }

      public elc.a a(ajh $$0, elc.b $$1) {
         elc.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public elc.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public elc a(enf $$0) {
         Set<ene<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ene<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new elc(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cqm> var1);
   }
}
