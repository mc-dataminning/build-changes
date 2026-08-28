import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eaz extends ebk<edv> {
   public eaz(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edv> $$0) {
      ayo $$1 = $$0.d();
      ddb $$2 = $$0.b();
      ja $$3 = $$0.e();
      Optional<dfh> $$4 = lq.e.a(avw.aq, $$1).map(jj::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dcg var1, ayo var2, ja var3, dsk var4);

   protected boolean b(dcg $$0, ayo $$1, ja $$2, dsk $$3) {
      ja $$4 = $$2.c();
      dsk $$5 = $$0.a_($$2);
      if (($$5.a(dfj.G) || $$5.a(avw.at)) && $$0.a_($$4).a(dfj.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lq.e.a(avw.at, $$1).map(jj::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfj.mV.o().a(dme.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jf $$6 : jf.c.a) {
            if ($$1.i() < 0.2F) {
               ja $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfj.G)) {
                  lq.e.a(avw.ar, $$1).map(jj::a).ifPresent($$3x -> {
                     dsk $$4x = $$3x.o();
                     if ($$4x.b(des.c)) {
                        $$4x = $$4x.a(des.c, $$6);
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
