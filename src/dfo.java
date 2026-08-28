import java.util.Map;

public record dfo(int a, Map<dfq, Integer> b, int c, jq<axe> d, float e, float f, ayk<cxk> g, alz h) {
   public cxk.a a(cxk.a $$0, dfq $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(ku.D, dft.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cxk.a a(cxk.a $$0, ju<bvq<?>> $$1) {
      return $$0.b(dfq.e.a(this.a)).a(this.a(dfq.e)).a(this.g).a(ku.D, dft.a(bvr.g).a(this.d).a(this.h).a($$1).a());
   }

   public cxk.a a(cxk.a $$0, jq<axe> $$1, boolean $$2, ju<bvq<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(dfq.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(dfq.e)).a(ku.D, dft.a(bvr.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private daf a(dfq $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      daf.a $$2 = daf.a();
      bvs $$3 = bvs.a($$0.a());
      alz $$4 = alz.b("armor." + $$0.b());
      $$2.a(bxn.a, new bxl($$4, (double)$$1, bxl.a.a), $$3);
      $$2.a(bxn.b, new bxl($$4, (double)this.e, bxl.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bxn.p, new bxl($$4, (double)this.f, bxl.a.a), $$3);
      }

      return $$2.a();
   }
}
