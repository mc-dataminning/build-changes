import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class ddl extends dhq implements dad {
   public static final MapCodec<ddl> a = b(ddl::new);

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dmy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      ib $$4 = $$2.c();
      dmz $$5 = dac.bt.o();
      Optional<il.c<ecg>> $$6 = $$0.H_().d(kj.aD).b(rh.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ib $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dmz $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dad)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            il<ecg> $$12;
            if ($$1.a(8) == 0) {
               List<dvd<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dyh)$$11.get(0).c()).d();
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
   public dad.a at_() {
      return dad.a.a;
   }
}
