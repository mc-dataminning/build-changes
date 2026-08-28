import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class edi extends edu<egf> {
   public edi(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      azn $$1 = $$0.d();
      dfg $$2 = $$0.b();
      jf $$3 = $$0.e();
      Optional<dhm> $$4 = lv.e.a(awv.ar, $$1).map(jo::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(dek var1, azn var2, jf var3, dus var4);

   protected boolean b(dek $$0, azn $$1, jf $$2, dus $$3) {
      jf $$4 = $$2.d();
      dus $$5 = $$0.a_($$2);
      if (($$5.a(dho.G) || $$5.a(awv.au)) && $$0.a_($$4).a(dho.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lv.e.a(awv.au, $$1).map(jo::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dho.mV.n().b(dok.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jk $$6 : jk.c.a) {
            if ($$1.i() < 0.2F) {
               jf $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dho.G)) {
                  lv.e.a(awv.as, $$1).map(jo::a).ifPresent($$3x -> {
                     dus $$4x = $$3x.n();
                     if ($$4x.b(dgx.c)) {
                        $$4x = $$4x.b(dgx.c, $$6);
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
