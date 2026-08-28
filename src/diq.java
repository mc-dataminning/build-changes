import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class diq extends dmw implements dfi {
   public static final MapCodec<diq> a = b(diq::new);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dsg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      ja $$4 = $$2.c();
      dsh $$5 = dfh.bt.o();
      Optional<jj.c<ehu>> $$6 = $$0.H_().d(lr.aP).b(se.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ja $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dsh $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dfi)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            jj<ehu> $$12;
            if ($$1.a(8) == 0) {
               List<ear<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((edv)$$11.get(0).c()).d();
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
   public dfi.a aq_() {
      return dfi.a.a;
   }
}
