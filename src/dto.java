import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dto extends dtz<dwk> {
   public dto(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      awp $$1 = $$0.d();
      cwm $$2 = $$0.b();
      hz $$3 = $$0.e();
      Optional<cys> $$4 = kf.e.a(aua.ap, $$1).map(ij::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cvs var1, awp var2, hz var3, dlj var4);

   protected boolean b(cvs $$0, awp $$1, hz $$2, dlj $$3) {
      hz $$4 = $$2.c();
      dlj $$5 = $$0.a_($$2);
      if (($$5.a(cyu.G) || $$5.a(aua.as)) && $$0.a_($$4).a(cyu.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kf.e.a(aua.as, $$1).map(ij::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cyu.mV.o().a(dfo.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ie $$6 : ie.c.a) {
            if ($$1.i() < 0.2F) {
               hz $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cyu.G)) {
                  kf.e.a(aua.aq, $$1).map(ij::a).ifPresent($$3x -> {
                     dlj $$4x = $$3x.o();
                     if ($$4x.b(cyd.c)) {
                        $$4x = $$4x.a(cyd.c, $$6);
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
