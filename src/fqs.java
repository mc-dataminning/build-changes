public class fqs implements fqg<dfh> {
   private final fpa a;

   public fqs(fqh.a $$0) {
      this.a = $$0.b();
   }

   public void a(dfh $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      cpx $$6 = $$0.k();
      if ($$6 != null) {
         gw $$7 = $$0.p().a($$0.g().g());
         dfl $$8 = $$0.i();
         if (!$$8.i()) {
            fpc.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(csy.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dff.c, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dgn $$9 = $$8.a(csy.br) ? dgn.b : dgn.a;
               dfl $$10 = csy.bz.n().a(dff.b, $$9).a(dff.a, $$8.c(dfe.a));
               $$10 = $$10.a(dff.c, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               gw $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dfe.b, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fpc.b();
         }
      }
   }

   private void a(gw $$0, dfl $$1, elr $$2, fog $$3, cpx $$4, boolean $$5, int $$6) {
      foo $$7 = fob.b($$1);
      elv $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, ase.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aK_() {
      return 68;
   }
}
