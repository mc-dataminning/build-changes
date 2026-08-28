import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqt {
   private final Path a;
   private aqs b;

   public aqt(Path $$0) {
      this.a = $$0;
      this.b = aqs.a($$0);
   }

   public aqs a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqt a(UnaryOperator<aqs> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
