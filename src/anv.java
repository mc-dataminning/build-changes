import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class anv {
   private final Path a;
   private anu b;

   public anv(Path $$0) {
      this.a = $$0;
      this.b = anu.a($$0);
   }

   public anu a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public anv a(UnaryOperator<anu> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
