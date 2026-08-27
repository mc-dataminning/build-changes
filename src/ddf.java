import com.mojang.serialization.MapCodec;

public class ddf extends cyz implements dde {
   public static final MapCodec<ddf> b = b(ddf::new);

   @Override
   public MapCodec<ddf> a() {
      return b;
   }

   public ddf(djf.d $$0) {
      super(bjc.a(1), $$0);
   }

   @Override
   public int a(ddj.a $$0, ctp $$1, hx $$2, auu $$3, ddj $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         hx $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               hx $$10 = $$7.c();
               djg $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), ars.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(ddj $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aun.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aun.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private djg a(ctp $$0, hx $$1, auu $$2, boolean $$3) {
      djg $$4;
      if ($$2.a(11) == 0) {
         $$4 = cwr.qV.o().a(ddi.d, Boolean.valueOf($$3));
      } else {
         $$4 = cwr.qQ.o();
      }

      return $$4.b(djw.C) && !$$0.b_($$1).c() ? $$4.a(djw.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(ctp $$0, hx $$1) {
      djg $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cwr.G) && $$2.u().b(eer.c)) {
         int $$3 = 0;

         for (hx $$4 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            djg $$5 = $$0.a_($$4);
            if ($$5.a(cwr.qQ) || $$5.a(cwr.qV)) {
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
