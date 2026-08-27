import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class apk {
   private final Path a;
   private apj b;

   public apk(Path $$0) {
      this.a = $$0;
      this.b = apj.a($$0);
   }

   public apj a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public apk a(UnaryOperator<apj> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
