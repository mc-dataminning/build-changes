import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dbz extends dge implements cyr {
   public static final MapCodec<dbz> a = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbz(dle.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      hz $$4 = $$2.c();
      dlf $$5 = cyq.bt.o();
      Optional<ij.c<eai>> $$6 = $$0.I_().d(kg.aC).b(rd.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         hz $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dlf $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((cyr)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ij<eai> $$12;
            if ($$1.a(8) == 0) {
               List<dtf<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dwj)$$11.get(0).c()).d();
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
   public cyr.a av_() {
      return cyr.a.a;
   }
}
