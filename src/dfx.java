import java.util.Map;

public record dfx(int a, Map<dfz, Integer> b, int c, js<awj> d, float e, float f, axp<cxu> g, alc<dga> h) {
   public cxu.a a(cxu.a $$0, jw<bwb<?>> $$1) {
      return $$0.b(dfz.e.a(this.a)).a(this.a(dfz.e)).a(this.g).a(kx.E, dgc.a(bwc.g).a(this.d).a(this.h).a($$1).a());
   }

   public cxu.a a(cxu.a $$0, js<awj> $$1, boolean $$2, jw<bwb<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(dfz.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(dfz.e)).a(kx.E, dgc.a(bwc.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   public dam a(dfz $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dam.a $$2 = dam.a();
      bwd $$3 = bwd.a($$0.a());
      ald $$4 = ald.b("armor." + $$0.b());
      $$2.a(bxx.a, new bxv($$4, (double)$$1, bxv.a.a), $$3);
      $$2.a(bxx.b, new bxv($$4, (double)this.e, bxv.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bxx.p, new bxv($$4, (double)this.f, bxv.a.a), $$3);
      }

      return $$2.a();
   }
}
