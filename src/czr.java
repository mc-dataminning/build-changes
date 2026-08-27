import com.mojang.serialization.MapCodec;

public class czr extends cvk implements czq {
   public static final MapCodec<czr> b = b(czr::new);

   @Override
   public MapCodec<czr> a() {
      return b;
   }

   public czr(dfc.d $$0) {
      super(bgg.a(1), $$0);
   }

   @Override
   public int a(czv.a $$0, cqc $$1, gw $$2, ash $$3, czv $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         gw $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               gw $$10 = $$7.c();
               dfd $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aph.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(czv $$0, gw $$1, gw $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = asb.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = asb.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dfd a(cqc $$0, gw $$1, ash $$2, boolean $$3) {
      dfd $$4;
      if ($$2.a(11) == 0) {
         $$4 = cte.qI.o().a(czu.d, Boolean.valueOf($$3));
      } else {
         $$4 = cte.qD.o();
      }

      return $$4.b(dft.C) && !$$0.b_($$1).c() ? $$4.a(dft.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cqc $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cte.G) && $$2.u().b(eah.c)) {
         int $$3 = 0;

         for (gw $$4 : gw.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dfd $$5 = $$0.a_($$4);
            if ($$5.a(cte.qD) || $$5.a(cte.qI)) {
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
