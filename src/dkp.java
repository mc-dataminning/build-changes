import com.mojang.serialization.MapCodec;

public class dkp extends dfh implements dfk {
   public static final MapCodec<dkp> a = b(dkp::new);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dsj.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      if (!$$0.a_($$1.c()).a((dbl)$$0, $$1)) {
         return false;
      } else {
         for (ja $$3 : ja.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avw.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ja $$6 : ja.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsk $$7 = $$0.a_($$6);
         if ($$7.a(dfj.on)) {
            $$5 = true;
         }

         if ($$7.a(dfj.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfj.on.o() : dfj.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfj.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfj.ow.o(), 3);
      }
   }

   @Override
   public dfk.a aq_() {
      return dfk.a.a;
   }
}
