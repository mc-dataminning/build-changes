import com.mojang.serialization.MapCodec;

public class dov extends dko implements dou {
   public static final MapCodec<dov> b = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return b;
   }

   public dov(dvi.d $$0) {
      super(brf.a(1), $$0);
   }

   @Override
   public int a(doz.a $$0, dfc $$1, jh $$2, azs $$3, doz $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jh $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jh $$10 = $$7.d();
               dvj $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awm.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(doz $$0, jh $$1, jh $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azk.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azk.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dvj a(dfc $$0, jh $$1, azs $$2, boolean $$3) {
      dvj $$4;
      if ($$2.a(11) == 0) {
         $$4 = dig.qV.m().b(doy.d, Boolean.valueOf($$3));
      } else {
         $$4 = dig.qQ.m();
      }

      return $$4.b(dvz.C) && !$$0.b_($$1).c() ? $$4.b(dvz.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dfc $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dig.G) && $$2.y().b(erl.c)) {
         int $$3 = 0;

         for (jh $$4 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dvj $$5 = $$0.a_($$4);
            if ($$5.a(dig.qQ) || $$5.a(dig.qV)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
