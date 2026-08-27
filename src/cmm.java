import java.util.function.Consumer;

public class cmm extends cou {
   public cmm(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      ie $$1 = $$0.k();
      if ($$1 == ie.a) {
         return blu.e;
      } else {
         cvn $$2 = $$0.q();
         crg $$3 = new crg($$0);
         hz $$4 = $$3.a();
         coz $$5 = $$0.n();
         ens $$6 = ens.c($$4);
         enn $$7 = bnu.e.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aov $$8) {
               Consumer<cdi> $$9 = bnu.a($$8, $$5, $$0.o());
               cdi $$10 = bnu.e.b($$8, $$5.w(), $$9, $$4, bok.m, true, true);
               if ($$10 == null) {
                  return blu.e;
               }

               float $$11 = (float)awh.d((awh.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), atk.aA, atl.e, 0.75F, 0.8F);
               $$10.a(dpp.t, $$0.o());
            }

            $$5.h(1);
            return blu.a($$2.B);
         } else {
            return blu.e;
         }
      }
   }
}
