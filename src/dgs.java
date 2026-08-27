import com.mojang.serialization.MapCodec;

public class dgs extends dcm implements dgr {
   public static final MapCodec<dgs> b = b(dgs::new);

   @Override
   public MapCodec<dgs> a() {
      return b;
   }

   public dgs(dna.d $$0) {
      super(bmf.a(1), $$0);
   }

   @Override
   public int a(dgw.a $$0, cxc $$1, ib $$2, axd $$3, dgw $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ib $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ib $$10 = $$7.c();
               dnb $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), atz.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dgw $$0, ib $$1, ib $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aww.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aww.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dnb a(cxc $$0, ib $$1, axd $$2, boolean $$3) {
      dnb $$4;
      if ($$2.a(11) == 0) {
         $$4 = dae.qV.o().a(dgv.d, Boolean.valueOf($$3));
      } else {
         $$4 = dae.qQ.o();
      }

      return $$4.b(dnr.C) && !$$0.b_($$1).c() ? $$4.a(dnr.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cxc $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dae.G) && $$2.u().b(eiq.c)) {
         int $$3 = 0;

         for (ib $$4 : ib.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dnb $$5 = $$0.a_($$4);
            if ($$5.a(dae.qQ) || $$5.a(dae.qV)) {
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
