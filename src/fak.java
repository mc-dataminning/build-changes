import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fak {
   private final ars a;
   private final bbb b;
   private final Map<ali, fak.b> c;
   private final float d;

   public fak(ars $$0, bbb $$1, Map<ali, fak.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ars a() {
      return this.a;
   }

   public bbb b() {
      return this.b;
   }

   public void a(ali $$0, Consumer<czy> $$1) {
      fak.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final ars a;
      private final bbb.a b = new bbb.a();
      private final Map<ali, fak.b> c = Maps.newHashMap();
      private float d;

      public a(ars $$0) {
         this.a = $$0;
      }

      public ars a() {
         return this.a;
      }

      public <T> fak.a a(baz<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> fak.a b(baz<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(baz<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(baz<T> $$0) {
         return this.b.b($$0);
      }

      public fak.a a(ali $$0, fak.b $$1) {
         fak.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public fak.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public fak a(bba $$0) {
         bbb $$1 = this.b.a($$0);
         return new fak(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<czy> var1);
   }
}
