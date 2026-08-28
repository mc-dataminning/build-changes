import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class apw {
   private final Path a;
   private apv b;

   public apw(Path $$0) {
      this.a = $$0;
      this.b = apv.a($$0);
   }

   public apv a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public apw a(UnaryOperator<apv> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
