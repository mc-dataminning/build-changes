import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqb {
   private final Path a;
   private aqa b;

   public aqb(Path $$0) {
      this.a = $$0;
      this.b = aqa.a($$0);
   }

   public aqa a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqb a(UnaryOperator<aqa> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
