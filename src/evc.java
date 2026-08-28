import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class evc {
   private boolean a;

   public abstract um a(um var1, js.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public um a(js.a $$0) {
      um $$1 = new um();
      $$1.a("data", this.a(new um(), $$0));
      vb.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends evc>(Supplier<T> a, BiFunction<um, js.a, T> b, bbi c) {
   }
}
