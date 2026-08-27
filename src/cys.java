import com.mojang.serialization.MapCodec;

public class cys extends czf {
   public static final MapCodec<cys> a = b(cys::new);
   protected static final emf b = cwj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cys> a() {
      return a;
   }

   public cys(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      this.d($$0, $$1, $$2);
      return bjv.a($$1.B);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cfb $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dja $$0, cti $$1, hx $$2) {
      dkr $$3 = $$1.D_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         hx $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = aui.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = aui.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = aui.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(jx.Z, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
