import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class egk extends egw<ejh> {
   public egk(Codec<ejh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejh> $$0) {
      bam $$1 = $$0.d();
      dig $$2 = $$0.b();
      jh $$3 = $$0.e();
      Optional<dkm> $$4 = ma.e.a(axu.at, $$1).map(jq::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dhj var1, bam var2, jh var3, dxv var4);

   protected boolean b(dhj $$0, bam $$1, jh $$2, dxv $$3) {
      jh $$4 = $$2.d();
      dxv $$5 = $$0.a_($$2);
      if (($$5.a(dko.J) || $$5.a(axu.aw)) && $$0.a_($$4).a(dko.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ma.e.a(axu.aw, $$1).map(jq::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dko.nq.m().b(drm.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jm $$6 : jm.c.a) {
            if ($$1.i() < 0.2F) {
               jh $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dko.J)) {
                  ma.e.a(axu.au, $$1).map(jq::a).ifPresent($$3x -> {
                     dxv $$4x = $$3x.m();
                     if ($$4x.b(djx.c)) {
                        $$4x = $$4x.b(djx.c, $$6);
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
