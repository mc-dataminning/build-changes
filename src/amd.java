import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class amd {
   private final Path a;
   private amc b;

   public amd(Path $$0) {
      this.a = $$0;
      this.b = amc.a($$0);
   }

   public amc a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public amd a(UnaryOperator<amc> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
