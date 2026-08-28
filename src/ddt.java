import java.util.Map;

public record ddt(int a, Map<ddv, Integer> b, int c, jq<awm> d, float e, float f, axs<cwi> g, alj h) {
   public cwi.a a(cwi.a $$0, ddv $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(ku.D, ddy.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cwi.a a(cwi.a $$0, ju<bus<?>> $$1) {
      return $$0.b(ddv.e.a(this.a)).a(this.a(ddv.e)).a(this.g).a(ku.D, ddy.a(but.g).a(this.d).a(this.h).a($$1).a());
   }

   public cwi.a a(cwi.a $$0, awm $$1, ju<bus<?>> $$2) {
      return $$0.b(ddv.e.a(this.a)).a(this.a(ddv.e)).a(this.g).a(ku.D, ddy.a(but.g).a(jq.a($$1)).a(this.h).a($$2).a());
   }

   private czd a(ddv $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      czd.a $$2 = czd.a();
      buu $$3 = buu.a($$0.a());
      alj $$4 = alj.b("armor." + $$0.b());
      $$2.a(bwp.a, new bwn($$4, (double)$$1, bwn.a.a), $$3);
      $$2.a(bwp.b, new bwn($$4, (double)this.e, bwn.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwp.p, new bwn($$4, (double)this.f, bwn.a.a), $$3);
      }

      return $$2.a();
   }
}
