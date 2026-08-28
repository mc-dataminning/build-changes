import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewl {
   private final arx a;
   private final bbf b;
   private final Map<alp, ewl.b> c;
   private final float d;

   public ewl(arx $$0, bbf $$1, Map<alp, ewl.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arx a() {
      return this.a;
   }

   public bbf b() {
      return this.b;
   }

   public void a(alp $$0, Consumer<cxg> $$1) {
      ewl.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final arx a;
      private final bbf.a b = new bbf.a();
      private final Map<alp, ewl.b> c = Maps.newHashMap();
      private float d;

      public a(arx $$0) {
         this.a = $$0;
      }

      public arx a() {
         return this.a;
      }

      public <T> ewl.a a(bbd<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> ewl.a b(bbd<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bbd<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bbd<T> $$0) {
         return this.b.b($$0);
      }

      public ewl.a a(alp $$0, ewl.b $$1) {
         ewl.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ewl.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ewl a(bbe $$0) {
         bbf $$1 = this.b.a($$0);
         return new ewl(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cxg> var1);
   }
}
