import java.util.Optional;

public class dcp {
   public Optional<Float> a(dco $$0, dcc $$1, jd $$2, dtc $$3, epe $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dco $$0, dcc $$1, jd $$2, dtc $$3, float $$4) {
      return true;
   }

   public boolean a(dco $$0, bsr $$1) {
      return true;
   }

   public float a(bsr $$0) {
      return 1.0F;
   }

   public float b(dco $$0, bsr $$1) {
      float $$2 = $$0.a() * 2.0F;
      exc $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.g($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dco.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
