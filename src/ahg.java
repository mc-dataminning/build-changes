import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ahg {
   private final Path a;
   private ahf b;

   public ahg(Path $$0) {
      this.a = $$0;
      this.b = ahf.a($$0);
   }

   public ahf a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ahg a(UnaryOperator<ahf> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
