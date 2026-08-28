import java.util.List;

public class cvm extends cui {
   public cvm(cui.a $$0) {
      super($$0);
   }

   public static cxs h() {
      return new cxs(List.of(cxs.a.a(List.of(dez.bs), 15.0F), cxs.a.b(awo.O, 15.0F), cxs.a.b(awo.a, 5.0F), cxs.a.b(List.of(dez.ff, dez.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cun $$0, dbw $$1, dsa $$2, iz $$3, btn $$4) {
      if (!$$1.B && !$$2.a(awo.aK)) {
         $$0.a(1, $$4, bsz.a);
      }

      return $$2.a(awo.O)
         || $$2.a(dez.bs)
         || $$2.a(dez.bt)
         || $$2.a(dez.bu)
         || $$2.a(dez.bv)
         || $$2.a(dez.sG)
         || $$2.a(dez.ff)
         || $$2.a(dez.fI)
         || $$2.a(awo.a);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dim $$5 && !$$5.o($$3)) {
         cmv $$6 = $$0.o();
         cun $$7 = $$0.n();
         if ($$6 instanceof arf) {
            am.N.a((arf)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avz.lp, awa.e, 1.0F, 1.0F);
         dsa $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dwt.c, $$2, dwt.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btn.d($$0.p()));
         }

         return bqs.a($$1.B);
      }

      return super.a($$0);
   }
}
