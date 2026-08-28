import java.util.Optional;

public class dbm {
   public Optional<Float> a(dbl $$0, daz $$1, iz $$2, drx $$3, enq $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dbl $$0, daz $$1, iz $$2, drx $$3, float $$4) {
      return true;
   }

   public boolean a(dbl $$0, bsp $$1) {
      return true;
   }

   public float a(bsp $$0) {
      return 1.0F;
   }

   public float b(dbl $$0, bsp $$1) {
      float $$2 = $$0.a() * 2.0F;
      evm $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)dbl.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
