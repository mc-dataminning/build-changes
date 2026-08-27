import java.util.Optional;

public class cpn extends cpq {
   private final bis a;

   public cpn(bis $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cpp $$0, cpd $$1, gw $$2, dfl $$3, eao $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cpp $$0, cpd $$1, gw $$2, dfl $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
