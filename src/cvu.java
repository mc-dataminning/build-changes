import java.util.List;
import java.util.Optional;

public class cvu extends dad implements cso {
   public cvu(dez.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      gu $$4 = $$2.c();
      dfa $$5 = csn.bt.n();
      Optional<he.c<dud>> $$6 = $$0.B_().d(jc.ay).b(pd.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         gu $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dfa $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((cso)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            he<dud> $$12;
            if ($$1.a(8) == 0) {
               List<dna<?, ?>> $$11 = $$0.s($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dqe)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.k().g(), $$1, $$8);
         }
      }
   }
}
