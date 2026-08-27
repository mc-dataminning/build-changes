import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class apc {
   private final Path a;
   private apb b;

   public apc(Path $$0) {
      this.a = $$0;
      this.b = apb.a($$0);
   }

   public apb a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public apc a(UnaryOperator<apb> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
