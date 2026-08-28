import java.util.Map;

public record dic(int a, Map<die, Integer> b, int c, jf<awo> d, float e, float f, axt<czu> g, alh<dif> h) {
   public dcp a(die $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dcp.a $$2 = dcp.a();
      bxe $$3 = bxe.a($$0.a());
      ali $$4 = ali.b("armor." + $$0.b());
      $$2.a(bza.a, new byy($$4, (double)$$1, byy.a.a), $$3);
      $$2.a(bza.b, new byy($$4, (double)this.e, byy.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bza.p, new byy($$4, (double)this.f, byy.a.a), $$3);
      }

      return $$2.a();
   }
}
