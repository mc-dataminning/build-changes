import com.mojang.serialization.MapCodec;

public class dai extends ctc {
   public static final MapCodec<dai> a = b(dai::new);
   public static final int b = 2;
   public static final dgd c = dft.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eia g = ctc.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return g;
   }

   public int h(dfd $$0) {
      return $$0.c(c);
   }

   private boolean n(dfd $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, apg.wL, aph.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, apg.wM, aph.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bxj $$4 = bja.aN.a((cqb)$$1);
         if ($$4 != null) {
            ehh $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), asb.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(djn.i, $$2, djn.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   public static boolean a(cph $$0, gw $$1) {
      return $$0.a_($$1.d()).a(apv.ck);
   }
}
