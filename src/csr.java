import java.util.Optional;

public class csr {
   public Optional<Float> a(csq $$0, cse $$1, hv $$2, dip $$3, edz $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(csq $$0, cse $$1, hv $$2, dip $$3, float $$4) {
      return true;
   }

   public float a(csq $$0, blf $$1) {
      float $$2 = $$0.a() * 2.0F;
      elb $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)csq.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
