import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fam {
   private final aru a;
   private final bbd b;
   private final Map<alk, fam.b> c;
   private final float d;

   public fam(aru $$0, bbd $$1, Map<alk, fam.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aru a() {
      return this.a;
   }

   public bbd b() {
      return this.b;
   }

   public void a(alk $$0, Consumer<daa> $$1) {
      fam.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final aru a;
      private final bbd.a b = new bbd.a();
      private final Map<alk, fam.b> c = Maps.newHashMap();
      private float d;

      public a(aru $$0) {
         this.a = $$0;
      }

      public aru a() {
         return this.a;
      }

      public <T> fam.a a(bbb<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> fam.a b(bbb<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bbb<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bbb<T> $$0) {
         return this.b.b($$0);
      }

      public fam.a a(alk $$0, fam.b $$1) {
         fam.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public fam.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public fam a(bbc $$0) {
         bbd $$1 = this.b.a($$0);
         return new fam(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<daa> var1);
   }
}
