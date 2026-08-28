import java.util.Map;

public record dfg(int a, Map<dfi, Integer> b, int c, jq<awu> d, float e, float f, aya<cxc> g, alp h) {
   public cxc.a a(cxc.a $$0, dfi $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(ku.D, dfl.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cxc.a a(cxc.a $$0, ju<bvi<?>> $$1) {
      return $$0.b(dfi.e.a(this.a)).a(this.a(dfi.e)).a(this.g).a(ku.D, dfl.a(bvj.g).a(this.d).a(this.h).a($$1).a());
   }

   public cxc.a a(cxc.a $$0, jq<awu> $$1, boolean $$2, ju<bvi<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(dfi.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(dfi.e)).a(ku.D, dfl.a(bvj.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private czx a(dfi $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      czx.a $$2 = czx.a();
      bvk $$3 = bvk.a($$0.a());
      alp $$4 = alp.b("armor." + $$0.b());
      $$2.a(bxf.a, new bxd($$4, (double)$$1, bxd.a.a), $$3);
      $$2.a(bxf.b, new bxd($$4, (double)this.e, bxd.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bxf.p, new bxd($$4, (double)this.f, bxd.a.a), $$3);
      }

      return $$2.a();
   }
}
