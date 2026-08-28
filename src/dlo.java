import com.mojang.serialization.MapCodec;

public class dlo extends dhh implements dln {
   public static final MapCodec<dlo> b = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return b;
   }

   public dlo(drz.d $$0) {
      super(bpu.a(1), $$0);
   }

   @Override
   public int a(dls.a $$0, dbx $$1, iz $$2, azf $$3, dls $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iz $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iz $$10 = $$7.c();
               dsa $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), awa.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dls $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayx.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayx.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dsa a(dbx $$0, iz $$1, azf $$2, boolean $$3) {
      dsa $$4;
      if ($$2.a(11) == 0) {
         $$4 = dez.qV.o().a(dlr.d, Boolean.valueOf($$3));
      } else {
         $$4 = dez.qQ.o();
      }

      return $$4.b(dsq.C) && !$$0.b_($$1).c() ? $$4.a(dsq.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dbx $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dez.G) && $$2.u().b(enu.c)) {
         int $$3 = 0;

         for (iz $$4 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dsa $$5 = $$0.a_($$4);
            if ($$5.a(dez.qQ) || $$5.a(dez.qV)) {
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
