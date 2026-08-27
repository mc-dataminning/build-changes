import javax.annotation.Nullable;

public class cwr extends cwd implements cxe {
   protected static final eib f = csq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double g = 0.14;

   protected cwr(dfd.d $$0) {
      super($$0, hc.b, f, true, 0.14);
   }

   @Override
   protected boolean g(dfe $$0) {
      return $$0.a(csr.G);
   }

   @Override
   protected csq a() {
      return csr.md;
   }

   @Override
   protected boolean h(dfe $$0) {
      return !$$0.a(csr.kJ);
   }

   @Override
   public boolean a(@Nullable cbp $$0, cow $$1, gw $$2, dfe $$3, eag $$4) {
      return false;
   }

   @Override
   public boolean a(cpr $$0, gw $$1, dfe $$2, eah $$3) {
      return false;
   }

   @Override
   protected int a(arx $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      return $$1.a(apt.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eah c_(dfe $$0) {
      return eai.c.a(false);
   }
}
