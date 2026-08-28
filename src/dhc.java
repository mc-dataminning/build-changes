import java.util.Map;

public record dhc(int a, Map<dhe, Integer> b, int c, je<awm> d, float e, float f, axr<cyu> g, alf<dhf> h) {
   public dbp a(dhe $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dbp.a $$2 = dbp.a();
      bwo $$3 = bwo.a($$0.a());
      alg $$4 = alg.b("armor." + $$0.b());
      $$2.a(byi.a, new byg($$4, (double)$$1, byg.a.a), $$3);
      $$2.a(byi.b, new byg($$4, (double)this.e, byg.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(byi.p, new byg($$4, (double)this.f, byg.a.a), $$3);
      }

      return $$2.a();
   }
}
