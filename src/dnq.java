import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dnq extends dry implements dkh {
   public static final MapCodec<dnq> a = b(dnq::new);

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dxm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      jh $$4 = $$2.d();
      dxn $$5 = dkg.bA.m();
      Optional<jq.c<eng>> $$6 = $$0.K_().e(mb.aS).a(td.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dxn $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dkh $$11 = (dkh)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<eng> $$13;
            if ($$1.a(8) == 0) {
               List<ega<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ejf)$$12.get(0).c()).d();
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
   public dkh.a ar_() {
      return dkh.a.a;
   }
}
