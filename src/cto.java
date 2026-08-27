import javax.annotation.Nullable;

public class cto extends cta implements cub {
   protected static final efb f = cpn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double g = 0.14;

   protected cto(dca.d $$0) {
      super($$0, ha.b, f, true, 0.14);
   }

   @Override
   protected boolean g(dcb $$0) {
      return $$0.a(cpo.G);
   }

   @Override
   protected cpn a() {
      return cpo.md;
   }

   @Override
   protected boolean h(dcb $$0) {
      return !$$0.a(cpo.kJ);
   }

   @Override
   public boolean a(cls $$0, gu $$1, dcb $$2, dxd $$3) {
      return false;
   }

   @Override
   public boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
      return false;
   }

   @Override
   protected int a(apf $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());
      return $$1.a(anb.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dxe c_(dcb $$0) {
      return dxf.c.a(false);
   }
}
