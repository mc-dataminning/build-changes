import com.mojang.serialization.MapCodec;

public class dpy extends dqm {
   public static final MapCodec<dpy> a = b(dpy::new);
   private static final fgw b = dno.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   public dpy(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      this.d($$0, $$1, $$2);
      return bvc.a;
   }

   @Override
   protected void a_(ebq $$0, dkj $$1, iw $$2, csi $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(ebq $$0, dkj $$1, iw $$2) {
      edi $$3 = $$1.E_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iw $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = azz.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = azz.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = azz.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(lz.af, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   public int b(ebq $$0, djn $$1, iw $$2) {
      return -16777216;
   }
}
