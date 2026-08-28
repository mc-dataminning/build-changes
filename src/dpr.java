import com.mojang.serialization.MapCodec;

public class dpr extends dke implements dkh {
   public static final MapCodec<dpr> a = b(dpr::new);

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dxp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (ji $$3 : ji.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awp.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ji $$6 : ji.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dxq $$7 = $$0.a_($$6);
         if ($$7.a(dkg.oP)) {
            $$5 = true;
         }

         if ($$7.a(dkg.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dkg.oP.m() : dkg.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dkg.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dkg.oY.m(), 3);
      }
   }

   @Override
   public dkh.a aq_() {
      return dkh.a.a;
   }
}
