import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dqg extends dus implements dmu {
   public static final MapCodec<dqg> a = b(dqg::new);

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   public dqg(eas.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      iv $$4 = $$2.d();
      eat $$5 = dmt.bA.m();
      Optional<jf.c<eqr>> $$6 = $$0.F_().f(mh.bb).a(rz.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iv $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         eat $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dmu $$11 = (dmu)$$5.b();
            if ($$11.a((djp)$$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jf<eqr> $$14;
            if ($$1.a(8) == 0) {
               List<ejk<?, ?>> $$12 = $$0.u($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((emp)$$12.get($$13).c()).d();
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
   public dmu.a an_() {
      return dmu.a.a;
   }
}
