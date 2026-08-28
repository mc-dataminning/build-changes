import java.util.Map;

public record ddm(int a, Map<ddo, Integer> b, int c, jq<awn> d, float e, float f, axt<cwb> g, all h) {
   public cwb.a a(cwb.a $$0, ddo $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(ku.D, ddr.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cwb.a a(cwb.a $$0, ju<bup<?>> $$1) {
      return $$0.b(ddo.e.a(this.a)).a(this.a(ddo.e)).a(this.g).a(ku.D, ddr.a(buq.g).a(this.d).a(this.h).a($$1).a());
   }

   private cyw a(ddo $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      cyw.a $$2 = cyw.a();
      bur $$3 = bur.a($$0.a());
      all $$4 = all.b("armor." + $$0.b());
      $$2.a(bwm.a, new bwk($$4, (double)$$1, bwk.a.a), $$3);
      $$2.a(bwm.b, new bwk($$4, (double)this.e, bwk.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwm.p, new bwk($$4, (double)this.f, bwk.a.a), $$3);
      }

      return $$2.a();
   }
}
