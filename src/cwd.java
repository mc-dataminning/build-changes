import java.util.List;
import java.util.Optional;

public class cwd extends dam implements csx {
   public cwd(dfi.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      gw $$4 = $$2.c();
      dfj $$5 = csw.bt.n();
      Optional<hg.c<dum>> $$6 = $$0.G_().d(je.ay).b(pj.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         gw $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dfj $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((csx)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            hg<dum> $$12;
            if ($$1.a(8) == 0) {
               List<dnj<?, ?>> $$11 = $$0.s($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dqn)$$11.get(0).c()).d();
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
