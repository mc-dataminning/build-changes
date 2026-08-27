import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class czk extends ddp implements cwc {
   public static final MapCodec<czk> a = b(czk::new);

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   public czk(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      hv $$4 = $$2.c();
      dip $$5 = cwb.bt.o();
      Optional<ie.c<dxs>> $$6 = $$0.I_().d(kc.aB).b(qw.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         hv $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dip $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((cwc)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ie<dxs> $$12;
            if ($$1.a(8) == 0) {
               List<dqp<?, ?>> $$11 = $$0.s($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dtt)$$11.get(0).c()).d();
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
