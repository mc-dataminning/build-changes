import java.util.Optional;

public class dka extends dkd {
   private final bxe a;

   public dka(bxe $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dkc $$0, djn $$1, iw $$2, ebq $$3, eya $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dkc $$0, djn $$1, iw $$2, ebq $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
