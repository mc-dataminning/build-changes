import com.mojang.serialization.MapCodec;

public class duq extends dqw {
   public static final MapCodec<duq> a = b(duq::new);

   @Override
   public MapCodec<duq> a() {
      return a;
   }

   public duq(ebd.d $$0) {
      super($$0);
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      if (!$$3.ce()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(djb $$0, bwt $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwt $$0) {
      ffq $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxu ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
      double $$4 = Math.abs($$3.dy().e);
      if ($$4 < 0.1 && !$$3.cd()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dy().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
