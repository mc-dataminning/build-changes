import com.mojang.serialization.MapCodec;

public class dqh extends dku implements dkx {
   public static final MapCodec<dqh> a = b(dqh::new);

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(dyl.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jj $$3 : jj.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awz.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jj $$6 : jj.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dym $$7 = $$0.a_($$6);
         if ($$7.a(dkw.oP)) {
            $$5 = true;
         }

         if ($$7.a(dkw.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dkw.oP.m() : dkw.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dkw.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dkw.oY.m(), 3);
      }
   }

   @Override
   public dkx.a am_() {
      return dkx.a.a;
   }
}
