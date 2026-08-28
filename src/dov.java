import com.mojang.serialization.MapCodec;

public class dov extends djk implements djn {
   public static final MapCodec<dov> a = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dwu.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (ji $$3 : ji.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awo.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ji $$6 : ji.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dwv $$7 = $$0.a_($$6);
         if ($$7.a(djm.oP)) {
            $$5 = true;
         }

         if ($$7.a(djm.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? djm.oP.m() : djm.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, djm.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, djm.oY.m(), 3);
      }
   }

   @Override
   public djn.a aq_() {
      return djn.a.a;
   }
}
