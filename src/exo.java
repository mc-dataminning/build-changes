import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exo {
   private final arn a;
   private final bav b;
   private final Map<ald, exo.b> c;
   private final float d;

   public exo(arn $$0, bav $$1, Map<ald, exo.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arn a() {
      return this.a;
   }

   public bav b() {
      return this.b;
   }

   public void a(ald $$0, Consumer<cxy> $$1) {
      exo.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final arn a;
      private final bav.a b = new bav.a();
      private final Map<ald, exo.b> c = Maps.newHashMap();
      private float d;

      public a(arn $$0) {
         this.a = $$0;
      }

      public arn a() {
         return this.a;
      }

      public <T> exo.a a(bat<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> exo.a b(bat<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bat<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bat<T> $$0) {
         return this.b.b($$0);
      }

      public exo.a a(ald $$0, exo.b $$1) {
         exo.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public exo.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public exo a(bau $$0) {
         bav $$1 = this.b.a($$0);
         return new exo(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cxy> var1);
   }
}
