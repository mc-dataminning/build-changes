import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eai extends eat<ede> {
   public eai(Codec<ede> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ede> $$0) {
      azc $$1 = $$0.d();
      dco $$2 = $$0.b();
      iz $$3 = $$0.e();
      Optional<deu> $$4 = lp.e.a(awl.aq, $$1).map(ji::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(dbu var1, azc var2, iz var3, drx var4);

   protected boolean b(dbu $$0, azc $$1, iz $$2, drx $$3) {
      iz $$4 = $$2.c();
      drx $$5 = $$0.a_($$2);
      if (($$5.a(dew.G) || $$5.a(awl.at)) && $$0.a_($$4).a(dew.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lp.e.a(awl.at, $$1).map(ji::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dew.mV.n().a(dlr.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (je $$6 : je.c.a) {
            if ($$1.i() < 0.2F) {
               iz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dew.G)) {
                  lp.e.a(awl.ar, $$1).map(ji::a).ifPresent($$3x -> {
                     drx $$4x = $$3x.n();
                     if ($$4x.b(def.c)) {
                        $$4x = $$4x.a(def.c, $$6);
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
