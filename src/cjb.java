import java.util.function.Consumer;

public class cjb extends clj {
   public cjb(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      ib $$1 = $$0.k();
      if ($$1 == ib.a) {
         return bjb.e;
      } else {
         csf $$2 = $$0.q();
         cnw $$3 = new cnw($$0);
         hx $$4 = $$3.a();
         clo $$5 = $$0.n();
         ejz $$6 = ejz.c($$4);
         eju $$7 = bkz.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ami $$8) {
               Consumer<cai> $$9 = bkz.a($$8, $$5, $$0.o());
               cai $$10 = bkz.d.b($$8, $$5.v(), $$9, $$4, blp.m, true, true);
               if ($$10 == null) {
                  return bjb.e;
               }

               float $$11 = (float)atq.d((atq.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.ds(), $$10.du(), $$10.dy(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.ds(), $$10.du(), $$10.dy(), aqv.ao, aqw.e, 0.75F, 0.8F);
               $$10.a(dlx.t, $$0.o());
            }

            $$5.h(1);
            return bjb.a($$2.B);
         } else {
            return bjb.e;
         }
      }
   }
}
