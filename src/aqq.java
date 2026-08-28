import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqq {
   private final Path a;
   private aqp b;

   public aqq(Path $$0) {
      this.a = $$0;
      this.b = aqp.a($$0);
   }

   public aqp a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqq a(UnaryOperator<aqp> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
