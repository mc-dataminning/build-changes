import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ajs {
   private final Path a;
   private ajr b;

   public ajs(Path $$0) {
      this.a = $$0;
      this.b = ajr.a($$0);
   }

   public ajr a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ajs a(UnaryOperator<ajr> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
