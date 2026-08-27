import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ajr {
   private final Path a;
   private ajq b;

   public ajr(Path $$0) {
      this.a = $$0;
      this.b = ajq.a($$0);
   }

   public ajq a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ajr a(UnaryOperator<ajq> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
