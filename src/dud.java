import com.mojang.serialization.MapCodec;

public class dud extends dpp implements duc {
   public static final MapCodec<dud> b = b(dud::new);

   @Override
   public MapCodec<dud> a() {
      return b;
   }

   public dud(ebf.d $$0) {
      super(btv.a(1), $$0);
   }

   @Override
   public int a(duh.a $$0, dka $$1, iw $$2, azz $$3, duh $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iw $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iw $$10 = $$7.d();
               ebg $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), aws.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(duh $$0, iw $$1, iw $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azq.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azq.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private ebg a(dka $$0, iw $$1, azz $$2, boolean $$3) {
      ebg $$4;
      if ($$2.a(11) == 0) {
         $$4 = dng.rD.m().b(dug.d, Boolean.valueOf($$3));
      } else {
         $$4 = dng.ry.m();
      }

      return $$4.b(ebw.I) && !$$0.b_($$1).c() ? $$4.b(ebw.I, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dka $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dng.J) && $$2.y().b(exr.c)) {
         int $$3 = 0;

         for (iw $$4 : iw.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            ebg $$5 = $$0.a_($$4);
            if ($$5.a(dng.ry) || $$5.a(dng.rD)) {
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
