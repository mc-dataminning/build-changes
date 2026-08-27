import com.mojang.serialization.Codec;

public class ebk extends dzx<ecy> {
   public ebk(Codec<ecy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecy> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         ayk $$3 = $$0.d();
         ecy $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         io.a $$8 = new io.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(ayd.a($$3, -$$5, $$5), ayd.a($$3, -$$6, $$6), ayd.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (io)$$8)) {
               int $$10 = ayd.a($$3, 1, $$7);
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

   private static boolean a(day $$0, io.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.s($$1)) {
            return false;
         }
      } while ($$0.a_($$1).i());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(day $$0, ayk $$1, io.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.c())) {
               $$0.a($$2, dea.oB.n().a(dhn.e, Integer.valueOf(ayd.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dea.oC.n(), 2);
         }

         $$2.c(it.b);
      }
   }

   private static boolean a(day $$0, io $$1) {
      if (!$$0.u($$1)) {
         return true;
      } else {
         drb $$2 = $$0.a_($$1.d());
         return !$$2.a(dea.dV) && !$$2.a(dea.on) && !$$2.a(dea.op);
      }
   }
}
