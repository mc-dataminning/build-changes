import java.util.function.Consumer;

public class cgy extends cjg {
   public cgy(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      ha $$1 = $$0.k();
      if ($$1 == ha.a) {
         return bhe.e;
      } else {
         cqb $$2 = $$0.q();
         clt $$3 = new clt($$0);
         gw $$4 = $$3.a();
         cjl $$5 = $$0.n();
         ehh $$6 = ehh.c($$4);
         ehc $$7 = bja.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof akt $$8) {
               Consumer<byj> $$9 = bja.a($$8, $$5, $$0.o());
               byj $$10 = bja.d.b($$8, $$5.v(), $$9, $$4, bjq.m, true, true);
               if ($$10 == null) {
                  return bhe.e;
               }

               float $$11 = (float)asb.d((asb.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dq(), $$10.ds(), $$10.dw(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dq(), $$10.ds(), $$10.dw(), apg.ao, aph.e, 0.75F, 0.8F);
               $$10.a(djn.t, $$0.o());
            }

            $$5.h(1);
            return bhe.a($$2.B);
         } else {
            return bhe.e;
         }
      }
   }
}
