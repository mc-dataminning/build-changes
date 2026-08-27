import com.mojang.serialization.Codec;

public class dzx extends dye<eap> {
   private static final ij[] a = ij.values();

   public dzx(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      dab $$1 = $$0.b();
      id $$2 = $$0.e();
      axt $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dpi $$4 = $$1.a_($$2.c());
         if (!$$4.a(dcj.dV) && !$$4.a(dcj.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(czh $$0, axt $$1, id $$2) {
      $$0.a($$2, dcj.kK.n(), 2);
      id.a $$3 = new id.a();
      id.a $$4 = new id.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ij $$7 : a) {
               dpi $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dcj.dV) || $$8.a(dcj.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dcj.kK.n(), 2);
            }
         }
      }
   }

   private void b(czh $$0, axt $$1, id $$2) {
      id.a $$3 = new id.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dpi $$5 = $$0.a_($$3.c());
            if ($$5.a(dcj.dV) || $$5.a(dcj.kK)) {
               int $$6 = axm.a($$1, 1, 8);
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

   public static void a(czh $$0, axt $$1, id.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dcj.oz.n().a(dfw.e, Integer.valueOf(axm.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dcj.oA.n(), 2);
         }

         $$2.c(ij.a);
      }
   }
}
