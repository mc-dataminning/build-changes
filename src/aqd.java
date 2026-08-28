import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqd {
   private final Path a;
   private aqc b;

   public aqd(Path $$0) {
      this.a = $$0;
      this.b = aqc.a($$0);
   }

   public aqc a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqd a(UnaryOperator<aqc> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
