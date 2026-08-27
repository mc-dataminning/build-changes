import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ebo extends eca<eer> {
   public ebo(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ayt $$1 = $$0.d();
      dcv $$2 = $$0.b();
      ir $$3 = $$0.e();
      Optional<dfc> $$4 = lh.e.a(awe.ar, $$1).map(ja::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(dcb var1, ayt var2, ir var3, dtc var4);

   protected boolean b(dcb $$0, ayt $$1, ir $$2, dtc $$3) {
      ir $$4 = $$2.c();
      dtc $$5 = $$0.a_($$2);
      if (($$5.a(dfe.al) || $$5.a(awe.au)) && $$0.a_($$4).a(dfe.al)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lh.e.a(awe.au, $$1).map(ja::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfe.nT.n().a(dmn.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (iw $$6 : iw.c.a) {
            if ($$1.i() < 0.2F) {
               ir $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfe.al)) {
                  lh.e.a(awe.as, $$1).map(ja::a).ifPresent($$3x -> {
                     dtc $$4x = $$3x.n();
                     if ($$4x.b(dem.c)) {
                        $$4x = $$4x.a(dem.c, $$6);
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
