import com.mojang.serialization.MapCodec;

public class dpv extends dkl implements dko {
   public static final MapCodec<dpv> a = b(dpv::new);

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(dxt.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
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
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dxu $$7 = $$0.a_($$6);
         if ($$7.a(dkn.oI)) {
            $$5 = true;
         }

         if ($$7.a(dkn.oR)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dkn.oI.m() : dkn.oR.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dkn.oI.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dkn.oR.m(), 3);
      }
   }

   @Override
   public dko.a ar_() {
      return dko.a.a;
   }
}
