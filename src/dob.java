import com.mojang.serialization.MapCodec;

public class dob extends djt implements doa {
   public static final MapCodec<dob> b = b(dob::new);

   @Override
   public MapCodec<dob> a() {
      return b;
   }

   public dob(dun.d $$0) {
      super(bqr.a(1), $$0);
   }

   @Override
   public int a(dof.a $$0, deh $$1, je $$2, azl $$3, dof $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         je $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               je $$10 = $$7.d();
               duo $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awf.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dof $$0, je $$1, je $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azd.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azd.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private duo a(deh $$0, je $$1, azl $$2, boolean $$3) {
      duo $$4;
      if ($$2.a(11) == 0) {
         $$4 = dhl.qV.o().b(doe.d, Boolean.valueOf($$3));
      } else {
         $$4 = dhl.qQ.o();
      }

      return $$4.b(dve.C) && !$$0.b_($$1).c() ? $$4.b(dve.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(deh $$0, je $$1) {
      duo $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dhl.G) && $$2.y().b(eqq.c)) {
         int $$3 = 0;

         for (je $$4 : je.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            duo $$5 = $$0.a_($$4);
            if ($$5.a(dhl.qQ) || $$5.a(dhl.qV)) {
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
