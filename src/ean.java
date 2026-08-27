import com.mojang.serialization.Codec;

public class ean extends dyu<ebf> {
   private static final ir[] a = ir.values();

   public ean(Codec<ebf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebf> $$0) {
      dap $$1 = $$0.b();
      im $$2 = $$0.e();
      ayd $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dpy $$4 = $$1.a_($$2.c());
         if (!$$4.a(dcx.dV) && !$$4.a(dcx.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(czv $$0, ayd $$1, im $$2) {
      $$0.a($$2, dcx.kK.n(), 2);
      im.a $$3 = new im.a();
      im.a $$4 = new im.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (ir $$7 : a) {
               dpy $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dcx.dV) || $$8.a(dcx.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dcx.kK.n(), 2);
            }
         }
      }
   }

   private void b(czv $$0, ayd $$1, im $$2) {
      im.a $$3 = new im.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dpy $$5 = $$0.a_($$3.c());
            if ($$5.a(dcx.dV) || $$5.a(dcx.kK)) {
               int $$6 = axw.a($$1, 1, 8);
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

   public static void a(czv $$0, ayd $$1, im.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dcx.oz.n().a(dgk.e, Integer.valueOf(axw.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dcx.oA.n(), 2);
         }

         $$2.c(ir.a);
      }
   }
}
