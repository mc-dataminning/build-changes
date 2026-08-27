import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class cye extends dcj implements cuw {
   public static final MapCodec<cye> a = b(cye::new);

   @Override
   public MapCodec<cye> a() {
      return a;
   }

   public cye(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      ht $$4 = $$2.c();
      dgw $$5 = cuv.bt.o();
      Optional<ib.c<dvz>> $$6 = $$0.H_().d(jz.aA).b(ql.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ht $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dgw $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((cuw)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ib<dvz> $$12;
            if ($$1.a(8) == 0) {
               List<dow<?, ?>> $$11 = $$0.s($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dsa)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.k().g(), $$1, $$8);
         }
      }
   }
}
