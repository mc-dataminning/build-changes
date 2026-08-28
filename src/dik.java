import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dik extends dmq implements dfc {
   public static final MapCodec<dik> a = b(dik::new);

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dsb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      iz $$4 = $$2.c();
      dsc $$5 = dfb.bt.o();
      Optional<ji.c<eho>> $$6 = $$0.H_().d(lq.aI).b(sz.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iz $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dsc $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dfc)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ji<eho> $$12;
            if ($$1.a(8) == 0) {
               List<eal<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((edp)$$11.get(0).c()).d();
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
   public dfc.a ap_() {
      return dfc.a.a;
   }
}
