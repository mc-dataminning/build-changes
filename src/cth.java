import java.util.Optional;

public class cth {
   public Optional<Float> a(ctg $$0, csu $$1, hx $$2, djg $$3, eeq $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(ctg $$0, csu $$1, hx $$2, djg $$3, float $$4) {
      return true;
   }

   public boolean a(ctg $$0, blu $$1) {
      return true;
   }

   public float b(ctg $$0, blu $$1) {
      float $$2 = $$0.a() * 2.0F;
      els $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)ctg.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
