import com.mojang.serialization.MapCodec;

public class dfe extends day implements dfd {
   public static final MapCodec<dfe> b = b(dfe::new);

   @Override
   public MapCodec<dfe> a() {
      return b;
   }

   public dfe(dle.d $$0) {
      super(bkw.a(1), $$0);
   }

   @Override
   public int a(dfi.a $$0, cvo $$1, hz $$2, awo $$3, dfi $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         hz $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               hz $$10 = $$7.c();
               dlf $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), atl.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dfi $$0, hz $$1, hz $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = awh.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = awh.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dlf a(cvo $$0, hz $$1, awo $$2, boolean $$3) {
      dlf $$4;
      if ($$2.a(11) == 0) {
         $$4 = cyq.qV.o().a(dfh.d, Boolean.valueOf($$3));
      } else {
         $$4 = cyq.qQ.o();
      }

      return $$4.b(dlv.C) && !$$0.b_($$1).c() ? $$4.a(dlv.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cvo $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cyq.G) && $$2.u().b(egq.c)) {
         int $$3 = 0;

         for (hz $$4 : hz.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dlf $$5 = $$0.a_($$4);
            if ($$5.a(cyq.qQ) || $$5.a(cyq.qV)) {
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
