import com.mojang.serialization.MapCodec;

public class cuc extends cvj implements cvd {
   public static final MapCodec<cuc> a = b(cuc::new);
   private static final ekn b = ekk.a(cva.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cva.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cuc> a() {
      return a;
   }

   protected cuc(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(cvc.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      dgx.e.a($$0, $$0.k().g(), $$2, $$3, $$1);
   }
}
