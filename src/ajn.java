import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ajn {
   private final Path a;
   private ajm b;

   public ajn(Path $$0) {
      this.a = $$0;
      this.b = ajm.a($$0);
   }

   public ajm a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ajn a(UnaryOperator<ajm> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
