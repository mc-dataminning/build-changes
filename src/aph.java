import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aph {
   private final Path a;
   private apg b;

   public aph(Path $$0) {
      this.a = $$0;
      this.b = apg.a($$0);
   }

   public apg a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aph a(UnaryOperator<apg> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
