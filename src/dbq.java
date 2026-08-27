import com.mojang.serialization.MapCodec;

public class dbq extends cxk implements dbp {
   public static final MapCodec<dbq> b = b(dbq::new);

   @Override
   public MapCodec<dbq> a() {
      return b;
   }

   public dbq(dhh.d $$0) {
      super(bhz.a(1), $$0);
   }

   @Override
   public int a(dbu.a $$0, csb $$1, ht $$2, ats $$3, dbu $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ht $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ht $$10 = $$7.c();
               dhi $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aqs.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dbu $$0, ht $$1, ht $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = atm.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = atm.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dhi a(csb $$0, ht $$1, ats $$2, boolean $$3) {
      dhi $$4;
      if ($$2.a(11) == 0) {
         $$4 = cvc.qV.o().a(dbt.d, Boolean.valueOf($$3));
      } else {
         $$4 = cvc.qQ.o();
      }

      return $$4.b(dhy.C) && !$$0.b_($$1).c() ? $$4.a(dhy.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(csb $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cvc.G) && $$2.u().b(ect.c)) {
         int $$3 = 0;

         for (ht $$4 : ht.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dhi $$5 = $$0.a_($$4);
            if ($$5.a(cvc.qQ) || $$5.a(cvc.qV)) {
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
