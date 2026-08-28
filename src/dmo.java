import com.mojang.serialization.MapCodec;

public class dmo extends dnb {
   public static final MapCodec<dmo> a = b(dmo::new);
   private static final fcr b = dke.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   public dmo(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      this.e($$0, $$1, $$2);
      return bsy.a;
   }

   @Override
   protected void a_(dxq $$0, dgz $$1, ji $$2, cpr $$3) {
      this.e($$0, $$1, $$2);
   }

   private void e(dxq $$0, dgz $$1, ji $$2) {
      dzh $$3 = $$1.A_();

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
                  $$1.a(lt.af, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
