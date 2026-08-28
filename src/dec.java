import java.util.Optional;

public class dec {
   public Optional<Float> a(deb $$0, ddo $$1, jf $$2, dus $$3, eqt $$4) {
      return $$3.l() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(deb $$0, ddo $$1, jf $$2, dus $$3, float $$4) {
      return true;
   }

   public boolean a(deb $$0, btr $$1) {
      return true;
   }

   public float a(btr $$0) {
      return 1.0F;
   }

   public float a(deb $$0, btr $$1, float $$2) {
      float $$3 = $$0.d() * 2.0F;
      eyw $$4 = $$0.e();
      double $$5 = Math.sqrt($$1.f($$4)) / (double)$$3;
      double $$6 = (1.0 - $$5) * (double)$$2;
      return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * (double)$$3 + 1.0);
   }
}
