import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dil extends dmr implements dfd {
   public static final MapCodec<dil> a = b(dil::new);

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dsc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      iz $$4 = $$2.c();
      dsd $$5 = dfc.bt.o();
      Optional<ji.c<ehp>> $$6 = $$0.H_().d(lq.aI).b(sz.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iz $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dsd $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dfd)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ji<ehp> $$12;
            if ($$1.a(8) == 0) {
               List<eam<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((edq)$$11.get(0).c()).d();
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
   public dfd.a ap_() {
      return dfd.a.a;
   }
}
