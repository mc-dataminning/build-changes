import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dkx extends dpe implements dhp {
   public static final MapCodec<dkx> a = b(dkx::new);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dur.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      jf $$4 = $$2.d();
      dus $$5 = dho.bt.n();
      Optional<jo.c<ekk>> $$6 = $$0.G_().e(lw.aS).a(sm.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jf $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label49;
            }
         }

         dus $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dhp)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.l()) {
            jo<ekk> $$12;
            if ($$1.a(8) == 0) {
               List<edg<?, ?>> $$11 = $$0.t($$8).a().d().b();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((egl)$$11.get(0).c()).d();
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
   public dhp.a as_() {
      return dhp.a.a;
   }
}
