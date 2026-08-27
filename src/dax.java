import javax.annotation.Nullable;

public class dax extends cuu implements cxe {
   public static final dgc<dga> b = cuu.a;
   protected static final float c = 6.0F;
   protected static final eib d = csq.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public dax(dfd.d $$0) {
      super($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return d;
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.d($$1, $$2, hc.b) && !$$0.a(csr.kJ);
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(csr.bw);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = super.a($$0);
      if ($$1 != null) {
         eah $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(apt.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      if ($$0.c(b) == dga.a) {
         dfe $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dga.b;
      } else {
         eah $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(apt.a) && $$4.e() == 8;
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return eai.c.a(false);
   }

   @Override
   public boolean a(@Nullable cbp $$0, cow $$1, gw $$2, dfe $$3, eag $$4) {
      return false;
   }

   @Override
   public boolean a(cpr $$0, gw $$1, dfe $$2, eah $$3) {
      return false;
   }
}
