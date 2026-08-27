import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ecw {
   private final akr a;
   private final Map<eey<?>, Object> b;
   private final Map<aex, ecw.b> c;
   private final float d;

   public ecw(akr $$0, Map<eey<?>, Object> $$1, Map<aex, ecw.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public akr a() {
      return this.a;
   }

   public boolean a(eey<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eey<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eey<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eey<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aex $$0, Consumer<cjf> $$1) {
      ecw.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final akr a;
      private final Map<eey<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aex, ecw.b> c = Maps.newHashMap();
      private float d;

      public a(akr $$0) {
         this.a = $$0;
      }

      public akr a() {
         return this.a;
      }

      public <T> ecw.a a(eey<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ecw.a b(eey<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eey<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eey<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ecw.a a(aex $$0, ecw.b $$1) {
         ecw.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ecw.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ecw a(eez $$0) {
         Set<eey<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eey<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ecw(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cjf> var1);
   }
}
