import java.util.Map;

public record dfh(int a, Map<dfj, Integer> b, int c, jr<avz> d, float e, float f, axf<cxd> g, akt<dfk> h) {
   public cxd.a a(cxd.a $$0, jv<bvi<?>> $$1) {
      return $$0.b(dfj.e.a(this.a)).a(this.a(dfj.e)).a(this.g).a(kv.E, dfm.a(bvj.g).a(this.d).a(this.h).a($$1).a());
   }

   public cxd.a a(cxd.a $$0, jr<avz> $$1, boolean $$2, jv<bvi<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(dfj.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(dfj.e)).a(kv.E, dfm.a(bvj.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   public czw a(dfj $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      czw.a $$2 = czw.a();
      bvk $$3 = bvk.a($$0.a());
      aku $$4 = aku.b("armor." + $$0.b());
      $$2.a(bxg.a, new bxe($$4, (double)$$1, bxe.a.a), $$3);
      $$2.a(bxg.b, new bxe($$4, (double)this.e, bxe.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bxg.p, new bxe($$4, (double)this.f, bxe.a.a), $$3);
      }

      return $$2.a();
   }
}
