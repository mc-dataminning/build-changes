import com.mojang.serialization.MapCodec;

public class doy extends djn implements djq {
   public static final MapCodec<doy> a = b(doy::new);

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(dwx.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
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
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ji $$6 : ji.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dwy $$7 = $$0.a_($$6);
         if ($$7.a(djp.oP)) {
            $$5 = true;
         }

         if ($$7.a(djp.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? djp.oP.m() : djp.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, djp.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, djp.oY.m(), 3);
      }
   }

   @Override
   public djq.a aq_() {
      return djq.a.a;
   }
}
