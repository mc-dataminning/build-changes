import com.mojang.serialization.MapCodec;

public class dnb extends djm {
   public static final MapCodec<dnb> a = b(dnb::new);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dsz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      if ($$3.bY()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dca $$0, bsq $$1) {
      if ($$1.bY()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsq $$0) {
      eww $$1 = $$0.dt();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btl ? 1.0 : 0.8;
         $$0.n($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
      double $$4 = Math.abs($$3.dt().d);
      if ($$4 < 0.1 && !$$3.bX()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dt().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
