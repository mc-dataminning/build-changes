public class fqg implements fpu<dev> {
   private final fon a;

   public fqg(fpv.a $$0) {
      this.a = $$0.b();
   }

   public void a(dev $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      cpl $$6 = $$0.k();
      if ($$6 != null) {
         gu $$7 = $$0.p().a($$0.g().g());
         dez $$8 = $$0.i();
         if (!$$8.i()) {
            fop.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(csm.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(det.c, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dgb $$9 = $$8.a(csm.br) ? dgb.b : dgb.a;
               dez $$10 = csm.bz.n().a(det.b, $$9).a(det.a, $$8.c(des.a));
               $$10 = $$10.a(det.c, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               gu $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(des.b, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fop.b();
         }
      }
   }

   private void a(gu $$0, dez $$1, elf $$2, fnu $$3, cpl $$4, boolean $$5, int $$6) {
      foc $$7 = fnp.b($$1);
      elj $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, aru.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aF_() {
      return 68;
   }
}
