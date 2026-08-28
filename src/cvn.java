import java.util.List;

public class cvn extends cuj {
   public cvn(cuj.a $$0) {
      super($$0);
   }

   public static cxt h() {
      return new cxt(List.of(cxt.a.a(List.of(dfa.bs), 15.0F), cxt.a.b(awo.O, 15.0F), cxt.a.b(awo.a, 5.0F), cxt.a.b(List.of(dfa.ff, dfa.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuo $$0, dbx $$1, dsb $$2, iz $$3, bto $$4) {
      if (!$$1.B && !$$2.a(awo.aK)) {
         $$0.a(1, $$4, bta.a);
      }

      return $$2.a(awo.O)
         || $$2.a(dfa.bs)
         || $$2.a(dfa.bt)
         || $$2.a(dfa.bu)
         || $$2.a(dfa.bv)
         || $$2.a(dfa.sG)
         || $$2.a(dfa.ff)
         || $$2.a(dfa.fI)
         || $$2.a(awo.a);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof din $$5 && !$$5.o($$3)) {
         cmw $$6 = $$0.o();
         cuo $$7 = $$0.n();
         if ($$6 instanceof arf) {
            am.N.a((arf)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avz.lp, awa.e, 1.0F, 1.0F);
         dsb $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dwu.c, $$2, dwu.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bto.d($$0.p()));
         }

         return bqt.a($$1.B);
      }

      return super.a($$0);
   }
}
