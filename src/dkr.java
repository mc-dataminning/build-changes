import com.mojang.serialization.MapCodec;

public class dkr extends dgk implements dkq {
   public static final MapCodec<dkr> b = b(dkr::new);

   @Override
   public MapCodec<dkr> a() {
      return b;
   }

   public dkr(drc.d $$0) {
      super(boy.a(1), $$0);
   }

   @Override
   public int a(dkv.a $$0, dba $$1, io $$2, aym $$3, dkv $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         io $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               io $$10 = $$7.c();
               drd $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avj.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dkv $$0, io $$1, io $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayf.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayf.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private drd a(dba $$0, io $$1, aym $$2, boolean $$3) {
      drd $$4;
      if ($$2.a(11) == 0) {
         $$4 = dec.qV.n().a(dku.d, Boolean.valueOf($$3));
      } else {
         $$4 = dec.qQ.n();
      }

      return $$4.b(drt.C) && !$$0.b_($$1).c() ? $$4.a(drt.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dba $$0, io $$1) {
      drd $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dec.G) && $$2.u().b(emx.c)) {
         int $$3 = 0;

         for (io $$4 : io.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            drd $$5 = $$0.a_($$4);
            if ($$5.a(dec.qQ) || $$5.a(dec.qV)) {
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
