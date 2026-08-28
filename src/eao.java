import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eao extends eaz<edk> {
   public eao(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edk> $$0) {
      azh $$1 = $$0.d();
      dcu $$2 = $$0.b();
      iz $$3 = $$0.e();
      Optional<dfa> $$4 = lp.e.a(awp.aq, $$1).map(ji::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dca var1, azh var2, iz var3, dsd var4);

   protected boolean b(dca $$0, azh $$1, iz $$2, dsd $$3) {
      iz $$4 = $$2.c();
      dsd $$5 = $$0.a_($$2);
      if (($$5.a(dfc.G) || $$5.a(awp.at)) && $$0.a_($$4).a(dfc.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lp.e.a(awp.at, $$1).map(ji::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfc.mV.o().a(dlx.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (je $$6 : je.c.a) {
            if ($$1.i() < 0.2F) {
               iz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfc.G)) {
                  lp.e.a(awp.ar, $$1).map(ji::a).ifPresent($$3x -> {
                     dsd $$4x = $$3x.o();
                     if ($$4x.b(del.c)) {
                        $$4x = $$4x.a(del.c, $$6);
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
