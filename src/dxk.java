import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dxk extends dxv<eag> {
   public dxk(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      axr $$1 = $$0.d();
      czs $$2 = $$0.b();
      ib $$3 = $$0.e();
      Optional<dby> $$4 = kr.e.a(avc.aq, $$1).map(il::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cyy var1, axr var2, ib var3, doz var4);

   protected boolean b(cyy $$0, axr $$1, ib $$2, doz $$3) {
      ib $$4 = $$2.c();
      doz $$5 = $$0.a_($$2);
      if (($$5.a(dca.G) || $$5.a(avc.at)) && $$0.a_($$4).a(dca.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kr.e.a(avc.at, $$1).map(il::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dca.mV.n().a(diu.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ih $$6 : ih.c.a) {
            if ($$1.i() < 0.2F) {
               ib $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dca.G)) {
                  kr.e.a(avc.ar, $$1).map(il::a).ifPresent($$3x -> {
                     doz $$4x = $$3x.n();
                     if ($$4x.b(dbj.c)) {
                        $$4x = $$4x.a(dbj.c, $$6);
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
