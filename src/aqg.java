import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqg {
   private final Path a;
   private aqf b;

   public aqg(Path $$0) {
      this.a = $$0;
      this.b = aqf.a($$0);
   }

   public aqf a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqg a(UnaryOperator<aqf> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
