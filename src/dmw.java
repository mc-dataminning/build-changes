import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dmw extends drg implements djn {
   public static final MapCodec<dmw> a = b(dmw::new);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dwu.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      ji $$4 = $$2.d();
      dwv $$5 = djm.bA.m();
      Optional<jr.c<emo>> $$6 = $$0.K_().e(mc.aT).a(rw.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ji $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dwv $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            djn $$11 = (djn)$$5.b();
            if ($$11.a($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jr<emo> $$13;
            if ($$1.a(8) == 0) {
               List<efi<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ein)$$12.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$13 = $$6.get();
            }

            $$13.a().a($$0, $$0.m().g(), $$1, $$8);
         }
      }
   }

   @Override
   public djn.a aq_() {
      return djn.a.a;
   }
}
