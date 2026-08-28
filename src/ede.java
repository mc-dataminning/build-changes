import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ede extends edq<egb> {
   public ede(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      azl $$1 = $$0.d();
      dfd $$2 = $$0.b();
      je $$3 = $$0.e();
      Optional<dhj> $$4 = lu.e.a(awt.ar, $$1).map(jn::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(deh var1, azl var2, je var3, duo var4);

   protected boolean b(deh $$0, azl $$1, je $$2, duo $$3) {
      je $$4 = $$2.d();
      duo $$5 = $$0.a_($$2);
      if (($$5.a(dhl.G) || $$5.a(awt.au)) && $$0.a_($$4).a(dhl.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lu.e.a(awt.au, $$1).map(jn::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dhl.mV.o().b(doh.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jj $$6 : jj.c.a) {
            if ($$1.i() < 0.2F) {
               je $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dhl.G)) {
                  lu.e.a(awt.as, $$1).map(jn::a).ifPresent($$3x -> {
                     duo $$4x = $$3x.o();
                     if ($$4x.b(dgu.c)) {
                        $$4x = $$4x.b(dgu.c, $$6);
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
