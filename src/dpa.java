import com.mojang.serialization.MapCodec;

public class dpa extends dkt implements doz {
   public static final MapCodec<dpa> b = b(dpa::new);

   @Override
   public MapCodec<dpa> a() {
      return b;
   }

   public dpa(dvn.d $$0) {
      super(brj.a(1), $$0);
   }

   @Override
   public int a(dpe.a $$0, dfg $$1, jh $$2, azv $$3, dpe $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jh $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jh $$10 = $$7.d();
               dvo $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awp.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dpe $$0, jh $$1, jh $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azn.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azn.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dvo a(dfg $$0, jh $$1, azv $$2, boolean $$3) {
      dvo $$4;
      if ($$2.a(11) == 0) {
         $$4 = dil.qV.m().b(dpd.d, Boolean.valueOf($$3));
      } else {
         $$4 = dil.qQ.m();
      }

      return $$4.b(dwe.C) && !$$0.b_($$1).c() ? $$4.b(dwe.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dfg $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dil.G) && $$2.y().b(erp.c)) {
         int $$3 = 0;

         for (jh $$4 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dvo $$5 = $$0.a_($$4);
            if ($$5.a(dil.qQ) || $$5.a(dil.qV)) {
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
