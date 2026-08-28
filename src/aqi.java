import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class aqi {
   private final Path a;
   private aqh b;

   public aqi(Path $$0) {
      this.a = $$0;
      this.b = aqh.a($$0);
   }

   public aqh a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public aqi a(UnaryOperator<aqh> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
