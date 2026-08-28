import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ejz extends ekm<emy> {
   public ejz(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      azz $$1 = $$0.d();
      dky $$2 = $$0.b();
      iw $$3 = $$0.e();
      Optional<dne> $$4 = mh.e.a(axg.at, $$1).map(jg::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dka var1, azz var2, iw var3, ebg var4);

   protected boolean b(dka $$0, azz $$1, iw $$2, ebg $$3) {
      iw $$4 = $$2.d();
      ebg $$5 = $$0.a_($$2);
      if (($$5.a(dng.J) || $$5.a(axg.aw)) && $$0.a_($$4).a(dng.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mh.e.a(axg.aw, $$1).map(jg::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dng.nB.m().b(duj.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jc $$6 : jc.c.a) {
            if ($$1.i() < 0.2F) {
               iw $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dng.J)) {
                  mh.e.a(axg.au, $$1).map(jg::a).ifPresent($$3x -> {
                     ebg $$4x = $$3x.m();
                     if ($$4x.b(dmp.d)) {
                        $$4x = $$4x.b(dmp.d, $$6);
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
