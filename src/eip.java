import com.mojang.serialization.Codec;

public class eip extends egw<ejh> {
   private static final jm[] a = jm.values();

   public eip(Codec<ejh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejh> $$0) {
      dig $$1 = $$0.b();
      jh $$2 = $$0.e();
      bam $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dxv $$4 = $$1.a_($$2.d());
         if (!$$4.a(dko.ei) && !$$4.a(dko.lf)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dhj $$0, bam $$1, jh $$2) {
      $$0.a($$2, dko.lf.m(), 2);
      jh.a $$3 = new jh.a();
      jh.a $$4 = new jh.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jm $$7 : a) {
               dxv $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dko.ei) || $$8.a(dko.lf)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dko.lf.m(), 2);
            }
         }
      }
   }

   private void b(dhj $$0, bam $$1, jh $$2) {
      jh.a $$3 = new jh.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dxv $$5 = $$0.a_($$3.d());
            if ($$5.a(dko.ei) || $$5.a(dko.lf)) {
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

   public static void a(dhj $$0, bam $$1, jh.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dko.oU.m().b(doc.e, Integer.valueOf(bae.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dko.oV.m(), 2);
         }

         $$2.c(jm.a);
      }
   }
}
