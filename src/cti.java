import java.util.Optional;

public class cti {
   public Optional<Float> a(cth $$0, csv $$1, hx $$2, djh $$3, eer $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(cth $$0, csv $$1, hx $$2, djh $$3, float $$4) {
      return true;
   }

   public boolean a(cth $$0, blv $$1) {
      return true;
   }

   public float b(cth $$0, blv $$1) {
      float $$2 = $$0.a() * 2.0F;
      elt $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)cth.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
