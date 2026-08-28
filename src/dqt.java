import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dqt extends dvf implements dnh {
   public static final MapCodec<dqt> a = b(dqt::new);

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(ebf.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      iw $$4 = $$2.d();
      ebg $$5 = dng.bA.m();
      Optional<jg.c<erh>> $$6 = $$0.J_().f(mi.bb).a(sa.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         iw $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         ebg $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dnh $$11 = (dnh)$$5.b();
            if ($$11.a((dkc)$$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jg<erh> $$14;
            if ($$1.a(8) == 0) {
               List<ejx<?, ?>> $$12 = $$0.u($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((ene)$$12.get($$13).c()).d();
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
   public dnh.a ar_() {
      return dnh.a.a;
   }
}
