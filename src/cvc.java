import java.util.Optional;

public class cvc extends cwk {
   private static final wp a = wp.c("item.minecraft.lodestone_compass");

   public cvc(cwk.a $$0) {
      super($$0);
   }

   @Override
   public boolean c_(cwo $$0) {
      return $$0.b(kv.ad) || super.c_($$0);
   }

   @Override
   public void a(cwo $$0, dgh $$1, buk $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ard $$5) {
         czi $$6 = $$0.a(kv.ad);
         if ($$6 != null) {
            czi $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kv.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsj a(dah $$0) {
      ji $$1 = $$0.a();
      dgh $$2 = $$0.q();
      if (!$$2.a_($$1).a(djn.pS)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.oL, awb.h, 1.0F, 1.0F);
         cow $$3 = $$0.o();
         cwo $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         czi $$6 = new czi(Optional.of(jq.a($$2.ai(), $$1)), true);
         if ($$5) {
            $$4.b(kv.ad, $$6);
         } else {
            cwo $$7 = $$4.a(cws.rz, 1);
            $$4.a(1, $$3);
            $$7.b(kv.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsj.a;
      }
   }

   @Override
   public wp a(cwo $$0) {
      return $$0.b(kv.ad) ? a : super.a($$0);
   }
}
