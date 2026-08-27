public class cro extends csk implements csm {
   protected static final float a = 4.0F;
   protected static final ehy b = csk.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public cro(dex.d $$0) {
      super($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      ehf $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.d()).a(apj.at);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!$$0.a($$3, $$4)) {
         return csl.a.n();
      } else {
         if ($$1 == hb.b && $$2.a(csl.mZ)) {
            $$3.a($$4, csl.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(ciz.dv);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dey $$0, cbl $$1, coq $$2, gv $$3) {
      return $$1.eR().d() instanceof ckh ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cpk $$0, gv $$1) {
      $$0.a($$1.c(), csl.mZ.n().a(crp.h, dfk.b), 3);
   }
}
