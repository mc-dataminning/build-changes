import java.util.Map;

public record dfh(int a, Map<dfj, Integer> b, int c, jq<axe> d, float e, float f, ayk<cxg> g, alz h) {
   public cxg.a a(cxg.a $$0, dfj $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(ku.D, dfm.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cxg.a a(cxg.a $$0, ju<bvm<?>> $$1) {
      return $$0.b(dfj.e.a(this.a)).a(this.a(dfj.e)).a(this.g).a(ku.D, dfm.a(bvn.g).a(this.d).a(this.h).a($$1).a());
   }

   public cxg.a a(cxg.a $$0, axe $$1, boolean $$2, ju<bvm<?>> $$3) {
      return $$0.b(dfj.e.a(this.a)).a(this.a(dfj.e)).a(this.g).a(ku.D, dfm.a(bvn.g).a(jq.a($$1)).a(this.h).a($$3).c($$2).a());
   }

   private dab a(dfj $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dab.a $$2 = dab.a();
      bvo $$3 = bvo.a($$0.a());
      alz $$4 = alz.b("armor." + $$0.b());
      $$2.a(bxj.a, new bxh($$4, (double)$$1, bxh.a.a), $$3);
      $$2.a(bxj.b, new bxh($$4, (double)this.e, bxh.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bxj.p, new bxh($$4, (double)this.f, bxh.a.a), $$3);
      }

      return $$2.a();
   }
}
