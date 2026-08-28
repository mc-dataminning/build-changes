import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqk {
   private final Path a;
   private aqj b;

   public aqk(Path $$0) {
      this.a = $$0;
      this.b = aqj.a($$0);
   }

   public aqj a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqk a(UnaryOperator<aqj> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
