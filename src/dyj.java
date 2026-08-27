import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dyj extends dyu<ebf> {
   public dyj(Codec<ebf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebf> $$0) {
      ayd $$1 = $$0.d();
      dap $$2 = $$0.b();
      im $$3 = $$0.e();
      Optional<dcv> $$4 = lc.e.a(avo.aq, $$1).map(iv::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(czv var1, ayd var2, im var3, dpy var4);

   protected boolean b(czv $$0, ayd $$1, im $$2, dpy $$3) {
      im $$4 = $$2.c();
      dpy $$5 = $$0.a_($$2);
      if (($$5.a(dcx.G) || $$5.a(avo.at)) && $$0.a_($$4).a(dcx.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lc.e.a(avo.at, $$1).map(iv::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dcx.mV.n().a(djs.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ir $$6 : ir.c.a) {
            if ($$1.i() < 0.2F) {
               im $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dcx.G)) {
                  lc.e.a(avo.ar, $$1).map(iv::a).ifPresent($$3x -> {
                     dpy $$4x = $$3x.n();
                     if ($$4x.b(dcg.c)) {
                        $$4x = $$4x.a(dcg.c, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
