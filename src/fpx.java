public class fpx implements fpl<dew> {
   private final foe a;

   public fpx(fpm.a $$0) {
      this.a = $$0.b();
   }

   public void a(dew $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      cpm $$6 = $$0.k();
      if ($$6 != null) {
         gu $$7 = $$0.p().a($$0.g().g());
         dfa $$8 = $$0.i();
         if (!$$8.i()) {
            fog.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(csn.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(deu.c, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dgc $$9 = $$8.a(csn.br) ? dgc.b : dgc.a;
               dfa $$10 = csn.bz.n().a(deu.b, $$9).a(deu.a, $$8.c(det.a));
               $$10 = $$10.a(deu.c, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               gu $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(det.b, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fog.b();
         }
      }
   }

   private void a(gu $$0, dfa $$1, elg $$2, fnl $$3, cpm $$4, boolean $$5, int $$6) {
      fnt $$7 = fng.b($$1);
      elk $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, aru.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aH_() {
      return 68;
   }
}
