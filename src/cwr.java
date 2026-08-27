import java.util.Optional;

public class cwr extends cwu {
   private final box a;

   public cwr(box $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cwt $$0, cwh $$1, ib $$2, dnb $$3, eip $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cwt $$0, cwh $$1, ib $$2, dnb $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
