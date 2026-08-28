import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dqb extends dun implements dmp {
   public static final MapCodec<dqb> a = b(dqb::new);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(ean.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      iv $$4 = $$2.d();
      eao $$5 = dmo.bA.m();
      Optional<jf.c<eqm>> $$6 = $$0.F_().f(mh.bb).a(rz.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iv $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         eao $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dmp $$11 = (dmp)$$5.b();
            if ($$11.a((djk)$$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jf<eqm> $$14;
            if ($$1.a(8) == 0) {
               List<ejf<?, ?>> $$12 = $$0.u($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((emk)$$12.get($$13).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$14 = $$6.get();
            }

            $$14.a().a($$0, $$0.m().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dmp.a an_() {
      return dmp.a.a;
   }
}
