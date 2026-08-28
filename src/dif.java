import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dif extends dml implements dex {
   public static final MapCodec<dif> a = b(dif::new);

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   public dif(drw.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      iz $$4 = $$2.c();
      drx $$5 = dew.bt.n();
      Optional<ji.c<ehj>> $$6 = $$0.H_().d(lq.aI).b(sy.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iz $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         drx $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dex)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ji<ehj> $$12;
            if ($$1.a(8) == 0) {
               List<eag<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((edk)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.l().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dex.a ar_() {
      return dex.a.a;
   }
}
