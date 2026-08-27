public class fmg implements flu<dbx> {
   private final fko a;

   public fmg(flv.a $$0) {
      this.a = $$0.b();
   }

   public void a(dbx $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      cmm $$6 = $$0.k();
      if ($$6 != null) {
         gu $$7 = $$0.p().a($$0.g().g());
         dcb $$8 = $$0.i();
         if (!$$8.i()) {
            fkq.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cpo.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dbv.c, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               ddd $$9 = $$8.a(cpo.br) ? ddd.b : ddd.a;
               dcb $$10 = cpo.bz.n().a(dbv.b, $$9).a(dbv.a, $$8.c(dbu.a));
               $$10 = $$10.a(dbv.c, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               gu $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dbu.b, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fkq.b();
         }
      }
   }

   private void a(gu $$0, dcb $$1, eij $$2, fjx $$3, cmm $$4, boolean $$5, int $$6) {
      fkf $$7 = fjs.b($$1);
      ein $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, apf.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aK_() {
      return 68;
   }
}
