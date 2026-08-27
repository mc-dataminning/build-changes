import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class ald {
   private final Path a;
   private alc b;

   public ald(Path $$0) {
      this.a = $$0;
      this.b = alc.a($$0);
   }

   public alc a() {
      return this.b;
   }

   public void b() {
      this.b.c(this.a);
   }

   public ald a(UnaryOperator<alc> $$0) {
      (this.b = $$0.apply(this.b)).c(this.a);
      return this;
   }
}
