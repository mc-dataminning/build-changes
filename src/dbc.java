import javax.annotation.Nullable;

public class dbc extends cuz implements cxj {
   public static final dgh<dgf> b = cuz.a;
   protected static final float c = 6.0F;
   protected static final eig d = csv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public dbc(dfi.d $$0) {
      super($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return d;
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.d($$1, $$2, hc.b) && !$$0.a(csw.kJ);
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(csw.bw);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = super.a($$0);
      if ($$1 != null) {
         eam $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(apy.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      if ($$0.c(b) == dgf.a) {
         dfj $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dgf.b;
      } else {
         eam $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(apy.a) && $$4.e() == 8;
      }
   }

   @Override
   public eam c_(dfj $$0) {
      return ean.c.a(false);
   }

   @Override
   public boolean a(@Nullable cbu $$0, cpb $$1, gw $$2, dfj $$3, eal $$4) {
      return false;
   }

   @Override
   public boolean a(cpw $$0, gw $$1, dfj $$2, eam $$3) {
      return false;
   }
}
