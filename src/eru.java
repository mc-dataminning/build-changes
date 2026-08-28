import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eru {
   private final aqu a;
   private final Map<euk<?>, Object> b;
   private final Map<akr, eru.b> c;
   private final float d;

   public eru(aqu $$0, Map<euk<?>, Object> $$1, Map<akr, eru.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aqu a() {
      return this.a;
   }

   public boolean a(euk<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(euk<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(euk<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(euk<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(akr $$0, Consumer<cuq> $$1) {
      eru.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final aqu a;
      private final Map<euk<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<akr, eru.b> c = Maps.newHashMap();
      private float d;

      public a(aqu $$0) {
         this.a = $$0;
      }

      public aqu a() {
         return this.a;
      }

      public <T> eru.a a(euk<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eru.a b(euk<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(euk<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(euk<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eru.a a(akr $$0, eru.b $$1) {
         eru.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eru.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eru a(eul $$0) {
         Set<euk<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<euk<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eru(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cuq> var1);
   }
}
