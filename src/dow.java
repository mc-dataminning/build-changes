import com.mojang.serialization.MapCodec;

public class dow extends djl implements djo {
   public static final MapCodec<dow> a = b(dow::new);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(dwv.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
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
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ji $$6 : ji.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dww $$7 = $$0.a_($$6);
         if ($$7.a(djn.oP)) {
            $$5 = true;
         }

         if ($$7.a(djn.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? djn.oP.m() : djn.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, djn.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, djn.oY.m(), 3);
      }
   }

   @Override
   public djo.a aq_() {
      return djo.a.a;
   }
}
