import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class esw {
   private final arg a;
   private final Map<evm<?>, Object> b;
   private final Map<alb, esw.b> c;
   private final float d;

   public esw(arg $$0, Map<evm<?>, Object> $$1, Map<alb, esw.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arg a() {
      return this.a;
   }

   public boolean a(evm<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(evm<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(evm<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(evm<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(alb $$0, Consumer<cvl> $$1) {
      esw.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arg a;
      private final Map<evm<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<alb, esw.b> c = Maps.newHashMap();
      private float d;

      public a(arg $$0) {
         this.a = $$0;
      }

      public arg a() {
         return this.a;
      }

      public <T> esw.a a(evm<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> esw.a b(evm<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(evm<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(evm<T> $$0) {
         return (T)this.b.get($$0);
      }

      public esw.a a(alb $$0, esw.b $$1) {
         esw.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public esw.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public esw a(evn $$0) {
         Set<evm<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<evm<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new esw(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cvl> var1);
   }
}
