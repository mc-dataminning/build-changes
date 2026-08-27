import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aly {
   private final Path a;
   private alx b;

   public aly(Path $$0) {
      this.a = $$0;
      this.b = alx.a($$0);
   }

   public alx a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aly a(UnaryOperator<alx> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
