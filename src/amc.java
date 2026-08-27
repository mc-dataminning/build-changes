import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class amc {
   private final Path a;
   private amb b;

   public amc(Path $$0) {
      this.a = $$0;
      this.b = amb.a($$0);
   }

   public amb a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public amc a(UnaryOperator<amb> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
