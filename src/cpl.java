import java.util.Optional;

public class cpl extends cpo {
   private final biq a;

   public cpl(biq $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cpn $$0, cpb $$1, gw $$2, dfj $$3, eam $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cpn $$0, cpb $$1, gw $$2, dfj $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
