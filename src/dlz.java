import com.mojang.serialization.MapCodec;

public class dlz extends dhs implements dly {
   public static final MapCodec<dlz> b = b(dlz::new);

   @Override
   public MapCodec<dlz> a() {
      return b;
   }

   public dlz(dsk.d $$0) {
      super(bpj.a(1), $$0);
   }

   @Override
   public int a(dmd.a $$0, dch $$1, ja $$2, ayo $$3, dmd $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ja $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ja $$10 = $$7.c();
               dsl $$11 = this.a($$1, $$10, $$3, $$4.h());
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

   private static int a(dmd $$0, ja $$1, ja $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayg.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayg.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dsl a(dch $$0, ja $$1, ayo $$2, boolean $$3) {
      dsl $$4;
      if ($$2.a(11) == 0) {
         $$4 = dfk.qV.o().a(dmc.d, Boolean.valueOf($$3));
      } else {
         $$4 = dfk.qQ.o();
      }

      return $$4.b(dtb.C) && !$$0.b_($$1).c() ? $$4.a(dtb.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dch $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dfk.G) && $$2.u().b(eok.c)) {
         int $$3 = 0;

         for (ja $$4 : ja.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dsl $$5 = $$0.a_($$4);
            if ($$5.a(dfk.qQ) || $$5.a(dfk.qV)) {
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
