import com.mojang.serialization.MapCodec;

public class cuh extends cvo implements cvi {
   public static final MapCodec<cuh> a = b(cuh::new);
   private static final eks b = ekp.a(cvf.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cvf.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cuh> a() {
      return a;
   }

   protected cuh(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(cvh.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      dhc.e.a($$0, $$0.k().g(), $$2, $$3, $$1);
   }
}
