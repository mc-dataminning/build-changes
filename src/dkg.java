import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dkg extends don implements dgy {
   public static final MapCodec<dkg> a = b(dkg::new);

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dtz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      je $$4 = $$2.d();
      dua $$5 = dgx.bt.o();
      Optional<jn.c<ejs>> $$6 = $$0.F_().d(lv.aQ).b(sl.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         je $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label49;
            }
         }

         dua $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dgy)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.l()) {
            jn<ejs> $$12;
            if ($$1.a(8) == 0) {
               List<eco<?, ?>> $$11 = $$0.t($$8).a().d().b();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eft)$$11.get(0).c()).d();
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
   public dgy.a at_() {
      return dgy.a.a;
   }
}
