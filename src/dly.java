import com.mojang.serialization.MapCodec;

public class dly extends dhr implements dlx {
   public static final MapCodec<dly> b = b(dly::new);

   @Override
   public MapCodec<dly> a() {
      return b;
   }

   public dly(dsj.d $$0) {
      super(bpi.a(1), $$0);
   }

   @Override
   public int a(dmc.a $$0, dcg $$1, ja $$2, ayo $$3, dmc $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ja $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ja $$10 = $$7.c();
               dsk $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avi.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dmc $$0, ja $$1, ja $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayg.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayg.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dsk a(dcg $$0, ja $$1, ayo $$2, boolean $$3) {
      dsk $$4;
      if ($$2.a(11) == 0) {
         $$4 = dfj.qV.o().a(dmb.d, Boolean.valueOf($$3));
      } else {
         $$4 = dfj.qQ.o();
      }

      return $$4.b(dta.C) && !$$0.b_($$1).c() ? $$4.a(dta.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dcg $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dfj.G) && $$2.u().b(eoi.c)) {
         int $$3 = 0;

         for (ja $$4 : ja.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dsk $$5 = $$0.a_($$4);
            if ($$5.a(dfj.qQ) || $$5.a(dfj.qV)) {
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
