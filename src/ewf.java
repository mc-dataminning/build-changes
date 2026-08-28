import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class ewf {
   private boolean a;

   public abstract tw a(tw var1, ju.a var2);

   public void g() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean h() {
      return this.a;
   }

   public tw a(ju.a $$0) {
      tw $$1 = new tw();
      $$1.a("data", this.a(new tw(), $$0));
      ul.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends ewf>(Supplier<T> a, BiFunction<tw, ju.a, T> b, bax c) {
   }
}
