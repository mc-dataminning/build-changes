import com.mojang.serialization.MapCodec;

public class dpw extends dkm implements dkp {
   public static final MapCodec<dpw> a = b(dpw::new);

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   public dpw(dxu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
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
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dxv $$7 = $$0.a_($$6);
         if ($$7.a(dko.oI)) {
            $$5 = true;
         }

         if ($$7.a(dko.oR)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dko.oI.m() : dko.oR.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dko.oI.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dko.oR.m(), 3);
      }
   }

   @Override
   public dkp.a ar_() {
      return dkp.a.a;
   }
}
