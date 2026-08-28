import com.mojang.serialization.MapCodec;

public class dpo extends dkd implements dkg {
   public static final MapCodec<dpo> a = b(dpo::new);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(dxn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jh $$3 : jh.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axk.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dxo $$7 = $$0.a_($$6);
         if ($$7.a(dkf.oP)) {
            $$5 = true;
         }

         if ($$7.a(dkf.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dkf.oP.m() : dkf.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dkf.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dkf.oY.m(), 3);
      }
   }

   @Override
   public dkg.a ar_() {
      return dkg.a.a;
   }
}
