import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqf {
   private final Path a;
   private aqe b;

   public aqf(Path $$0) {
      this.a = $$0;
      this.b = aqe.a($$0);
   }

   public aqe a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqf a(UnaryOperator<aqe> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
