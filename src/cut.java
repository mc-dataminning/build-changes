import java.util.Optional;
import javax.annotation.Nullable;

public class cut extends cwb {
   private static final xl a = xl.c("item.minecraft.lodestone_compass");

   public cut(cwb.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dff $$0) {
      return $$0.D_().j() ? jp.a($$0.ag(), $$0.W()) : null;
   }

   @Override
   public boolean c_(cwf $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cwf $$0, dff $$1, bui $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arq $$5) {
         cyz $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            cyz $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsh a(czy $$0) {
      jh $$1 = $$0.a();
      dff $$2 = $$0.q();
      if (!$$2.a_($$1).a(dil.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awo.om, awp.h, 1.0F, 1.0F);
         cor $$3 = $$0.o();
         cwf $$4 = $$0.n();
         boolean $$5 = !$$3.fY() && $$4.L() == 1;
         cyz $$6 = new cyz(Optional.of(jp.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cwf $$7 = $$4.a(cwj.qT, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gl().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsh.a;
      }
   }

   @Override
   public xl a(cwf $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
