import com.mojang.serialization.MapCodec;

public class dcp extends cyj implements dco {
   public static final MapCodec<dcp> b = b(dcp::new);

   @Override
   public MapCodec<dcp> a() {
      return b;
   }

   public dcp(dio.d $$0) {
      super(bin.a(1), $$0);
   }

   @Override
   public int a(dct.a $$0, csz $$1, hv $$2, auf $$3, dct $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         hv $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               hv $$10 = $$7.c();
               dip $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), ard.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dct $$0, hv $$1, hv $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aty.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aty.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dip a(csz $$0, hv $$1, auf $$2, boolean $$3) {
      dip $$4;
      if ($$2.a(11) == 0) {
         $$4 = cwb.qV.o().a(dcs.d, Boolean.valueOf($$3));
      } else {
         $$4 = cwb.qQ.o();
      }

      return $$4.b(djf.C) && !$$0.b_($$1).c() ? $$4.a(djf.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(csz $$0, hv $$1) {
      dip $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cwb.G) && $$2.u().b(eea.c)) {
         int $$3 = 0;

         for (hv $$4 : hv.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dip $$5 = $$0.a_($$4);
            if ($$5.a(cwb.qQ) || $$5.a(cwb.qV)) {
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
