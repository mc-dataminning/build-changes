import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dnr extends dsb implements dkh {
   public static final MapCodec<dnr> a = b(dnr::new);

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(dxp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      ji $$4 = $$2.d();
      dxq $$5 = dkg.bA.m();
      Optional<jr.c<enn>> $$6 = $$0.F_().e(mc.aV).a(rw.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ji $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dxq $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dkh $$11 = (dkh)$$5.b();
            if ($$11.a($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jr<enn> $$13;
            if ($$1.a(8) == 0) {
               List<egg<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ejl)$$12.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$13 = $$6.get();
            }

            $$13.a().a($$0, $$0.m().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dkh.a aq_() {
      return dkh.a.a;
   }
}
