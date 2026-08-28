import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class esw {
   private boolean a;

   public abstract uk a(uk var1, js.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public uk a(js.a $$0) {
      uk $$1 = new uk();
      $$1.a("data", this.a(new uk(), $$0));
      uz.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends esw>(Supplier<T> a, BiFunction<uk, js.a, T> b, bat c) {
   }
}
