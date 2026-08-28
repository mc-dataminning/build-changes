import com.mojang.serialization.MapCodec;

public class dmo extends dig implements dmn {
   public static final MapCodec<dmo> b = b(dmo::new);

   @Override
   public MapCodec<dmo> a() {
      return b;
   }

   public dmo(dsz.d $$0) {
      super(bps.a(1), $$0);
   }

   @Override
   public int a(dms.a $$0, dcv $$1, jd $$2, ayv $$3, dms $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jd $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jd $$10 = $$7.c();
               dta $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avp.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dms $$0, jd $$1, jd $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayn.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayn.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dta a(dcv $$0, jd $$1, ayv $$2, boolean $$3) {
      dta $$4;
      if ($$2.a(11) == 0) {
         $$4 = dfy.qV.o().a(dmr.d, Boolean.valueOf($$3));
      } else {
         $$4 = dfy.qQ.o();
      }

      return $$4.b(dtq.C) && !$$0.b_($$1).c() ? $$4.a(dtq.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dcv $$0, jd $$1) {
      dta $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dfy.G) && $$2.u().b(eoz.c)) {
         int $$3 = 0;

         for (jd $$4 : jd.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dta $$5 = $$0.a_($$4);
            if ($$5.a(dfy.qQ) || $$5.a(dfy.qV)) {
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
