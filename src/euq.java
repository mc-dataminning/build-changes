import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class euq {
   private final arp a;
   private final Map<exg<?>, Object> b;
   private final Map<alj, euq.b> c;
   private final float d;

   public euq(arp $$0, Map<exg<?>, Object> $$1, Map<alj, euq.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arp a() {
      return this.a;
   }

   public boolean a(exg<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(exg<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(exg<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(exg<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(alj $$0, Consumer<cwm> $$1) {
      euq.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final arp a;
      private final Map<exg<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<alj, euq.b> c = Maps.newHashMap();
      private float d;

      public a(arp $$0) {
         this.a = $$0;
      }

      public arp a() {
         return this.a;
      }

      public <T> euq.a a(exg<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> euq.a b(exg<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(exg<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(exg<T> $$0) {
         return (T)this.b.get($$0);
      }

      public euq.a a(alj $$0, euq.b $$1) {
         euq.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public euq.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public euq a(exh $$0) {
         Set<exg<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<exg<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new euq(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cwm> var1);
   }
}
