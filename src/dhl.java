import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dhl extends dlr implements ded {
   public static final MapCodec<dhl> a = b(dhl::new);

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dhl(drc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      io $$4 = $$2.c();
      drd $$5 = dec.bt.n();
      Optional<ix.c<egp>> $$6 = $$0.H_().d(lf.aI).b(sk.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         io $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         drd $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((ded)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ix<egp> $$12;
            if ($$1.a(8) == 0) {
               List<dzm<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((ecq)$$11.get(0).c()).d();
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
   public ded.a ar_() {
      return ded.a.a;
   }
}
