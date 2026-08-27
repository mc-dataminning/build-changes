import com.mojang.serialization.Codec;

public class dzb extends dyu<ebf> {
   public dzb(Codec<ebf> $$0) {
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
         if (!$$4.a(dcx.dV) && !$$4.a(dcx.dY) && !$$4.a(dcx.pr)) {
            return false;
         } else {
            $$1.a($$2, dcx.ec.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               im $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ir $$8 : ir.values()) {
                     if ($$1.a_($$6.a($$8)).a(dcx.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dcx.ec.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
