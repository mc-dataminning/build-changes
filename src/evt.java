import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class evt {
   private final ard a;
   private final bak b;
   private final Map<akv, evt.b> c;
   private final float d;

   public evt(ard $$0, bak $$1, Map<akv, evt.b> $$2, float $$3) {
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

   public void a(akv $$0, Consumer<cwo> $$1) {
      evt.b $$2 = this.c.get($$0);
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
      private final Map<akv, evt.b> c = Maps.newHashMap();
      private float d;

      public a(ard $$0) {
         this.a = $$0;
      }

      public ard a() {
         return this.a;
      }

      public <T> evt.a a(bai<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> evt.a b(bai<T> $$0, @Nullable T $$1) {
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

      public evt.a a(akv $$0, evt.b $$1) {
         evt.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public evt.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public evt a(baj $$0) {
         bak $$1 = this.b.a($$0);
         return new evt(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cwo> var1);
   }
}
