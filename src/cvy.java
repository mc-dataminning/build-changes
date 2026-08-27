import java.util.List;
import java.util.Optional;

public class cvy extends dah implements css {
   public cvy(dfd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      gw $$4 = $$2.c();
      dfe $$5 = csr.bt.n();
      Optional<hg.c<duh>> $$6 = $$0.B_().d(je.ay).b(pg.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         gw $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dfe $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((css)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            hg<duh> $$12;
            if ($$1.a(8) == 0) {
               List<dne<?, ?>> $$11 = $$0.s($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dqi)$$11.get(0).c()).d();
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
