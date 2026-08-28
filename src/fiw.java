public class fiw extends hky {
   private final fui a;
   private final fiw.a b;
   private fpj c = fpj.a;

   public fiw(fie $$0, fui $$1) {
      super(fky.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fiw(wo $$0, fui $$1) {
      super(fky.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fiw(wo $$0, wo $$1, fui $$2) {
      super(fky.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fiw.a a(fie $$0) {
      fgk $$1 = $$0.a;
      return a(wo.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fiw.a a(wo $$0) {
      return a(wo.c("mco.errorMessage.generic"), $$0);
   }

   private static fiw.a a(wo $$0, wo $$1) {
      return new fiw.a($$0, $$1);
   }

   @Override
   public void aR_() {
      this.c(fop.a(wn.h, $$0 -> this.aO_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fpj.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   @Override
   public wo i() {
      return wo.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wo a, wo b) {
   }
}
