import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ajq {
   private final Path a;
   private ajp b;

   public ajq(Path $$0) {
      this.a = $$0;
      this.b = ajp.a($$0);
   }

   public ajp a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ajq a(UnaryOperator<ajp> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
