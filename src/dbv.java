import com.mojang.serialization.MapCodec;

public class dbv extends cxp implements dbu {
   public static final MapCodec<dbv> b = b(dbv::new);

   @Override
   public MapCodec<dbv> a() {
      return b;
   }

   public dbv(dhm.d $$0) {
      super(bid.a(1), $$0);
   }

   @Override
   public int a(dbz.a $$0, csg $$1, hx $$2, atw $$3, dbz $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         hx $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               hx $$10 = $$7.c();
               dhn $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aqw.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dbz $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = atq.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = atq.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dhn a(csg $$0, hx $$1, atw $$2, boolean $$3) {
      dhn $$4;
      if ($$2.a(11) == 0) {
         $$4 = cvh.qV.o().a(dby.d, Boolean.valueOf($$3));
      } else {
         $$4 = cvh.qQ.o();
      }

      return $$4.b(did.C) && !$$0.b_($$1).c() ? $$4.a(did.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(csg $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cvh.G) && $$2.u().b(ecy.c)) {
         int $$3 = 0;

         for (hx $$4 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dhn $$5 = $$0.a_($$4);
            if ($$5.a(cvh.qQ) || $$5.a(cvh.qV)) {
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
