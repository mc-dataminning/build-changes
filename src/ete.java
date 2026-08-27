public class ete extends gld {
   private final fdm a;
   private final ete.a b;
   private eyk c = eyk.a;

   public ete(esn $$0, fdm $$1) {
      super(evj.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ete(vg $$0, fdm $$1) {
      super(evj.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ete(vg $$0, vg $$1, fdm $$2) {
      super(evj.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ete.a a(esn $$0) {
      erc $$1 = $$0.a;
      return a(vg.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static ete.a a(vg $$0) {
      return a(vg.c("mco.errorMessage.generic"), $$0);
   }

   private static ete.a a(vg $$0, vg $$1) {
      return new ete.a($$0, $$1);
   }

   @Override
   public void aP_() {
      this.d(exr.a(vf.h, $$0 -> this.d()).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = eyk.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public void d() {
      this.f.a(this.a);
   }

   @Override
   public vg i() {
      return vg.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vg a, vg b) {
   }
}
