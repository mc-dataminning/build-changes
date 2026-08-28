import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dpu extends dug implements dmi {
   public static final MapCodec<dpu> a = b(dpu::new);

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(eag.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      iu $$4 = $$2.d();
      eah $$5 = dmh.bA.m();
      Optional<je.c<eqf>> $$6 = $$0.F_().f(mg.bb).a(rz.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iu $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         eah $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dmi $$11 = (dmi)$$5.b();
            if ($$11.a((djd)$$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            je<eqf> $$14;
            if ($$1.a(8) == 0) {
               List<eiy<?, ?>> $$12 = $$0.u($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((emd)$$12.get($$13).c()).d();
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
   public dmi.a an_() {
      return dmi.a.a;
   }
}
