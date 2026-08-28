import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqh {
   private final Path a;
   private aqg b;

   public aqh(Path $$0) {
      this.a = $$0;
      this.b = aqg.a($$0);
   }

   public aqg a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqh a(UnaryOperator<aqg> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
