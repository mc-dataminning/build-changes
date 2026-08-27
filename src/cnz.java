import java.util.function.Consumer;

public class cnz extends cqf {
   public cnz(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      ih $$1 = $$0.k();
      if ($$1 == ih.a) {
         return bnc.e;
      } else {
         cwz $$2 = $$0.q();
         css $$3 = new css($$0);
         ib $$4 = $$3.a();
         cqk $$5 = $$0.n();
         epr $$6 = epr.c($$4);
         epm $$7 = bpc.e.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof apf $$8) {
               Consumer<cet> $$9 = bpc.a($$8, $$5, $$0.o());
               cet $$10 = bpc.e.b($$8, $$9, $$4, bps.m, true, true);
               if ($$10 == null) {
                  return bnc.e;
               }

               float $$11 = (float)aww.d((aww.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), aty.aD, atz.e, 0.75F, 0.8F);
               $$10.a(drn.t, $$0.o());
            }

            $$5.h(1);
            return bnc.a($$2.B);
         } else {
            return bnc.e;
         }
      }
   }
}
