import java.util.Optional;

public class cvg {
   public Optional<Float> a(cvf $$0, cut $$1, hz $$2, dlf $$3, egp $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(cvf $$0, cut $$1, hz $$2, dlf $$3, float $$4) {
      return true;
   }

   public boolean a(cvf $$0, bno $$1) {
      return true;
   }

   public float b(cvf $$0, bno $$1) {
      float $$2 = $$0.a() * 2.0F;
      ens $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)cvf.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
