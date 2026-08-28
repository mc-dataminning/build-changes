import java.util.Optional;
import java.util.function.Function;

public class ecl extends ebh {
   private final kb a;
   private final eao b;
   private final eay c;
   private final ebb.o d;

   public ecl(ean $$0, kb $$1, dei $$2, eao $$3, eay $$4, ebb.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<duo> a(Function<je, jn<dfh>> $$0, dwk $$1, je $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public kb c() {
      return this.a;
   }

   public eay d() {
      return this.c;
   }
}
