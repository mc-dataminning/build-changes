import com.mojang.serialization.MapCodec;

public class dtq extends dpc implements dtp {
   public static final MapCodec<dtq> b = b(dtq::new);

   @Override
   public MapCodec<dtq> a() {
      return b;
   }

   public dtq(eas.d $$0) {
      super(bti.a(1), $$0);
   }

   @Override
   public int a(dtu.a $$0, djn $$1, iv $$2, azv $$3, dtu $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iv $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iv $$10 = $$7.d();
               eat $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awo.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dtu $$0, iv $$1, iv $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azm.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azm.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private eat a(djn $$0, iv $$1, azv $$2, boolean $$3) {
      eat $$4;
      if ($$2.a(11) == 0) {
         $$4 = dmt.rD.m().b(dtt.d, Boolean.valueOf($$3));
      } else {
         $$4 = dmt.ry.m();
      }

      return $$4.b(ebj.I) && !$$0.b_($$1).c() ? $$4.b(ebj.I, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(djn $$0, iv $$1) {
      eat $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dmt.J) && $$2.y().b(exb.c)) {
         int $$3 = 0;

         for (iv $$4 : iv.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            eat $$5 = $$0.a_($$4);
            if ($$5.a(dmt.ry) || $$5.a(dmt.rD)) {
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
