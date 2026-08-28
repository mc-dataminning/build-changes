import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqc {
   private final Path a;
   private aqb b;

   public aqc(Path $$0) {
      this.a = $$0;
      this.b = aqb.a($$0);
   }

   public aqb a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqc a(UnaryOperator<aqb> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
