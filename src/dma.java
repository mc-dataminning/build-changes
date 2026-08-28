import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dma extends dqh implements dit {
   public static final MapCodec<dma> a = b(dma::new);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dvu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      jh $$4 = $$2.d();
      dvv $$5 = dis.bt.m();
      Optional<jq.c<elm>> $$6 = $$0.J_().e(ma.aR).a(sr.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dvv $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dit $$11 = (dit)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<elm> $$13;
            if ($$1.a(8) == 0) {
               List<eei<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ehn)$$12.get(0).c()).d();
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
   public dit.a aq_() {
      return dit.a.a;
   }
}
