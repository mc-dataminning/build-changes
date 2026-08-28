import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ecq extends edc<efn> {
   public ecq(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      azk $$1 = $$0.d();
      dep $$2 = $$0.b();
      je $$3 = $$0.e();
      Optional<dgv> $$4 = lu.e.a(aws.ar, $$1).map(jn::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(ddt var1, azk var2, je var3, dua var4);

   protected boolean b(ddt $$0, azk $$1, je $$2, dua $$3) {
      je $$4 = $$2.d();
      dua $$5 = $$0.a_($$2);
      if (($$5.a(dgx.G) || $$5.a(aws.au)) && $$0.a_($$4).a(dgx.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lu.e.a(aws.au, $$1).map(jn::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dgx.mV.o().b(dnt.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jj $$6 : jj.c.a) {
            if ($$1.i() < 0.2F) {
               je $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dgx.G)) {
                  lu.e.a(aws.as, $$1).map(jn::a).ifPresent($$3x -> {
                     dua $$4x = $$3x.o();
                     if ($$4x.b(dgg.c)) {
                        $$4x = $$4x.b(dgg.c, $$6);
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
