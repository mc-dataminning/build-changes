public class fqm implements fqa<dez> {
   private final fou a;

   public fqm(fqb.a $$0) {
      this.a = $$0.b();
   }

   public void a(dez $$0, float $$1, elj $$2, foa $$3, int $$4, int $$5) {
      cqb $$6 = $$0.k();
      if ($$6 != null) {
         gw $$7 = $$0.p().a($$0.g().g());
         dfd $$8 = $$0.i();
         if (!$$8.i()) {
            fow.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cte.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dex.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dgf $$9 = $$8.a(cte.br) ? dgf.b : dgf.a;
               dfd $$10 = cte.bz.o().a(dex.c, $$9).a(dex.a, $$8.c(dew.a));
               $$10 = $$10.a(dex.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               gw $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dew.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fow.b();
         }
      }
   }

   private void a(gw $$0, dfd $$1, elj $$2, foa $$3, cqb $$4, boolean $$5, int $$6) {
      foi $$7 = fnv.b($$1);
      eln $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ash.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aK_() {
      return 68;
   }
}
