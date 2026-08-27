public class fqq implements fqe<dff> {
   private final foy a;

   public fqq(fqf.a $$0) {
      this.a = $$0.b();
   }

   public void a(dff $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      cpv $$6 = $$0.k();
      if ($$6 != null) {
         gw $$7 = $$0.p().a($$0.g().g());
         dfj $$8 = $$0.i();
         if (!$$8.i()) {
            fpa.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(csw.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dfd.c, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dgl $$9 = $$8.a(csw.br) ? dgl.b : dgl.a;
               dfj $$10 = csw.bz.n().a(dfd.b, $$9).a(dfd.a, $$8.c(dfc.a));
               $$10 = $$10.a(dfd.c, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               gw $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dfc.b, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            fpa.b();
         }
      }
   }

   private void a(gw $$0, dfj $$1, elp $$2, foe $$3, cpv $$4, boolean $$5, int $$6) {
      fom $$7 = fnz.b($$1);
      elt $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, asc.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aK_() {
      return 68;
   }
}
