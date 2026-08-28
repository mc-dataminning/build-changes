import java.util.Map;

public record dhh(int a, Map<dhj, Integer> b, int c, je<awm> d, float e, float f, axr<cyz> g, alf<dhk> h) {
   public dbu a(dhj $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dbu.a $$2 = dbu.a();
      bwq $$3 = bwq.a($$0.a());
      alg $$4 = alg.b("armor." + $$0.b());
      $$2.a(byk.a, new byi($$4, (double)$$1, byi.a.a), $$3);
      $$2.a(byk.b, new byi($$4, (double)this.e, byi.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(byk.p, new byi($$4, (double)this.f, byi.a.a), $$3);
      }

      return $$2.a();
   }
}
