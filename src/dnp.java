import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dnp extends drz implements dkg {
   public static final MapCodec<dnp> a = b(dnp::new);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dxn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      jh $$4 = $$2.d();
      dxo $$5 = dkf.bA.m();
      Optional<jq.c<enh>> $$6 = $$0.K_().e(mb.aT).a(ss.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dxo $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dkg $$11 = (dkg)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<enh> $$13;
            if ($$1.a(8) == 0) {
               List<egb<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ejg)$$12.get(0).c()).d();
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
   public dkg.a ar_() {
      return dkg.a.a;
   }
}
