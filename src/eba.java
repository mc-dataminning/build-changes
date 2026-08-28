import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eba extends ebl<edw> {
   public eba(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ayo $$1 = $$0.d();
      ddc $$2 = $$0.b();
      ja $$3 = $$0.e();
      Optional<dfi> $$4 = lq.e.a(avw.aq, $$1).map(jj::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dch var1, ayo var2, ja var3, dsl var4);

   protected boolean b(dch $$0, ayo $$1, ja $$2, dsl $$3) {
      ja $$4 = $$2.c();
      dsl $$5 = $$0.a_($$2);
      if (($$5.a(dfk.G) || $$5.a(avw.at)) && $$0.a_($$4).a(dfk.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lq.e.a(avw.at, $$1).map(jj::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfk.mV.o().a(dmf.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jf $$6 : jf.c.a) {
            if ($$1.i() < 0.2F) {
               ja $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfk.G)) {
                  lq.e.a(avw.ar, $$1).map(jj::a).ifPresent($$3x -> {
                     dsl $$4x = $$3x.o();
                     if ($$4x.b(det.c)) {
                        $$4x = $$4x.a(det.c, $$6);
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
