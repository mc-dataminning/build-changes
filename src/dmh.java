import com.mojang.serialization.MapCodec;

public class dmh extends dhn implements dmg {
   public static final MapCodec<dmh> c = b(dmh::new);

   @Override
   public MapCodec<dmh> a() {
      return c;
   }

   public dmh(dtb.d $$0) {
      super(bpc.a(1), $$0);
   }

   @Override
   public int a(dml.a $$0, dcb $$1, ir $$2, ayt $$3, dml $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ir $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ir $$10 = $$7.c();
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

   private static int a(dml $$0, ir $$1, ir $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aym.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aym.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dtc a(dcb $$0, ir $$1, ayt $$2, boolean $$3) {
      dtc $$4;
      if ($$2.a(11) == 0) {
         $$4 = dfe.sg.n().a(dmk.d, Boolean.valueOf($$3));
      } else {
         $$4 = dfe.sb.n();
      }

      return $$4.b(dts.C) && !$$0.b_($$1).c() ? $$4.a(dts.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dcb $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dfe.al) && $$2.u().b(epf.c)) {
         int $$3 = 0;

         for (ir $$4 : ir.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dtc $$5 = $$0.a_($$4);
            if ($$5.a(dfe.sb) || $$5.a(dfe.sg)) {
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
