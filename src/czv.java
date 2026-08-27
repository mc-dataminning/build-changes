import javax.annotation.Nullable;

public class czv extends ctf implements csz, cxl {
   protected static final float a = 6.0F;
   protected static final eii b = csx.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected czv(dfk.d $$0) {
      super($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.d($$1, $$2, hc.b) && !$$0.a(csy.kJ);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      return $$1.a(apz.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      dfl $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return true;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public eao c_(dfl $$0) {
      return eap.c.a(false);
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      dfl $$4 = csy.bx.n();
      dfl $$5 = $$4.a(dbe.b, dgh.a);
      gw $$6 = $$2.c();
      if ($$0.a_($$6).a(csy.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cbw $$0, cpd $$1, gw $$2, dfl $$3, ean $$4) {
      return false;
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfl $$2, eao $$3) {
      return false;
   }
}
