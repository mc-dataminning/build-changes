public class evb extends gnd {
   private final ffl a;
   private final evb.a b;
   private fah c = fah.a;

   public evb(euk $$0, ffl $$1) {
      super(exg.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public evb(vq $$0, ffl $$1) {
      super(exg.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public evb(vq $$0, vq $$1, ffl $$2) {
      super(exg.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static evb.a a(euk $$0) {
      esz $$1 = $$0.a;
      return a(vq.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static evb.a a(vq $$0) {
      return a(vq.c("mco.errorMessage.generic"), $$0);
   }

   private static evb.a a(vq $$0, vq $$1) {
      return new evb.a($$0, $$1);
   }

   @Override
   public void aQ_() {
      this.c(ezo.a(vp.h, $$0 -> this.d()).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = fah.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public void d() {
      this.f.a(this.a);
   }

   @Override
   public vq i() {
      return vq.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vq a, vq b) {
   }
}
