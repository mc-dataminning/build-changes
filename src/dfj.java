import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dfj extends djo implements dcb {
   public static final MapCodec<dfj> a = b(dfj::new);

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   public dfj(doy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      ib $$4 = $$2.c();
      doz $$5 = dca.bt.n();
      Optional<il.c<eel>> $$6 = $$0.H_().d(ks.aE).b(rt.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ib $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         doz $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dcb)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            il<eel> $$12;
            if ($$1.a(8) == 0) {
               List<dxi<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eam)$$11.get(0).c()).d();
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
   public dcb.a ar_() {
      return dcb.a.a;
   }
}
