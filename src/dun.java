import com.mojang.serialization.MapCodec;

public class dun extends dpz implements dum {
   public static final MapCodec<dun> b = b(dun::new);

   @Override
   public MapCodec<dun> a() {
      return b;
   }

   public dun(ebp.d $$0) {
      super(bue.a(1), $$0);
   }

   @Override
   public int a(dur.a $$0, dkk $$1, iw $$2, bai $$3, dur $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iw $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iw $$10 = $$7.d();
               ebq $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awz.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dur $$0, iw $$1, iw $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azz.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azz.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private ebq a(dkk $$0, iw $$1, bai $$2, boolean $$3) {
      ebq $$4;
      if ($$2.a(11) == 0) {
         $$4 = dnq.rD.m().b(duq.d, Boolean.valueOf($$3));
      } else {
         $$4 = dnq.ry.m();
      }

      return $$4.b(ecg.I) && !$$0.b_($$1).c() ? $$4.b(ecg.I, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dkk $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dnq.J) && $$2.y().b(eyb.c)) {
         int $$3 = 0;

         for (iw $$4 : iw.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            ebq $$5 = $$0.a_($$4);
            if ($$5.a(dnq.ry) || $$5.a(dnq.rD)) {
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
