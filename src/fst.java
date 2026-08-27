public class fst implements fsh<dgs> {
   private final frb a;

   public fst(fsi.a $$0) {
      this.a = $$0.b();
   }

   public void a(dgs $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      crs $$6 = $$0.k();
      if ($$6 != null) {
         ht $$7 = $$0.p().a($$0.g().g());
         dgw $$8 = $$0.i();
         if (!$$8.i()) {
            frd.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cuv.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dgq.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dhy $$9 = $$8.a(cuv.br) ? dhy.b : dhy.a;
               dgw $$10 = cuv.bz.o().a(dgq.c, $$9).a(dgq.a, $$8.c(dgp.a));
               $$10 = $$10.a(dgq.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ht $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dgp.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            frd.b();
         }
      }
   }

   private void a(ht $$0, dgw $$1, enk $$2, fqh $$3, crs $$4, boolean $$5, int $$6) {
      fqp $$7 = fqc.b($$1);
      eno $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ato.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aR_() {
      return 68;
   }
}
