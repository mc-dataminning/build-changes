import java.util.Optional;

public class dhb {
   public Optional<Float> a(dha $$0, dgn $$1, jh $$2, dxv $$3, etx $$4) {
      return $$3.l() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dha $$0, dgn $$1, jh $$2, dxv $$3, float $$4) {
      return true;
   }

   public boolean a(dha $$0, bvk $$1) {
      return true;
   }

   public float a(bvk $$0) {
      return 1.0F;
   }

   public float a(dha $$0, bvk $$1, float $$2) {
      float $$3 = $$0.e() * 2.0F;
      fby $$4 = $$0.f();
      double $$5 = Math.sqrt($$1.f($$4)) / (double)$$3;
      double $$6 = (1.0 - $$5) * (double)$$2;
      return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * (double)$$3 + 1.0);
   }
}
