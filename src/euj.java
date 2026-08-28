import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class euj {
   private final arq a;
   private final Map<ewz<?>, Object> b;
   private final Map<all, euj.b> c;
   private final float d;

   public euj(arq $$0, Map<ewz<?>, Object> $$1, Map<all, euj.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arq a() {
      return this.a;
   }

   public boolean a(ewz<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ewz<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ewz<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ewz<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(all $$0, Consumer<cwf> $$1) {
      euj.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arq a;
      private final Map<ewz<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<all, euj.b> c = Maps.newHashMap();
      private float d;

      public a(arq $$0) {
         this.a = $$0;
      }

      public arq a() {
         return this.a;
      }

      public <T> euj.a a(ewz<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> euj.a b(ewz<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ewz<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ewz<T> $$0) {
         return (T)this.b.get($$0);
      }

      public euj.a a(all $$0, euj.b $$1) {
         euj.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public euj.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public euj a(exa $$0) {
         Set<ewz<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ewz<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new euj(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cwf> var1);
   }
}
