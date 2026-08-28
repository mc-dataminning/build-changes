import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class egj extends egv<ejg> {
   public egj(Codec<ejg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejg> $$0) {
      bam $$1 = $$0.d();
      dif $$2 = $$0.b();
      jh $$3 = $$0.e();
      Optional<dkl> $$4 = ma.e.a(axu.at, $$1).map(jq::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dhi var1, bam var2, jh var3, dxu var4);

   protected boolean b(dhi $$0, bam $$1, jh $$2, dxu $$3) {
      jh $$4 = $$2.d();
      dxu $$5 = $$0.a_($$2);
      if (($$5.a(dkn.J) || $$5.a(axu.aw)) && $$0.a_($$4).a(dkn.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ma.e.a(axu.aw, $$1).map(jq::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dkn.nq.m().b(drl.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jm $$6 : jm.c.a) {
            if ($$1.i() < 0.2F) {
               jh $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dkn.J)) {
                  ma.e.a(axu.au, $$1).map(jq::a).ifPresent($$3x -> {
                     dxu $$4x = $$3x.m();
                     if ($$4x.b(djw.c)) {
                        $$4x = $$4x.b(djw.c, $$6);
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
