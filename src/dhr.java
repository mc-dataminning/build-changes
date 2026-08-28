import java.util.Map;

public record dhr(int a, Map<dht, Integer> b, int c, jf<awm> d, float e, float f, axr<czj> g, alf<dhu> h) {
   public dce a(dht $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dce.a $$2 = dce.a();
      bwt $$3 = bwt.a($$0.a());
      alg $$4 = alg.b("armor." + $$0.b());
      $$2.a(byp.a, new byn($$4, (double)$$1, byn.a.a), $$3);
      $$2.a(byp.b, new byn($$4, (double)this.e, byn.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(byp.p, new byn($$4, (double)this.f, byn.a.a), $$3);
      }

      return $$2.a();
   }
}
