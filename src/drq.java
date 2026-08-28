import com.mojang.serialization.MapCodec;

public class drq extends dnf implements drp {
   public static final MapCodec<drq> b = b(drq::new);

   @Override
   public MapCodec<drq> a() {
      return b;
   }

   public drq(dyl.d $$0) {
      super(bss.a(1), $$0);
   }

   @Override
   public int a(dru.a $$0, dhq $$1, jj $$2, azs $$3, dru $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jj $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jj $$10 = $$7.d();
               dym $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awl.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dru $$0, jj $$1, jj $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azk.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azk.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dym a(dhq $$0, jj $$1, azs $$2, boolean $$3) {
      dym $$4;
      if ($$2.a(11) == 0) {
         $$4 = dkw.rz.m().b(drt.d, Boolean.valueOf($$3));
      } else {
         $$4 = dkw.ru.m();
      }

      return $$4.b(dzc.I) && !$$0.b_($$1).c() ? $$4.b(dzc.I, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dhq $$0, jj $$1) {
      dym $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dkw.J) && $$2.y().b(euu.c)) {
         int $$3 = 0;

         for (jj $$4 : jj.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dym $$5 = $$0.a_($$4);
            if ($$5.a(dkw.ru) || $$5.a(dkw.rz)) {
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
