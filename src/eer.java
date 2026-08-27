import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eer {
   private final ama a;
   private final Map<egt<?>, Object> b;
   private final Map<agg, eer.b> c;
   private final float d;

   public eer(ama $$0, Map<egt<?>, Object> $$1, Map<agg, eer.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ama a() {
      return this.a;
   }

   public boolean a(egt<?> $$0) {
      return this.b.containsKey($$0);
   }

   public <T> T b(egt<T> $$0) {
      T $$1 = (T)this.b.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   @Nullable
   public <T> T c(egt<T> $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public <T> T d(egt<T> $$0) {
      return (T)this.b.get($$0);
   }

   public void a(agg $$0, Consumer<clb> $$1) {
      eer.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float b() {
      return this.d;
   }

   public static class a {
      private final ama a;
      private final Map<egt<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<agg, eer.b> c = Maps.newHashMap();
      private float d;

      public a(ama $$0) {
         this.a = $$0;
      }

      public ama a() {
         return this.a;
      }

      public <T> eer.a a(egt<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> eer.a b(egt<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public <T> T a(egt<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new NoSuchElementException($$0.a().toString());
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(egt<T> $$0) {
         return (T)this.b.get($$0);
      }

      public eer.a a(agg $$0, eer.b $$1) {
         eer.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eer.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eer a(egu $$0) {
         Set<egt<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<egt<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               return new eer(this.a, this.b, this.c, this.d);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<clb> var1);
   }
}
