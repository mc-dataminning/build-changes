import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class evv {
   private final ard a;
   private final bak b;
   private final Map<akv, evv.b> c;
   private final float d;

   public evv(ard $$0, bak $$1, Map<akv, evv.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ard a() {
      return this.a;
   }

   public bak b() {
      return this.b;
   }

   public void a(akv $$0, Consumer<cwq> $$1) {
      evv.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final ard a;
      private final bak.a b = new bak.a();
      private final Map<akv, evv.b> c = Maps.newHashMap();
      private float d;

      public a(ard $$0) {
         this.a = $$0;
      }

      public ard a() {
         return this.a;
      }

      public <T> evv.a a(bai<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> evv.a b(bai<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bai<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bai<T> $$0) {
         return this.b.b($$0);
      }

      public evv.a a(akv $$0, evv.b $$1) {
         evv.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public evv.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public evv a(baj $$0) {
         bak $$1 = this.b.a($$0);
         return new evv(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cwq> var1);
   }
}
