import com.mojang.serialization.MapCodec;

public class dpc extends dvj implements dmd {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   public static final MapCodec<dpc> a = b(dpc::new);

   public dpc(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dpc> a() {
      return a;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$1.B($$2) <= 13) {
         if ($$3.j() <= 0.7) {
            double $$4 = (double)$$2.u() + $$3.j() * 10.0 - 5.0;
            double $$5 = (double)$$2.v() + $$3.j() * 5.0;
            double $$6 = (double)$$2.w() + $$3.j() * 10.0 - 5.0;
            $$1.a(lx.bj, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return true;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      a($$0, $$2, new cyy(this));
   }
}
