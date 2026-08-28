import com.mojang.serialization.MapCodec;

public class dlv extends dmi {
   public static final MapCodec<dlv> a = b(dlv::new);
   protected static final fbt b = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      this.e($$0, $$1, $$2);
      return bsj.a;
   }

   @Override
   protected void a_(dww $$0, dgh $$1, ji $$2, cow $$3) {
      this.e($$0, $$1, $$2);
   }

   private void e(dww $$0, dgh $$1, ji $$2) {
      dym $$3 = $$1.F_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         ji $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = ayz.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = ayz.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = ayz.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(lt.ae, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
               }
            } else {
               $$1.a($$5, $$0, 2);
               $$1.a($$2, false);
            }

            return;
         }
      }
   }

   @Override
   protected int b() {
      return 5;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
