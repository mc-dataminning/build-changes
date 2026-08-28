import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class djh extends dno implements dfz {
   public static final MapCodec<djh> a = b(djh::new);

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dsz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      jd $$4 = $$2.c();
      dta $$5 = dfy.bt.o();
      Optional<jm.c<eiq>> $$6 = $$0.H_().d(lu.aQ).b(sh.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jd $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dta $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dfz)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            jm<eiq> $$12;
            if ($$1.a(8) == 0) {
               List<ebn<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eer)$$11.get(0).c()).d();
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
   public dfz.a aq_() {
      return dfz.a.a;
   }
}
