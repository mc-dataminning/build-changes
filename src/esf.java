import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class esf {
   private boolean a;

   public abstract ug a(ug var1, jq.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public ug a(jq.a $$0) {
      ug $$1 = new ug();
      $$1.a("data", this.a(new ug(), $$0));
      uv.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends esf>(Supplier<T> a, BiFunction<ug, jq.a, T> b, bao c) {
   }
}
