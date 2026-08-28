import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eal extends eaw<edh> {
   public eal(Codec<edh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edh> $$0) {
      azf $$1 = $$0.d();
      dcr $$2 = $$0.b();
      iz $$3 = $$0.e();
      Optional<dex> $$4 = lp.e.a(awo.aq, $$1).map(ji::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dbx var1, azf var2, iz var3, dsa var4);

   protected boolean b(dbx $$0, azf $$1, iz $$2, dsa $$3) {
      iz $$4 = $$2.c();
      dsa $$5 = $$0.a_($$2);
      if (($$5.a(dez.G) || $$5.a(awo.at)) && $$0.a_($$4).a(dez.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lp.e.a(awo.at, $$1).map(ji::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dez.mV.o().a(dlu.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (je $$6 : je.c.a) {
            if ($$1.i() < 0.2F) {
               iz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dez.G)) {
                  lp.e.a(awo.ar, $$1).map(ji::a).ifPresent($$3x -> {
                     dsa $$4x = $$3x.o();
                     if ($$4x.b(dei.c)) {
                        $$4x = $$4x.a(dei.c, $$6);
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
