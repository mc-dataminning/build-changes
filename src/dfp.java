import java.util.Map;

public record dfp(int a, Map<dfr, Integer> b, int c, jq<axe> d, float e, float f, ayk<cxl> g, alz h) {
   public cxl.a a(cxl.a $$0, dfr $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(ku.D, dfu.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cxl.a a(cxl.a $$0, ju<bvr<?>> $$1) {
      return $$0.b(dfr.e.a(this.a)).a(this.a(dfr.e)).a(this.g).a(ku.D, dfu.a(bvs.g).a(this.d).a(this.h).a($$1).a());
   }

   public cxl.a a(cxl.a $$0, jq<axe> $$1, boolean $$2, ju<bvr<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(dfr.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(dfr.e)).a(ku.D, dfu.a(bvs.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private dag a(dfr $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dag.a $$2 = dag.a();
      bvt $$3 = bvt.a($$0.a());
      alz $$4 = alz.b("armor." + $$0.b());
      $$2.a(bxo.a, new bxm($$4, (double)$$1, bxm.a.a), $$3);
      $$2.a(bxo.b, new bxm($$4, (double)this.e, bxm.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bxo.p, new bxm($$4, (double)this.f, bxm.a.a), $$3);
      }

      return $$2.a();
   }
}
