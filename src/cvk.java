import java.util.Optional;

public class cvk {
   public Optional<Float> a(cvj $$0, cux $$1, hz $$2, dlj $$3, egw $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(cvj $$0, cux $$1, hz $$2, dlj $$3, float $$4) {
      return true;
   }

   public boolean a(cvj $$0, bnq $$1) {
      return true;
   }

   public float b(cvj $$0, bnq $$1) {
      float $$2 = $$0.a() * 2.0F;
      enz $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)cvj.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
