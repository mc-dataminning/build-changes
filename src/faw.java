import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class faw {
   private final asb a;
   private final bbm b;
   private final Map<alr, faw.b> c;
   private final float d;

   public faw(asb $$0, bbm $$1, Map<alr, faw.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public asb a() {
      return this.a;
   }

   public bbm b() {
      return this.b;
   }

   public void a(alr $$0, Consumer<dak> $$1) {
      faw.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final asb a;
      private final bbm.a b = new bbm.a();
      private final Map<alr, faw.b> c = Maps.newHashMap();
      private float d;

      public a(asb $$0) {
         this.a = $$0;
      }

      public asb a() {
         return this.a;
      }

      public <T> faw.a a(bbk<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> faw.a b(bbk<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bbk<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bbk<T> $$0) {
         return this.b.b($$0);
      }

      public faw.a a(alr $$0, faw.b $$1) {
         faw.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public faw.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public faw a(bbl $$0) {
         bbm $$1 = this.b.a($$0);
         return new faw(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<dak> var1);
   }
}
