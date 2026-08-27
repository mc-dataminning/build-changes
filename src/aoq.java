import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aoq {
   private final Path a;
   private aop b;

   public aoq(Path $$0) {
      this.a = $$0;
      this.b = aop.a($$0);
   }

   public aop a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aoq a(UnaryOperator<aop> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
