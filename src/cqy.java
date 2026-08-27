import javax.annotation.Nullable;

public class cqy extends cpa implements cwo {
   public static final dcs a = dcr.C;
   private static final int c = 3;
   protected static final efb b = cpn.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public cqy(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.z, $$0.B ? czz::a : czz::b);
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.b;
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(a) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof czi) {
            ((czi)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());
      return this.n().a(a, Boolean.valueOf($$1.a(anb.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
