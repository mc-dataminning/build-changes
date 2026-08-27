import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dth extends dts<dwd> {
   public dth(Codec<dwd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      awo $$1 = $$0.d();
      cwi $$2 = $$0.b();
      hz $$3 = $$0.e();
      Optional<cyo> $$4 = kf.e.a(atz.ap, $$1).map(ij::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cvo var1, awo var2, hz var3, dlf var4);

   protected boolean b(cvo $$0, awo $$1, hz $$2, dlf $$3) {
      hz $$4 = $$2.c();
      dlf $$5 = $$0.a_($$2);
      if (($$5.a(cyq.G) || $$5.a(atz.as)) && $$0.a_($$4).a(cyq.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kf.e.a(atz.as, $$1).map(ij::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cyq.mV.o().a(dfk.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ie $$6 : ie.c.a) {
            if ($$1.i() < 0.2F) {
               hz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cyq.G)) {
                  kf.e.a(atz.aq, $$1).map(ij::a).ifPresent($$3x -> {
                     dlf $$4x = $$3x.o();
                     if ($$4x.b(cxz.c)) {
                        $$4x = $$4x.a(cxz.c, $$6);
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
