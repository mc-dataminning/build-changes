import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ela {
   private final apf a;
   private final Map<enc<?>, Object> b;
   private final Map<ajh, ela.b> c;
   private final float d;

   public ela(apf $$0, Map<enc<?>, Object> $$1, Map<ajh, ela.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public apf a() {
      return this.a;
   }

   public boolean a(enc<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(enc<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(enc<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(enc<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ajh $$0, Consumer<cqk> $$1) {
      ela.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final apf a;
      private final Map<enc<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ajh, ela.b> c = Maps.newHashMap();
      private float d;

      public a(apf $$0) {
         this.a = $$0;
      }

      public apf a() {
         return this.a;
      }

      public <T> ela.a a(enc<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ela.a b(enc<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(enc<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(enc<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ela.a a(ajh $$0, ela.b $$1) {
         ela.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ela.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ela a(end $$0) {
         Set<enc<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<enc<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ela(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cqk> var1);
   }
}
