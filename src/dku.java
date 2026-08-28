import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dku extends dpb implements dhm {
   public static final MapCodec<dku> a = b(dku::new);

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dun.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      je $$4 = $$2.d();
      duo $$5 = dhl.bt.o();
      Optional<jn.c<ekg>> $$6 = $$0.F_().d(lv.aR).b(sl.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         je $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label49;
            }
         }

         duo $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dhm)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.l()) {
            jn<ekg> $$12;
            if ($$1.a(8) == 0) {
               List<edc<?, ?>> $$11 = $$0.t($$8).a().d().b();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((egh)$$11.get(0).c()).d();
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
   public dhm.a ar_() {
      return dhm.a.a;
   }
}
