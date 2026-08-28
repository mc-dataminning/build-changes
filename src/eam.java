import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eam extends eax<edi> {
   public eam(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edi> $$0) {
      azg $$1 = $$0.d();
      dcs $$2 = $$0.b();
      iz $$3 = $$0.e();
      Optional<dey> $$4 = lp.e.a(awo.aq, $$1).map(ji::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dby var1, azg var2, iz var3, dsb var4);

   protected boolean b(dby $$0, azg $$1, iz $$2, dsb $$3) {
      iz $$4 = $$2.c();
      dsb $$5 = $$0.a_($$2);
      if (($$5.a(dfa.G) || $$5.a(awo.at)) && $$0.a_($$4).a(dfa.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lp.e.a(awo.at, $$1).map(ji::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfa.mV.o().a(dlv.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (je $$6 : je.c.a) {
            if ($$1.i() < 0.2F) {
               iz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfa.G)) {
                  lp.e.a(awo.ar, $$1).map(ji::a).ifPresent($$3x -> {
                     dsb $$4x = $$3x.o();
                     if ($$4x.b(dej.c)) {
                        $$4x = $$4x.a(dej.c, $$6);
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
