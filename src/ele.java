public class ele extends gan {
   private final euq a;
   private final ele.a b;
   private epz c = epz.a;

   public ele(ekm $$0, euq $$1) {
      super(enf.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ele(sw $$0, euq $$1) {
      super(enf.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ele(sw $$0, sw $$1, euq $$2) {
      super(enf.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ele.a a(ekm $$0) {
      ejb $$1 = $$0.c;
      if ($$1 == null) {
         return a(sw.a("mco.errorMessage.realmsService", $$0.a), sw.b($$0.b));
      } else {
         int $$2 = $$1.b();
         String $$3 = "mco.errorMessage." + $$2;
         return a(sw.a("mco.errorMessage.realmsService.realmsError", $$2), (sw)(fvz.a($$3) ? sw.c($$3) : sw.a($$1.a())));
      }
   }

   private static ele.a a(sw $$0) {
      return a(sw.c("mco.errorMessage.generic"), $$0);
   }

   private static ele.a a(sw $$0, sw $$1) {
      return new ele.a($$0, $$1);
   }

   @Override
   public void b() {
      this.d(epi.a(sv.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = epz.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public sw au_() {
      return sw.h().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.b.a, this.g / 2, 80, 16777215);
      this.c.a($$0, this.g / 2, 100, 9, 16711680);
      super.a($$0, $$1, $$2, $$3);
   }

   static record a(sw a, sw b) {
   }
}
