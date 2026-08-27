import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class alh {
   private final Path a;
   private alg b;

   public alh(Path $$0) {
      this.a = $$0;
      this.b = alg.a($$0);
   }

   public alg a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public alh a(UnaryOperator<alg> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
