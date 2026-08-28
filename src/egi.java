import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class egi extends egu<ejf> {
   public egi(Codec<ejf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejf> $$0) {
      azh $$1 = $$0.d();
      dhy $$2 = $$0.b();
      ji $$3 = $$0.e();
      Optional<dke> $$4 = mb.e.a(awp.at, $$1).map(jr::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dha var1, azh var2, ji var3, dxq var4);

   protected boolean b(dha $$0, azh $$1, ji $$2, dxq $$3) {
      ji $$4 = $$2.d();
      dxq $$5 = $$0.a_($$2);
      if (($$5.a(dkg.J) || $$5.a(awp.aw)) && $$0.a_($$4).a(dkg.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mb.e.a(awp.aw, $$1).map(jr::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dkg.nx.m().b(drg.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jn $$6 : jn.c.a) {
            if ($$1.i() < 0.2F) {
               ji $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dkg.J)) {
                  mb.e.a(awp.au, $$1).map(jr::a).ifPresent($$3x -> {
                     dxq $$4x = $$3x.m();
                     if ($$4x.b(djp.d)) {
                        $$4x = $$4x.b(djp.d, $$6);
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
