import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dny extends dsg implements dkp {
   public static final MapCodec<dny> a = b(dny::new);

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dxu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      jh $$4 = $$2.d();
      dxv $$5 = dko.bA.m();
      Optional<jq.c<eno>> $$6 = $$0.K_().e(mb.aT).a(td.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dxv $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dkp $$11 = (dkp)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<eno> $$13;
            if ($$1.a(8) == 0) {
               List<egi<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ejn)$$12.get(0).c()).d();
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
   public dkp.a ar_() {
      return dkp.a.a;
   }
}
