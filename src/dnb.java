import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dnb extends dnm<dpx> {
   public dnb(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpx> $$0) {
      aru $$1 = $$0.d();
      cqf $$2 = $$0.b();
      gu $$3 = $$0.e();
      Optional<csl> $$4 = jb.f.b(apl.ap).flatMap($$1x -> $$1x.a($$1)).map(he::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cpm var1, aru var2, gu var3, dez var4);

   protected boolean b(cpm $$0, aru $$1, gu $$2, dez $$3) {
      gu $$4 = $$2.c();
      dez $$5 = $$0.a_($$2);
      if (($$5.a(csm.G) || $$5.a(apl.as)) && $$0.a_($$4).a(csm.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jb.f.b(apl.as).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, csm.mV.n().a(czi.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ha $$6 : ha.c.a) {
            if ($$1.i() < 0.2F) {
               gu $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(csm.G)) {
                  jb.f.b(apl.aq).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$3x -> {
                     dez $$4x = $$3x.n();
                     if ($$4x.b(crx.a)) {
                        $$4x = $$4x.a(crx.a, $$6);
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
