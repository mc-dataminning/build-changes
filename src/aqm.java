import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqm {
   private final Path a;
   private aql b;

   public aqm(Path $$0) {
      this.a = $$0;
      this.b = aql.a($$0);
   }

   public aql a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqm a(UnaryOperator<aql> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
