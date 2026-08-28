import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dlo extends dpv implements dih {
   public static final MapCodec<dlo> a = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dvi.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      jh $$4 = $$2.d();
      dvj $$5 = dig.bt.m();
      Optional<jq.c<elb>> $$6 = $$0.H_().e(lz.aR).a(sq.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dvj $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dih $$11 = (dih)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<elb> $$13;
            if ($$1.a(8) == 0) {
               List<edx<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ehc)$$12.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$13 = $$6.get();
            }

            $$13.a().a($$0, $$0.l().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dih.a ar_() {
      return dih.a.a;
   }
}
