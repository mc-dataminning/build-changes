import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dis extends dmy implements dfk {
   public static final MapCodec<dis> a = b(dis::new);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(dsj.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      ja $$4 = $$2.c();
      dsk $$5 = dfj.bt.o();
      Optional<jj.c<eia>> $$6 = $$0.H_().d(lr.aP).b(se.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ja $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dsk $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dfk)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            jj<eia> $$12;
            if ($$1.a(8) == 0) {
               List<eax<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eeb)$$11.get(0).c()).d();
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
   public dfk.a aq_() {
      return dfk.a.a;
   }
}
