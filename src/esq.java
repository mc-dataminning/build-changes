import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class esq {
   private boolean a;

   public abstract uj a(uj var1, jr.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public uj a(jr.a $$0) {
      uj $$1 = new uj();
      $$1.a("data", this.a(new uj(), $$0));
      uy.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends esq>(Supplier<T> a, BiFunction<uj, jr.a, T> b, bas c) {
   }
}
