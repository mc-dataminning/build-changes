import com.mojang.serialization.Codec;

public class eaw extends dzd<ebo> {
   private static final is[] a = is.values();

   public eaw(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      ayg $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dqh $$4 = $$1.a_($$2.c());
         if (!$$4.a(ddg.dV) && !$$4.a(ddg.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dae $$0, ayg $$1, in $$2) {
      $$0.a($$2, ddg.kK.n(), 2);
      in.a $$3 = new in.a();
      in.a $$4 = new in.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (is $$7 : a) {
               dqh $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(ddg.dV) || $$8.a(ddg.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, ddg.kK.n(), 2);
            }
         }
      }
   }

   private void b(dae $$0, ayg $$1, in $$2) {
      in.a $$3 = new in.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dqh $$5 = $$0.a_($$3.c());
            if ($$5.a(ddg.dV) || $$5.a(ddg.kK)) {
               int $$6 = axz.a($$1, 1, 8);
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

   public static void a(dae $$0, ayg $$1, in.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, ddg.oz.n().a(dgt.e, Integer.valueOf(axz.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, ddg.oA.n(), 2);
         }

         $$2.c(is.a);
      }
   }
}
