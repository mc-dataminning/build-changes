import com.mojang.serialization.MapCodec;

public class doe extends djw implements dod {
   public static final MapCodec<doe> b = b(doe::new);

   @Override
   public MapCodec<doe> a() {
      return b;
   }

   public doe(dur.d $$0) {
      super(bqu.a(1), $$0);
   }

   @Override
   public int a(doi.a $$0, dek $$1, jf $$2, azn $$3, doi $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jf $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jf $$10 = $$7.d();
               dus $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awh.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(doi $$0, jf $$1, jf $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azf.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azf.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dus a(dek $$0, jf $$1, azn $$2, boolean $$3) {
      dus $$4;
      if ($$2.a(11) == 0) {
         $$4 = dho.qV.n().b(doh.d, Boolean.valueOf($$3));
      } else {
         $$4 = dho.qQ.n();
      }

      return $$4.b(dvi.C) && !$$0.b_($$1).c() ? $$4.b(dvi.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dek $$0, jf $$1) {
      dus $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dho.G) && $$2.y().b(equ.c)) {
         int $$3 = 0;

         for (jf $$4 : jf.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dus $$5 = $$0.a_($$4);
            if ($$5.a(dho.qQ) || $$5.a(dho.qV)) {
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
