import java.util.Optional;

public class dip {
   public Optional<Float> a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4) {
      return $$3.l() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dio $$0, dib $$1, iu $$2, dzz $$3, float $$4) {
      return true;
   }

   public boolean a(dio $$0, bwd $$1) {
      return true;
   }

   public float a(bwd $$0) {
      return 1.0F;
   }

   public float a(dio $$0, bwd $$1, float $$2) {
      float $$3 = $$0.e() * 2.0F;
      fei $$4 = $$0.f();
      double $$5 = Math.sqrt($$1.g($$4)) / (double)$$3;
      double $$6 = (1.0 - $$5) * (double)$$2;
      return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * (double)$$3 + 1.0);
   }
}
