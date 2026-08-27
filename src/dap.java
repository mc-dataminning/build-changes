import com.mojang.serialization.MapCodec;

public class dap extends cwi implements dao {
   public static final MapCodec<dap> b = b(dap::new);

   @Override
   public MapCodec<dap> a() {
      return b;
   }

   public dap(dga.d $$0) {
      super(bhd.a(1), $$0);
   }

   @Override
   public int a(dat.a $$0, cra $$1, ht $$2, ate $$3, dat $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ht $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ht $$10 = $$7.c();
               dgb $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aqe.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dat $$0, ht $$1, ht $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = asy.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = asy.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dgb a(cra $$0, ht $$1, ate $$2, boolean $$3) {
      dgb $$4;
      if ($$2.a(11) == 0) {
         $$4 = cuc.qI.o().a(das.d, Boolean.valueOf($$3));
      } else {
         $$4 = cuc.qD.o();
      }

      return $$4.b(dgr.C) && !$$0.b_($$1).c() ? $$4.a(dgr.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cra $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cuc.G) && $$2.u().b(ebf.c)) {
         int $$3 = 0;

         for (ht $$4 : ht.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dgb $$5 = $$0.a_($$4);
            if ($$5.a(cuc.qD) || $$5.a(cuc.qI)) {
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
