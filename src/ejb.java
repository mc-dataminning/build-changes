import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ejb {
   private final aov a;
   private final Map<eld<?>, Object> b;
   private final Map<aiy, ejb.b> c;
   private final float d;

   public ejb(aov $$0, Map<eld<?>, Object> $$1, Map<aiy, ejb.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aov a() {
      return this.a;
   }

   public boolean a(eld<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(eld<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(eld<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(eld<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(aiy $$0, Consumer<coz> $$1) {
      ejb.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aov a;
      private final Map<eld<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<aiy, ejb.b> c = Maps.newHashMap();
      private float d;

      public a(aov $$0) {
         this.a = $$0;
      }

      public aov a() {
         return this.a;
      }

      public <T> ejb.a a(eld<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> ejb.a b(eld<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(eld<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(eld<T> $$0) {
         return (T)this.b.get($$0);
      }

      public ejb.a a(aiy $$0, ejb.b $$1) {
         ejb.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ejb.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ejb a(ele $$0) {
         Set<eld<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<eld<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new ejb(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<coz> var1);
   }
}
