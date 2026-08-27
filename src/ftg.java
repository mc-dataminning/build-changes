public class ftg implements fsu<dhe> {
   private final fro a;

   public ftg(fsv.a $$0) {
      this.a = $$0.b();
   }

   public void a(dhe $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      csa $$6 = $$0.k();
      if ($$6 != null) {
         ht $$7 = $$0.p().a($$0.g().g());
         dhi $$8 = $$0.i();
         if (!$$8.i()) {
            frq.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cvc.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dhc.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dik $$9 = $$8.a(cvc.br) ? dik.b : dik.a;
               dhi $$10 = cvc.bz.o().a(dhc.c, $$9).a(dhc.a, $$8.c(dhb.a));
               $$10 = $$10.a(dhc.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ht $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dhb.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            frq.b();
         }
      }
   }

   private void a(ht $$0, dhi $$1, enw $$2, fqu $$3, csa $$4, boolean $$5, int $$6) {
      frc $$7 = fqp.b($$1);
      eoa $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ats.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aS_() {
      return 68;
   }
}
