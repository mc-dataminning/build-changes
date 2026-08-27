import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class epk {
   private final aqn a;
   private final Map<erw<?>, Object> b;
   private final Map<akn, epk.b> c;
   private final float d;

   public epk(aqn $$0, Map<erw<?>, Object> $$1, Map<akn, epk.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqn a() {
      return this.a;
   }

   public boolean a(erw<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(erw<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(erw<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(erw<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akn $$0, Consumer<ctq> $$1) {
      epk.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqn a;
      private final Map<erw<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akn, epk.b> c = Maps.newHashMap();
      private float d;

      public a(aqn $$0) {
         this.a = $$0;
      }

      public aqn a() {
         return this.a;
      }

      public <T> epk.a a(erw<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> epk.a b(erw<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(erw<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(erw<T> $$0) {
         return (T)this.b.get($$0);
      }

      public epk.a a(akn $$0, epk.b $$1) {
         epk.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public epk.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public epk a(erx $$0) {
         Set<erw<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<erw<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new epk(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<ctq> var1);
   }
}
