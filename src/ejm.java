import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ejm extends ejy<emj> {
   public ejm(Codec<emj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emj> $$0) {
      azv $$1 = $$0.d();
      dkl $$2 = $$0.b();
      iv $$3 = $$0.e();
      Optional<dmr> $$4 = mg.e.a(axc.at, $$1).map(jf::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(djn var1, azv var2, iv var3, eat var4);

   protected boolean b(djn $$0, azv $$1, iv $$2, eat $$3) {
      iv $$4 = $$2.d();
      eat $$5 = $$0.a_($$2);
      if (($$5.a(dmt.J) || $$5.a(axc.aw)) && $$0.a_($$4).a(dmt.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mg.e.a(axc.aw, $$1).map(jf::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dmt.nB.m().b(dtw.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jb $$6 : jb.c.a) {
            if ($$1.i() < 0.2F) {
               iv $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dmt.J)) {
                  mg.e.a(axc.au, $$1).map(jf::a).ifPresent($$3x -> {
                     eat $$4x = $$3x.m();
                     if ($$4x.b(dmc.d)) {
                        $$4x = $$4x.b(dmc.d, $$6);
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
