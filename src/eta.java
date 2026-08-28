import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class eta {
   private boolean a;

   public abstract un a(un var1, js.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public un a(js.a $$0) {
      un $$1 = new un();
      $$1.a("data", this.a(new un(), $$0));
      vc.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends eta>(Supplier<T> a, BiFunction<un, js.a, T> b, bax c) {
   }
}
