import java.util.function.Consumer;

public class ciw extends cle {
   public ciw(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      hx $$1 = $$0.k();
      if ($$1 == hx.a) {
         return bix.e;
      } else {
         csa $$2 = $$0.q();
         cnr $$3 = new cnr($$0);
         ht $$4 = $$3.a();
         clj $$5 = $$0.n();
         eju $$6 = eju.c($$4);
         ejp $$7 = bku.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ame $$8) {
               Consumer<cad> $$9 = bku.a($$8, $$5, $$0.o());
               cad $$10 = bku.d.b($$8, $$5.v(), $$9, $$4, blk.m, true, true);
               if ($$10 == null) {
                  return bix.e;
               }

               float $$11 = (float)atm.d((atm.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.ds(), $$10.du(), $$10.dy(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.ds(), $$10.du(), $$10.dy(), aqr.ao, aqs.e, 0.75F, 0.8F);
               $$10.a(dls.t, $$0.o());
            }

            $$5.h(1);
            return bix.a($$2.B);
         } else {
            return bix.e;
         }
      }
   }
}
