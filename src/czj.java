import javax.annotation.Nullable;

public class czj extends cst implements csn, cwz {
   protected static final float a = 6.0F;
   protected static final ehw b = csl.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected czj(dey.d $$0) {
      super($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(csm.kJ);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      return $$1.a(apq.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      dez $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return true;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public eac c_(dez $$0) {
      return ead.c.a(false);
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      dez $$4 = csm.bx.n();
      dez $$5 = $$4.a(das.b, dfv.a);
      gu $$6 = $$2.c();
      if ($$0.a_($$6).a(csm.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cbm $$0, cor $$1, gu $$2, dez $$3, eab $$4) {
      return false;
   }

   @Override
   public boolean a(cpm $$0, gu $$1, dez $$2, eac $$3) {
      return false;
   }
}
