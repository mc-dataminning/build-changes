import com.mojang.serialization.MapCodec;

public class dle extends dfw implements dfz {
   public static final MapCodec<dle> a = b(dle::new);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dsz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      if (!$$0.a_($$1.c()).a((dca)$$0, $$1)) {
         return false;
      } else {
         for (jd $$3 : jd.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awd.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jd $$6 : jd.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dta $$7 = $$0.a_($$6);
         if ($$7.a(dfy.on)) {
            $$5 = true;
         }

         if ($$7.a(dfy.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfy.on.o() : dfy.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfy.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfy.ow.o(), 3);
      }
   }

   @Override
   public dfz.a aq_() {
      return dfz.a.a;
   }
}
