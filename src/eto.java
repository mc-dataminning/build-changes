import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eto {
   private final arj a;
   private final Map<ewe<?>, Object> b;
   private final Map<ale, eto.b> c;
   private final float d;

   public eto(arj $$0, Map<ewe<?>, Object> $$1, Map<ale, eto.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arj a() {
      return this.a;
   }

   public boolean a(ewe<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ewe<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ewe<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ewe<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ale $$0, Consumer<cvs> $$1) {
      eto.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arj a;
      private final Map<ewe<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ale, eto.b> c = Maps.newHashMap();
      private float d;

      public a(arj $$0) {
         this.a = $$0;
      }

      public arj a() {
         return this.a;
      }

      public <T> eto.a a(ewe<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eto.a b(ewe<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ewe<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ewe<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eto.a a(ale $$0, eto.b $$1) {
         eto.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eto.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eto a(ewf $$0) {
         Set<ewe<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ewe<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eto(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cvs> var1);
   }
}
