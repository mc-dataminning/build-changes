import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dpo extends dtz implements dmd {
   public static final MapCodec<dpo> a = b(dpo::new);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(dzy.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      iu $$4 = $$2.d();
      dzz $$5 = dmc.bA.m();
      Optional<je.c<epx>> $$6 = $$0.F_().f(mg.ba).a(rz.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iu $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dzz $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dmd $$11 = (dmd)$$5.b();
            if ($$11.a($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            je<epx> $$14;
            if ($$1.a(8) == 0) {
               List<eiq<?, ?>> $$12 = $$0.u($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((elv)$$12.get($$13).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$14 = $$6.get();
            }

            $$14.a().a($$0, $$0.m().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dmd.a am_() {
      return dmd.a.a;
   }
}
