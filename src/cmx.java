import java.util.Map;

public class cmx extends bwx<cmr> {
   public cmx() {
      super(Map.of(cei.o, cej.a, cei.m, cej.b, cei.aU, cej.b, cei.aV, cej.b));
   }

   protected boolean a(arq $$0, cmr $$1) {
      return $$1.aL() && !$$1.bl() && $$1.ay() == bvq.a;
   }

   protected void a(arq $$0, cmr $$1, long $$2) {
      bve $$3 = $$1.ee().c(cei.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dw());
         ezr $$5 = null;
         if ($$4) {
            ezr $$6 = cfz.a($$1, 5, 5, $$3.dw());
            if ($$6 != null && cmt.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.eb().h() ? cmt.a($$3, $$1.eb()) : a($$1, $$3);
         }

         $$1.ee().a(cei.m, new cel(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static ezr a(cmr $$0, bve $$1) {
      ezr $$2 = $$1.dw().d($$0.dw());
      double $$3 = $$2.g() - azn.d($$0.eb().j(), 8.0, 4.0);
      ezr $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dw().e($$4);
   }
}
