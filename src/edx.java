import com.mojang.serialization.Codec;

public class edx extends ece<eep> {
   private static final ji[] a = ji.values();

   public edx(Codec<eep> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eep> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayw $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dtc $$4 = $$1.a_($$2.d());
         if (!$$4.a(dga.dV) && !$$4.a(dga.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dcx $$0, ayw $$1, jd $$2) {
      $$0.a($$2, dga.kK.o(), 2);
      jd.a $$3 = new jd.a();
      jd.a $$4 = new jd.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ji $$7 : a) {
               dtc $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dga.dV) || $$8.a(dga.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dga.kK.o(), 2);
            }
         }
      }
   }

   private void b(dcx $$0, ayw $$1, jd $$2) {
      jd.a $$3 = new jd.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dtc $$5 = $$0.a_($$3.d());
            if ($$5.a(dga.dV) || $$5.a(dga.kK)) {
               int $$6 = ayo.a($$1, 1, 8);
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

   public static void a(dcx $$0, ayw $$1, jd.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dga.oz.o().a(djn.e, Integer.valueOf(ayo.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dga.oA.o(), 2);
         }

         $$2.c(ji.a);
      }
   }
}
