import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dnx extends dsf implements dko {
   public static final MapCodec<dnx> a = b(dnx::new);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dxt.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      jh $$4 = $$2.d();
      dxu $$5 = dkn.bA.m();
      Optional<jq.c<enn>> $$6 = $$0.K_().e(mb.aT).a(td.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dxu $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dko $$11 = (dko)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<enn> $$13;
            if ($$1.a(8) == 0) {
               List<egh<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ejm)$$12.get(0).c()).d();
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
   public dko.a ar_() {
      return dko.a.a;
   }
}
