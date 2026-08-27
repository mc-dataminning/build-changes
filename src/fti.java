public class fti extends ftc<bys> {
   private final fou a;

   public fti(ftd.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(bys $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      dfd $$6 = $$0.t();
      if ($$6.l() == czg.c) {
         cqb $$7 = $$0.dL();
         if ($$6 != $$7.a_($$0.dl()) && $$6.l() != czg.a) {
            $$3.a();
            gw $$8 = gw.a($$0.dq(), $$0.cG().e, $$0.dw());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fnv.b($$6)), false, ash.a(), $$6.a($$0.q()), fyr.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public aez a(bys $$0) {
      return fyz.e;
   }
}
