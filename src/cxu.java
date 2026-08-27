import javax.annotation.Nullable;

public class cxu extends crr implements cub {
   public static final dcz<dcx> b = crr.a;
   protected static final float c = 6.0F;
   protected static final efb d = cpn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public cxu(dca.d $$0) {
      super($$0);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return d;
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(cpo.kJ);
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(cpo.bw);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = super.a($$0);
      if ($$1 != null) {
         dxe $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(anb.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      if ($$0.c(b) == dcx.a) {
         dcb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dcx.b;
      } else {
         dxe $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(anb.a) && $$4.e() == 8;
      }
   }

   @Override
   public dxe c_(dcb $$0) {
      return dxf.c.a(false);
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
