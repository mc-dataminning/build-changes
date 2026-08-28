import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class djj extends dnq implements dgb {
   public static final MapCodec<djj> a = b(djj::new);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      jd $$4 = $$2.d();
      dtc $$5 = dga.bt.o();
      Optional<jm.c<eit>> $$6 = $$0.H_().d(lu.aQ).b(si.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jd $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dtc $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dgb)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            jm<eit> $$12;
            if ($$1.a(8) == 0) {
               List<ebq<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eeu)$$11.get(0).c()).d();
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
   public dgb.a au_() {
      return dgb.a.a;
   }
}
