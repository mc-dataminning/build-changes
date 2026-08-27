import com.mojang.serialization.MapCodec;

public class cui extends cvf implements cvi {
   public static final MapCodec<cui> a = b(cui::new);
   protected static final float b = 4.0F;
   protected static final eks c = cvf.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cui> a() {
      return a;
   }

   public cui(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ejz $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.d()).a(ark.at);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cvh.a.o();
      } else {
         if ($$1 == ib.b && $$2.a(cvh.mZ)) {
            $$3.a($$4, cvh.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(clr.dQ);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dhn $$0, cdz $$1, crl $$2, hx $$3) {
      return $$1.eU().d() instanceof cmz ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(csf $$0, hx $$1) {
      $$0.a($$1.c(), cvh.mZ.o().a(cuj.i, dhz.b), 3);
   }
}
