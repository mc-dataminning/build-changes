import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ajk {
   private final Path a;
   private ajj b;

   public ajk(Path $$0) {
      this.a = $$0;
      this.b = ajj.a($$0);
   }

   public ajj a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ajk a(UnaryOperator<ajj> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
