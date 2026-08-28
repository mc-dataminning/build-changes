import com.mojang.serialization.Codec;

public class edt extends eca<eel> {
   private static final ji[] a = ji.values();

   public edt(Codec<eel> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayv $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dta $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfy.dV) && !$$4.a(dfy.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dcv $$0, ayv $$1, jd $$2) {
      $$0.a($$2, dfy.kK.o(), 2);
      jd.a $$3 = new jd.a();
      jd.a $$4 = new jd.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ji $$7 : a) {
               dta $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dfy.dV) || $$8.a(dfy.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dfy.kK.o(), 2);
            }
         }
      }
   }

   private void b(dcv $$0, ayv $$1, jd $$2) {
      jd.a $$3 = new jd.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dta $$5 = $$0.a_($$3.c());
            if ($$5.a(dfy.dV) || $$5.a(dfy.kK)) {
               int $$6 = ayn.a($$1, 1, 8);
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

   public static void a(dcv $$0, ayv $$1, jd.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dfy.oz.o().a(djl.e, Integer.valueOf(ayn.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dfy.oA.o(), 2);
         }

         $$2.c(ji.a);
      }
   }
}
