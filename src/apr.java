import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class apr {
   private final Path a;
   private apq b;

   public apr(Path $$0) {
      this.a = $$0;
      this.b = apq.a($$0);
   }

   public apq a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public apr a(UnaryOperator<apq> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
