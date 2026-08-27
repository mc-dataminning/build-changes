import com.mojang.serialization.Codec;

public class dye extends dyu<ebf> {
   public dye(Codec<ebf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebf> $$0) {
      im $$1 = $$0.e();
      dap $$2 = $$0.b();
      ayd $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dcx.G) && !$$2.a_($$1.d()).a(dcx.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ir $$5 : ir.values()) {
            if ($$5 != ir.a && $$2.a_($$1.a($$5)).a(dcx.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dcx.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  im $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dpy $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dcx.G) || $$10.a(dcx.iC) || $$10.a(dcx.dO)) {
                     for (ir $$11 : ir.values()) {
                        dpy $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dcx.mW)) {
                           $$2.a($$9, dcx.mW.n(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
