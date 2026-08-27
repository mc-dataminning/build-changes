import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class apl {
   private final Path a;
   private apk b;

   public apl(Path $$0) {
      this.a = $$0;
      this.b = apk.a($$0);
   }

   public apk a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public apl a(UnaryOperator<apk> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
