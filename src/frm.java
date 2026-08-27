public class frm implements fra<dfx> {
   private final fpu a;

   public frm(frb.a $$0) {
      this.a = $$0.b();
   }

   public void a(dfx $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      cqz $$6 = $$0.k();
      if ($$6 != null) {
         ht $$7 = $$0.p().a($$0.g().g());
         dgb $$8 = $$0.i();
         if (!$$8.i()) {
            fpw.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cuc.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dfv.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dhd $$9 = $$8.a(cuc.br) ? dhd.b : dhd.a;
               dgb $$10 = cuc.bz.o().a(dfv.c, $$9).a(dfv.a, $$8.c(dfu.a));
               $$10 = $$10.a(dfv.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ht $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dfu.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fpw.b();
         }
      }
   }

   private void a(ht $$0, dgb $$1, emh $$2, fpb $$3, cqz $$4, boolean $$5, int $$6) {
      fpj $$7 = fow.b($$1);
      eml $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ate.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}
