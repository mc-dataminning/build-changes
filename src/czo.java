import javax.annotation.Nullable;

public class czo extends csy implements css, cxe {
   protected static final float a = 6.0F;
   protected static final eib b = csq.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected czo(dfd.d $$0) {
      super($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.d($$1, $$2, hc.b) && !$$0.a(csr.kJ);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      return $$1.a(apt.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      dfe $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return true;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public eah c_(dfe $$0) {
      return eai.c.a(false);
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      dfe $$4 = csr.bx.n();
      dfe $$5 = $$4.a(dax.b, dga.a);
      gw $$6 = $$2.c();
      if ($$0.a_($$6).a(csr.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
