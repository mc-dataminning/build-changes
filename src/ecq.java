import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ecq {
   private final akt a;
   private final Map<ees<?>, Object> b;
   private final Map<aez, ecq.b> c;
   private final float d;

   public ecq(akt $$0, Map<ees<?>, Object> $$1, Map<aez, ecq.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public akt a() {
      return this.a;
   }

   public boolean a(ees<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ees<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ees<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ees<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aez $$0, Consumer<cjl> $$1) {
      ecq.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final akt a;
      private final Map<ees<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aez, ecq.b> c = Maps.newHashMap();
      private float d;

      public a(akt $$0) {
         this.a = $$0;
      }

      public akt a() {
         return this.a;
      }

      public <T> ecq.a a(ees<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ecq.a b(ees<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ees<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ees<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ecq.a a(aez $$0, ecq.b $$1) {
         ecq.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ecq.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ecq a(eet $$0) {
         Set<ees<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ees<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ecq(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cjl> var1);
   }
}
