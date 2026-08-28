import com.mojang.serialization.MapCodec;

public class dsy extends dol implements dsx {
   public static final MapCodec<dsy> b = b(dsy::new);

   @Override
   public MapCodec<dsy> a() {
      return b;
   }

   public dsy(dzy.d $$0) {
      super(btd.a(1), $$0);
   }

   @Override
   public int a(dtc.a $$0, diw $$1, iu $$2, azv $$3, dtc $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iu $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iu $$10 = $$7.d();
               dzz $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awo.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dtc $$0, iu $$1, iu $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azm.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azm.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dzz a(diw $$0, iu $$1, azv $$2, boolean $$3) {
      dzz $$4;
      if ($$2.a(11) == 0) {
         $$4 = dmc.rA.m().b(dtb.d, Boolean.valueOf($$3));
      } else {
         $$4 = dmc.rv.m();
      }

      return $$4.b(eap.I) && !$$0.b_($$1).c() ? $$4.b(eap.I, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(diw $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dmc.J) && $$2.y().b(ewh.c)) {
         int $$3 = 0;

         for (iu $$4 : iu.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dzz $$5 = $$0.a_($$4);
            if ($$5.a(dmc.rv) || $$5.a(dmc.rA)) {
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
