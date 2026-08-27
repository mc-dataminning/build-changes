import java.util.Optional;

public class cyz {
   public Optional<Float> a(cyy $$0, cym $$1, id $$2, dpi $$3, elb $$4) {
      return $$3.i() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(cyy $$0, cym $$1, id $$2, dpi $$3, float $$4) {
      return true;
   }

   public boolean a(cyy $$0, bqa $$1) {
      return true;
   }

   public float a() {
      return 1.0F;
   }

   public float b(cyy $$0, bqa $$1) {
      float $$2 = $$0.a() * 2.0F;
      esj $$3 = $$0.b();
      double $$4 = Math.sqrt($$1.f($$3)) / (double)$$2;
      double $$5 = (1.0 - $$4) * (double)cyy.a($$3, $$1);
      return (float)(($$5 * $$5 + $$5) / 2.0 * 7.0 * (double)$$2 + 1.0);
   }
}
