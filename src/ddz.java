import java.util.Optional;

public class ddz {
   public Optional<Float> a(ddy $$0, ddl $$1, je $$2, duo $$3, eqp $$4) {
      return $$3.l() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(ddy $$0, ddl $$1, je $$2, duo $$3, float $$4) {
      return true;
   }

   public boolean a(ddy $$0, bto $$1) {
      return true;
   }

   public float a(bto $$0) {
      return 1.0F;
   }

   public float a(ddy $$0, bto $$1, float $$2) {
      float $$3 = $$0.d() * 2.0F;
      eys $$4 = $$0.e();
      double $$5 = Math.sqrt($$1.f($$4)) / (double)$$3;
      double $$6 = (1.0 - $$5) * (double)$$2;
      return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * (double)$$3 + 1.0);
   }
}
