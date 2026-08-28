import java.util.Optional;

public class dgb {
   public Optional<Float> a(dga $$0, dfn $$1, ji $$2, dwx $$3, esz $$4) {
      return $$3.l() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dga $$0, dfn $$1, ji $$2, dwx $$3, float $$4) {
      return true;
   }

   public boolean a(dga $$0, buk $$1) {
      return true;
   }

   public float a(buk $$0) {
      return 1.0F;
   }

   public float a(dga $$0, buk $$1, float $$2) {
      float $$3 = $$0.e() * 2.0F;
      fba $$4 = $$0.f();
      double $$5 = Math.sqrt($$1.f($$4)) / (double)$$3;
      double $$6 = (1.0 - $$5) * (double)$$2;
      return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * (double)$$3 + 1.0);
   }
}
