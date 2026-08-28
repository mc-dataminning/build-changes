import com.mojang.serialization.Codec;

public class ejk extends ehr<ekc> {
   private static final jo[] a = jo.values();

   public ejk(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      azs $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dym $$4 = $$1.a_($$2.d());
         if (!$$4.a(dkw.ei) && !$$4.a(dkw.lm)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dhq $$0, azs $$1, jj $$2) {
      $$0.a($$2, dkw.lm.m(), 2);
      jj.a $$3 = new jj.a();
      jj.a $$4 = new jj.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jo $$7 : a) {
               dym $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dkw.ei) || $$8.a(dkw.lm)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dkw.lm.m(), 2);
            }
         }
      }
   }

   private void b(dhq $$0, azs $$1, jj $$2) {
      jj.a $$3 = new jj.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dym $$5 = $$0.a_($$3.d());
            if ($$5.a(dkw.ei) || $$5.a(dkw.lm)) {
               int $$6 = azk.a($$1, 1, 8);
               if ($$1.a(6) == 0) {
                  $$6 *= 2;
               }

               if ($$1.a(5) == 0) {
                  $$6 = 1;
               }

               int $$7 = 17;
               int $$8 = 25;
               a($$0, $$1, $$3, $$6, 17, 25);
            }
         }
      }
   }

   public static void a(dhq $$0, azs $$1, jj.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dkw.pb.m().b(dol.e, Integer.valueOf(azk.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dkw.pc.m(), 2);
         }

         $$2.c(jo.a);
      }
   }
}
