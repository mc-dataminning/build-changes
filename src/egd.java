import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class egd extends egp<eja> {
   public egd(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eja> $$0) {
      bac $$1 = $$0.d();
      dhx $$2 = $$0.b();
      jh $$3 = $$0.e();
      Optional<dkd> $$4 = ma.e.a(axk.at, $$1).map(jq::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dha var1, bac var2, jh var3, dxo var4);

   protected boolean b(dha $$0, bac $$1, jh $$2, dxo $$3) {
      jh $$4 = $$2.d();
      dxo $$5 = $$0.a_($$2);
      if (($$5.a(dkf.J) || $$5.a(axk.aw)) && $$0.a_($$4).a(dkf.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ma.e.a(axk.aw, $$1).map(jq::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dkf.nx.m().b(drf.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jm $$6 : jm.c.a) {
            if ($$1.i() < 0.2F) {
               jh $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dkf.J)) {
                  ma.e.a(axk.au, $$1).map(jq::a).ifPresent($$3x -> {
                     dxo $$4x = $$3x.m();
                     if ($$4x.b(djo.c)) {
                        $$4x = $$4x.b(djo.c, $$6);
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
