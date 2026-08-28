import java.util.Optional;
import java.util.function.Function;

public class eit extends ehp {
   private final jt a;
   private final egw b;
   private final ehg c;
   private final ehj.o d;

   public eit(egv $$0, jt $$1, djo $$2, egw $$3, ehg $$4, ehj.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<eat> a(Function<iv, jf<dkp>> $$0, ecq $$1, iv $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public jt c() {
      return this.a;
   }

   public ehg d() {
      return this.c;
   }
}
