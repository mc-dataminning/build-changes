import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class exh {
   private boolean a;

   public abstract tx a(tx var1, jg.a var2);

   public void g() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean h() {
      return this.a;
   }

   public tx a(jg.a $$0) {
      tx $$1 = new tx();
      $$1.a("data", this.a(new tx(), $$0));
      um.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends exh>(Supplier<T> a, BiFunction<tx, jg.a, T> b, baz c) {
   }
}
