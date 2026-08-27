import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dvh extends dvs<dyd> {
   public dvh(Codec<dyd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyd> $$0) {
      axd $$1 = $$0.d();
      cxw $$2 = $$0.b();
      ib $$3 = $$0.e();
      Optional<dac> $$4 = ki.e.a(aun.aq, $$1).map(il::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cxc var1, axd var2, ib var3, dnb var4);

   protected boolean b(cxc $$0, axd $$1, ib $$2, dnb $$3) {
      ib $$4 = $$2.c();
      dnb $$5 = $$0.a_($$2);
      if (($$5.a(dae.G) || $$5.a(aun.at)) && $$0.a_($$4).a(dae.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ki.e.a(aun.at, $$1).map(il::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dae.mV.o().a(dgy.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ih $$6 : ih.c.a) {
            if ($$1.i() < 0.2F) {
               ib $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dae.G)) {
                  ki.e.a(aun.ar, $$1).map(il::a).ifPresent($$3x -> {
                     dnb $$4x = $$3x.o();
                     if ($$4x.b(czn.c)) {
                        $$4x = $$4x.a(czn.c, $$6);
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
