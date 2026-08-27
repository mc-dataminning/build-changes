import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class ddn extends dhs implements daf {
   public static final MapCodec<ddn> a = b(ddn::new);

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public ddn(dna.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      ib $$4 = $$2.c();
      dnb $$5 = dae.bt.o();
      Optional<il.c<eci>> $$6 = $$0.H_().d(kj.aD).b(rh.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ib $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dnb $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((daf)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            il<eci> $$12;
            if ($$1.a(8) == 0) {
               List<dvf<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dyj)$$11.get(0).c()).d();
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
   public daf.a at_() {
      return daf.a.a;
   }
}
