import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eap extends eba<edl> {
   public eap(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edl> $$0) {
      azh $$1 = $$0.d();
      dcv $$2 = $$0.b();
      iz $$3 = $$0.e();
      Optional<dfb> $$4 = lp.e.a(awp.aq, $$1).map(ji::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dcb var1, azh var2, iz var3, dse var4);

   protected boolean b(dcb $$0, azh $$1, iz $$2, dse $$3) {
      iz $$4 = $$2.c();
      dse $$5 = $$0.a_($$2);
      if (($$5.a(dfd.G) || $$5.a(awp.at)) && $$0.a_($$4).a(dfd.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lp.e.a(awp.at, $$1).map(ji::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfd.mV.o().a(dly.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (je $$6 : je.c.a) {
            if ($$1.i() < 0.2F) {
               iz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfd.G)) {
                  lp.e.a(awp.ar, $$1).map(ji::a).ifPresent($$3x -> {
                     dse $$4x = $$3x.o();
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
