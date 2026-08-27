import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class anz {
   private final Path a;
   private any b;

   public anz(Path $$0) {
      this.a = $$0;
      this.b = any.a($$0);
   }

   public any a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public anz a(UnaryOperator<any> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
