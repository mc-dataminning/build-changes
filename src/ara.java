import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ara {
   private final Path a;
   private aqz b;

   public ara(Path $$0) {
      this.a = $$0;
      this.b = aqz.a($$0);
   }

   public aqz a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ara a(UnaryOperator<aqz> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
