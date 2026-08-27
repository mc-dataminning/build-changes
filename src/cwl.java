import javax.annotation.Nullable;

public class cwl extends cpv implements cpp, cub {
   protected static final float a = 6.0F;
   protected static final efb b = cpn.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected cwl(dca.d $$0) {
      super($$0);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(cpo.kJ);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());
      return $$1.a(anb.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      dcb $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public dxe c_(dcb $$0) {
      return dxf.c.a(false);
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      dcb $$4 = cpo.bx.n();
      dcb $$5 = $$4.a(cxu.b, dcx.a);
      gu $$6 = $$2.c();
      if ($$0.a_($$6).a(cpo.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(cls $$0, gu $$1, dcb $$2, dxd $$3) {
      return false;
   }

   @Override
   public boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
      return false;
   }
}
