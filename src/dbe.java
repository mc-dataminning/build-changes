import javax.annotation.Nullable;

public class dbe extends cvb implements cxl {
   public static final dgj<dgh> b = cvb.a;
   protected static final float c = 6.0F;
   protected static final eii d = csx.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public dbe(dfk.d $$0) {
      super($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return d;
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.d($$1, $$2, hc.b) && !$$0.a(csy.kJ);
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(csy.bw);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = super.a($$0);
      if ($$1 != null) {
         eao $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(apz.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      if ($$0.c(b) == dgh.a) {
         dfl $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dgh.b;
      } else {
         eao $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(apz.a) && $$4.e() == 8;
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return eap.c.a(false);
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
