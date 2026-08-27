import java.util.Optional;

public class czw {
   public Optional<Float> a(czv $$0, czj $$1, in $$2, dqh $$3, ema $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(czv $$0, czj $$1, in $$2, dqh $$3, float $$4) {
      return true;
   }

   public boolean a(czv $$0, brh $$1) {
      return true;
   }

   public float a() {
      return 1.0F;
   }

   public float b(czv $$0, brh $$1) {
      float $$2 = $$0.a() * 2.0F;
      etp $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)czv.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
