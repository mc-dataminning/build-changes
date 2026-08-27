import com.mojang.serialization.MapCodec;

public class dgq extends dck implements dgp {
   public static final MapCodec<dgq> b = b(dgq::new);

   @Override
   public MapCodec<dgq> a() {
      return b;
   }

   public dgq(dmy.d $$0) {
      super(bme.a(1), $$0);
   }

   @Override
   public int a(dgu.a $$0, cxa $$1, ib $$2, axd $$3, dgu $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ib $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ib $$10 = $$7.c();
               dmz $$11 = this.a($$1, $$10, $$3, $$4.h());
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

   private static int a(dgu $$0, ib $$1, ib $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aww.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aww.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dmz a(cxa $$0, ib $$1, axd $$2, boolean $$3) {
      dmz $$4;
      if ($$2.a(11) == 0) {
         $$4 = dac.qV.o().a(dgt.d, Boolean.valueOf($$3));
      } else {
         $$4 = dac.qQ.o();
      }

      return $$4.b(dnp.C) && !$$0.b_($$1).c() ? $$4.a(dnp.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cxa $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dac.G) && $$2.u().b(eio.c)) {
         int $$3 = 0;

         for (ib $$4 : ib.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dmz $$5 = $$0.a_($$4);
            if ($$5.a(dac.qQ) || $$5.a(dac.qV)) {
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
