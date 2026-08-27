import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dvf extends dvq<dyb> {
   public dvf(Codec<dyb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      axd $$1 = $$0.d();
      cxu $$2 = $$0.b();
      ib $$3 = $$0.e();
      Optional<daa> $$4 = ki.e.a(aun.aq, $$1).map(il::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cxa var1, axd var2, ib var3, dmz var4);

   protected boolean b(cxa $$0, axd $$1, ib $$2, dmz $$3) {
      ib $$4 = $$2.c();
      dmz $$5 = $$0.a_($$2);
      if (($$5.a(dac.G) || $$5.a(aun.at)) && $$0.a_($$4).a(dac.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ki.e.a(aun.at, $$1).map(il::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dac.mV.o().a(dgw.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ih $$6 : ih.c.a) {
            if ($$1.i() < 0.2F) {
               ib $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dac.G)) {
                  ki.e.a(aun.ar, $$1).map(il::a).ifPresent($$3x -> {
                     dmz $$4x = $$3x.o();
                     if ($$4x.b(czl.c)) {
                        $$4x = $$4x.a(czl.c, $$6);
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
