import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ecn {
   private final aki a;
   private final Map<eeq<?>, Object> b;
   private final Map<aep, ecn.b> c;
   private final float d;

   public ecn(aki $$0, Map<eeq<?>, Object> $$1, Map<aep, ecn.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aki a() {
      return this.a;
   }

   public boolean a(eeq<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eeq<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eeq<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eeq<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aep $$0, Consumer<ciw> $$1) {
      ecn.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aki a;
      private final Map<eeq<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aep, ecn.b> c = Maps.newHashMap();
      private float d;

      public a(aki $$0) {
         this.a = $$0;
      }

      public aki a() {
         return this.a;
      }

      public <T> ecn.a a(eeq<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ecn.a b(eeq<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eeq<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eeq<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ecn.a a(aep $$0, ecn.b $$1) {
         ecn.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ecn.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ecn a(eer $$0) {
         Set<eeq<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eeq<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ecn(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<ciw> var1);
   }
}
