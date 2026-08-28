import java.util.Optional;

public class cvw extends cxd {
   private static final wp a = wp.c("item.minecraft.lodestone_compass");

   public cvw(cxd.a $$0) {
      super($$0);
   }

   @Override
   public boolean c_(cxh $$0) {
      return $$0.b(kv.af) || super.c_($$0);
   }

   @Override
   public void a(cxh $$0, dgz $$1, bva $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ard $$5) {
         czz $$6 = $$0.a(kv.af);
         if ($$6 != null) {
            czz $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kv.af, $$7);
            }
         }
      }
   }

   @Override
   public bsy a(daz $$0) {
      ji $$1 = $$0.a();
      dgz $$2 = $$0.q();
      if (!$$2.a_($$1).a(dkg.pS)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.oV, awb.h, 1.0F, 1.0F);
         cpr $$3 = $$0.o();
         cxh $$4 = $$0.n();
         boolean $$5 = !$$3.fX() && $$4.M() == 1;
         czz $$6 = new czz(Optional.of(jq.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kv.af, $$6);
         } else {
            cxh $$7 = $$4.a(cxl.rB, 1);
            $$4.a(1, $$3);
            $$7.b(kv.af, $$6);
            if (!$$3.gl().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsy.a;
      }
   }

   @Override
   public wp a(cxh $$0) {
      return $$0.b(kv.af) ? a : super.a($$0);
   }
}
