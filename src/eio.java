import com.mojang.serialization.Codec;

public class eio extends egv<ejg> {
   private static final jm[] a = jm.values();

   public eio(Codec<ejg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejg> $$0) {
      dif $$1 = $$0.b();
      jh $$2 = $$0.e();
      bam $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dxu $$4 = $$1.a_($$2.d());
         if (!$$4.a(dkn.ei) && !$$4.a(dkn.lf)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dhi $$0, bam $$1, jh $$2) {
      $$0.a($$2, dkn.lf.m(), 2);
      jh.a $$3 = new jh.a();
      jh.a $$4 = new jh.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jm $$7 : a) {
               dxu $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dkn.ei) || $$8.a(dkn.lf)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dkn.lf.m(), 2);
            }
         }
      }
   }

   private void b(dhi $$0, bam $$1, jh $$2) {
      jh.a $$3 = new jh.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dxu $$5 = $$0.a_($$3.d());
            if ($$5.a(dkn.ei) || $$5.a(dkn.lf)) {
               int $$6 = bae.a($$1, 1, 8);
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

   public static void a(dhi $$0, bam $$1, jh.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dkn.oU.m().b(dob.e, Integer.valueOf(bae.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dkn.oV.m(), 2);
         }

         $$2.c(jm.a);
      }
   }
}
