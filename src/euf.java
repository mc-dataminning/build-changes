import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class euf {
   private final arn a;
   private final Map<ewv<?>, Object> b;
   private final Map<ali, euf.b> c;
   private final float d;

   public euf(arn $$0, Map<ewv<?>, Object> $$1, Map<ali, euf.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arn a() {
      return this.a;
   }

   public boolean a(ewv<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(ewv<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(ewv<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(ewv<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(ali $$0, Consumer<cwb> $$1) {
      euf.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arn a;
      private final Map<ewv<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<ali, euf.b> c = Maps.newHashMap();
      private float d;

      public a(arn $$0) {
         this.a = $$0;
      }

      public arn a() {
         return this.a;
      }

      public <T> euf.a a(ewv<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> euf.a b(ewv<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(ewv<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(ewv<T> $$0) {
         return (T)this.b.get($$0);
      }

      public euf.a a(ali $$0, euf.b $$1) {
         euf.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public euf.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public euf a(eww $$0) {
         Set<ewv<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<ewv<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new euf(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cwb> var1);
   }
}
