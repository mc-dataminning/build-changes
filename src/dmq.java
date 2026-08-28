import com.mojang.serialization.MapCodec;

public class dmq extends dii implements dmp {
   public static final MapCodec<dmq> b = b(dmq::new);

   @Override
   public MapCodec<dmq> a() {
      return b;
   }

   public dmq(dtb.d $$0) {
      super(bpt.a(1), $$0);
   }

   @Override
   public int a(dmu.a $$0, dcx $$1, jd $$2, ayw $$3, dmu $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jd $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jd $$10 = $$7.d();
               dtc $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avq.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dmu $$0, jd $$1, jd $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayo.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayo.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dtc a(dcx $$0, jd $$1, ayw $$2, boolean $$3) {
      dtc $$4;
      if ($$2.a(11) == 0) {
         $$4 = dga.qV.o().a(dmt.d, Boolean.valueOf($$3));
      } else {
         $$4 = dga.qQ.o();
      }

      return $$4.b(dts.C) && !$$0.b_($$1).c() ? $$4.a(dts.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dcx $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1.d());
      if ($$2.i() || $$2.a(dga.G) && $$2.u().b(epf.c)) {
         int $$3 = 0;

         for (jd $$4 : jd.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dtc $$5 = $$0.a_($$4);
            if ($$5.a(dga.qQ) || $$5.a(dga.qV)) {
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
