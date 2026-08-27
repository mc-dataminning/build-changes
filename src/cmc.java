import java.util.Optional;

public class cmc extends cmf {
   private final bfj a;

   public cmc(bfj $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cme $$0, cls $$1, gu $$2, dcb $$3, dxe $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cme $$0, cls $$1, gu $$2, dcb $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
