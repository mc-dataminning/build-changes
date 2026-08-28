import com.mojang.serialization.Codec;

public class edq extends ecd<efe> {
   public edq(Codec<efe> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<efe> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ayw $$3 = $$0.d();
         efe $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         jd.a $$8 = new jd.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(ayo.a($$3, -$$5, $$5), ayo.a($$3, -$$6, $$6), ayo.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (jd)$$8)) {
               int $$10 = ayo.a($$3, 1, $$7);
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

   private static boolean a(dcx $$0, jd.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dcx $$0, ayw $$1, jd.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dga.oB.o().a(djn.e, Integer.valueOf(ayo.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dga.oC.o(), 2);
         }

         $$2.c(ji.b);
      }
   }

   private static boolean a(dcx $$0, jd $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         dtc $$2 = $$0.a_($$1.e());
         return !$$2.a(dga.dV) && !$$2.a(dga.on) && !$$2.a(dga.op);
      }
   }
}
