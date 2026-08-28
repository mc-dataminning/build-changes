import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eed extends eep<eha> {
   public eed(Codec<eha> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<eha> $$0) {
      azv $$1 = $$0.d();
      dgd $$2 = $$0.b();
      jh $$3 = $$0.e();
      Optional<dij> $$4 = lz.e.a(axd.as, $$1).map(jq::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dfg var1, azv var2, jh var3, dvo var4);

   protected boolean b(dfg $$0, azv $$1, jh $$2, dvo $$3) {
      jh $$4 = $$2.d();
      dvo $$5 = $$0.a_($$2);
      if (($$5.a(dil.G) || $$5.a(axd.av)) && $$0.a_($$4).a(dil.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lz.e.a(axd.av, $$1).map(jq::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dil.mV.m().b(dpg.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jm $$6 : jm.c.a) {
            if ($$1.i() < 0.2F) {
               jh $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dil.G)) {
                  lz.e.a(axd.at, $$1).map(jq::a).ifPresent($$3x -> {
                     dvo $$4x = $$3x.m();
                     if ($$4x.b(dhu.c)) {
                        $$4x = $$4x.b(dhu.c, $$6);
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
