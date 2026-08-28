import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dli extends dpp implements dib {
   public static final MapCodec<dli> a = b(dli::new);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dvc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      jg $$4 = $$2.d();
      dvd $$5 = dia.bt.m();
      Optional<jp.c<ekv>> $$6 = $$0.H_().e(ly.aR).a(sp.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jg $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dvd $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dib $$11 = (dib)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jp<ekv> $$13;
            if ($$1.a(8) == 0) {
               List<edr<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((egw)$$12.get(0).c()).d();
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
   public dib.a as_() {
      return dib.a.a;
   }
}
