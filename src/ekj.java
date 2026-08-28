import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ekj extends ekw<eni> {
   public ekj(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      bai $$1 = $$0.d();
      dli $$2 = $$0.b();
      iw $$3 = $$0.e();
      Optional<dno> $$4 = mh.e.a(axn.at, $$1).map(jg::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dkk var1, bai var2, iw var3, ebq var4);

   protected boolean b(dkk $$0, bai $$1, iw $$2, ebq $$3) {
      iw $$4 = $$2.d();
      ebq $$5 = $$0.a_($$2);
      if (($$5.a(dnq.J) || $$5.a(axn.aw)) && $$0.a_($$4).a(dnq.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mh.e.a(axn.aw, $$1).map(jg::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dnq.nB.m().b(dut.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jc $$6 : jc.c.a) {
            if ($$1.i() < 0.2F) {
               iw $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dnq.J)) {
                  mh.e.a(axn.au, $$1).map(jg::a).ifPresent($$3x -> {
                     ebq $$4x = $$3x.m();
                     if ($$4x.b(dmz.d)) {
                        $$4x = $$4x.b(dmz.d, $$6);
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
