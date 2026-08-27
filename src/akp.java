import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class akp {
   private final Path a;
   private ako b;

   public akp(Path $$0) {
      this.a = $$0;
      this.b = ako.a($$0);
   }

   public ako a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public akp a(UnaryOperator<ako> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
