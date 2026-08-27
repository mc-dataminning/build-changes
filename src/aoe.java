import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aoe {
   private final Path a;
   private aod b;

   public aoe(Path $$0) {
      this.a = $$0;
      this.b = aod.a($$0);
   }

   public aod a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aoe a(UnaryOperator<aod> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
