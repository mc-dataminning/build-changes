import java.util.Optional;

public class cvx {
   public Optional<Float> a(cvw $$0, cvk $$1, ib $$2, dme $$3, ehr $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(cvw $$0, cvk $$1, ib $$2, dme $$3, float $$4) {
      return true;
   }

   public boolean a(cvw $$0, bof $$1) {
      return true;
   }

   public float b(cvw $$0, bof $$1) {
      float $$2 = $$0.a() * 2.0F;
      eov $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)cvw.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
