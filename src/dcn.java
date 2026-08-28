import java.util.Optional;

public class dcn {
   public Optional<Float> a(dcm $$0, dca $$1, jd $$2, dta $$3, eoy $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dcm $$0, dca $$1, jd $$2, dta $$3, float $$4) {
      return true;
   }

   public boolean a(dcm $$0, bsq $$1) {
      return true;
   }

   public float a(bsq $$0) {
      return 1.0F;
   }

   public float b(dcm $$0, bsq $$1) {
      float $$2 = $$0.a() * 2.0F;
      eww $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.g($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dcm.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
