import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dim extends dms implements dfe {
   public static final MapCodec<dim> a = b(dim::new);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dsd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      iz $$4 = $$2.c();
      dse $$5 = dfd.bt.o();
      Optional<ji.c<ehq>> $$6 = $$0.H_().d(lq.aI).b(sz.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iz $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dse $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dfe)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ji<ehq> $$12;
            if ($$1.a(8) == 0) {
               List<ean<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((edr)$$11.get(0).c()).d();
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
   public dfe.a ap_() {
      return dfe.a.a;
   }
}
