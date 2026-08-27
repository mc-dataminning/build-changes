public class fpd extends fox<bvg> {
   private final fko a;

   public fpd(foy.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(bvg $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      dcb $$6 = $$0.o();
      if ($$6.l() == cvs.c) {
         cmm $$7 = $$0.dI();
         if ($$6 != $$7.a_($$0.di()) && $$6.l() != cvs.a) {
            $$3.a();
            gu $$8 = gu.a($$0.dn(), $$0.cE().e, $$0.dt());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fjs.b($$6)), false, apf.a(), $$6.a($$0.j()), fum.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public acq a(bvg $$0) {
      return fuu.e;
   }
}
