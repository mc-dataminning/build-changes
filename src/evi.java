import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class evi {
   private boolean a;

   public abstract ux a(ux var1, js.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public ux a(js.a $$0) {
      ux $$1 = new ux();
      $$1.a("data", this.a(new ux(), $$0));
      vm.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends evi>(Supplier<T> a, BiFunction<ux, js.a, T> b, bbs c) {
   }
}
