import com.mojang.serialization.MapCodec;

public class dmu extends dhm implements dhp {
   public static final MapCodec<dmu> a = b(dmu::new);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dur.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jf $$3 : jf.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awv.aM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jf $$6 : jf.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dus $$7 = $$0.a_($$6);
         if ($$7.a(dho.on)) {
            $$5 = true;
         }

         if ($$7.a(dho.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dho.on.n() : dho.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dho.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dho.ow.n(), 3);
      }
   }

   @Override
   public dhp.a as_() {
      return dhp.a.a;
   }
}
