import com.mojang.serialization.Codec;

public class ekg extends eit<elu> {
   public ekg(Codec<elu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<elu> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         azt $$3 = $$0.d();
         elu $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         iu.a $$8 = new iu.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(azk.a($$3, -$$5, $$5), azk.a($$3, -$$6, $$6), azk.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (iu)$$8)) {
               int $$10 = azk.a($$3, 1, $$7);
               if ($$3.a(6) == 0) {
                  $$10 *= 2;
               }

               if ($$3.a(5) == 0) {
                  $$10 = 1;
               }

               int $$11 = 17;
               int $$12 = 25;
               a($$1, $$3, $$8, $$10, 17, 25);
            }
         }

         return true;
      }
   }

   private static boolean a(diq $$0, iu.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.t($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(diq $$0, azt $$1, iu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.d())) {
               $$0.a($$2, dlw.pd.m().b(dpl.e, Integer.valueOf(azk.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dlw.pe.m(), 2);
         }

         $$2.c(ja.b);
      }
   }

   private static boolean a(diq $$0, iu $$1) {
      if (!$$0.v($$1)) {
         return true;
      } else {
         dzo $$2 = $$0.a_($$1.e());
         return !$$2.a(dlw.ei) && !$$2.a(dlw.oP) && !$$2.a(dlw.oR);
      }
   }
}
