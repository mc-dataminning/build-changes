import com.mojang.serialization.MapCodec;

public class dpm extends die {
   public static final MapCodec<dpm> a = b(dpm::new);
   public static final int b = 2;
   public static final dwj c = dvz.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fah g = die.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   public fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return g;
   }

   public int o(dvj $$0) {
      return $$0.c(c);
   }

   private boolean q(dvj $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awl.yC, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awl.yD, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cji $$4 = bul.aR.a($$1, buk.e);
         if ($$4 != null) {
            ezn $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azk.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eag.i, $$2, eag.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dvj $$0, erz $$1) {
      return false;
   }

   public static boolean a(deg $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axa.cu);
   }
}
