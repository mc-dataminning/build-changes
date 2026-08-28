import com.mojang.serialization.MapCodec;

public class dpo extends dke implements dkh {
   public static final MapCodec<dpo> a = b(dpo::new);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(dxm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jh $$3 : jh.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axu.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dxn $$7 = $$0.a_($$6);
         if ($$7.a(dkg.oI)) {
            $$5 = true;
         }

         if ($$7.a(dkg.oR)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dkg.oI.m() : dkg.oR.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dkg.oI.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dkg.oR.m(), 3);
      }
   }

   @Override
   public dkh.a ar_() {
      return dkh.a.a;
   }
}
