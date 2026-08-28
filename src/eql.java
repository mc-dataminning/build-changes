import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eql {
   private final arf a;
   private final Map<etb<?>, Object> b;
   private final Map<alf, eql.b> c;
   private final float d;

   public eql(arf $$0, Map<etb<?>, Object> $$1, Map<alf, eql.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arf a() {
      return this.a;
   }

   public boolean a(etb<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(etb<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(etb<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(etb<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(alf $$0, Consumer<cup> $$1) {
      eql.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arf a;
      private final Map<etb<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<alf, eql.b> c = Maps.newHashMap();
      private float d;

      public a(arf $$0) {
         this.a = $$0;
      }

      public arf a() {
         return this.a;
      }

      public <T> eql.a a(etb<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eql.a b(etb<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(etb<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(etb<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eql.a a(alf $$0, eql.b $$1) {
         eql.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eql.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eql a(etc $$0) {
         Set<etb<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<etb<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eql(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cup> var1);
   }
}
