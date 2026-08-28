import com.mojang.serialization.MapCodec;

public class dnn extends djf implements dnm {
   public static final MapCodec<dnn> b = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return b;
   }

   public dnn(dtz.d $$0) {
      super(bqm.a(1), $$0);
   }

   @Override
   public int a(dnr.a $$0, ddt $$1, je $$2, azk $$3, dnr $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         je $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               je $$10 = $$7.d();
               dua $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awe.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dnr $$0, je $$1, je $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azc.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azc.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dua a(ddt $$0, je $$1, azk $$2, boolean $$3) {
      dua $$4;
      if ($$2.a(11) == 0) {
         $$4 = dgx.qV.o().b(dnq.d, Boolean.valueOf($$3));
      } else {
         $$4 = dgx.qQ.o();
      }

      return $$4.b(duq.C) && !$$0.b_($$1).c() ? $$4.b(duq.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(ddt $$0, je $$1) {
      dua $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dgx.G) && $$2.y().b(eqc.c)) {
         int $$3 = 0;

         for (je $$4 : je.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dua $$5 = $$0.a_($$4);
            if ($$5.a(dgx.qQ) || $$5.a(dgx.qV)) {
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
