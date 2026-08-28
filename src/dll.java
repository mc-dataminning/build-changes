import com.mojang.serialization.MapCodec;

public class dll extends dhe implements dlk {
   public static final MapCodec<dll> b = b(dll::new);

   @Override
   public MapCodec<dll> a() {
      return b;
   }

   public dll(drw.d $$0) {
      super(bpr.a(1), $$0);
   }

   @Override
   public int a(dlp.a $$0, dbu $$1, iz $$2, azc $$3, dlp $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iz $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iz $$10 = $$7.c();
               drx $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avx.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dlp $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayu.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayu.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private drx a(dbu $$0, iz $$1, azc $$2, boolean $$3) {
      drx $$4;
      if ($$2.a(11) == 0) {
         $$4 = dew.qV.n().a(dlo.d, Boolean.valueOf($$3));
      } else {
         $$4 = dew.qQ.n();
      }

      return $$4.b(dsn.C) && !$$0.b_($$1).c() ? $$4.a(dsn.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dbu $$0, iz $$1) {
      drx $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dew.G) && $$2.u().b(enr.c)) {
         int $$3 = 0;

         for (iz $$4 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            drx $$5 = $$0.a_($$4);
            if ($$5.a(dew.qQ) || $$5.a(dew.qV)) {
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
