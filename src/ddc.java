import java.util.Map;
import java.util.Optional;

public record ddc(int a, Map<dde, Integer> b, int c, jp<awj> d, float e, float f, axp<cvt> g, alh h) {
   public cvt.a a(cvt.a $$0, dde $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a($$1.a(), this.d, this.h).a(this.g);
   }

   public cvt.a a(cvt.a $$0, jt<bug<?>> $$1) {
      return $$0.b(dde.e.a(this.a)).a(this.a(dde.e)).a(this.g).a(kt.D, new ddh(buh.g, this.d, Optional.of(this.h), Optional.of($$1), true));
   }

   private cym a(dde $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      cym.a $$2 = cym.a();
      bui $$3 = bui.a($$0.a());
      alh $$4 = alh.b("armor." + $$0.b());
      $$2.a(bwd.a, new bwb($$4, (double)$$1, bwb.a.a), $$3);
      $$2.a(bwd.b, new bwb($$4, (double)this.e, bwb.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwd.p, new bwb($$4, (double)this.f, bwb.a.a), $$3);
      }

      return $$2.a();
   }
}
