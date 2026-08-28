import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class evi {
   private boolean a;

   public abstract tq a(tq var1, jt.a var2);

   public void g() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean h() {
      return this.a;
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();
      $$1.a("data", this.a(new tq(), $$0));
      uf.e($$1);
      this.a(false);
      return $$1;
   }

   public static record a<T extends evi>(Supplier<T> a, BiFunction<tq, jt.a, T> b, bam c) {
   }
}
