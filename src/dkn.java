import com.mojang.serialization.MapCodec;

public class dkn extends dff implements dfi {
   public static final MapCodec<dkn> a = b(dkn::new);

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dsg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      if (!$$0.a_($$1.c()).a((dbj)$$0, $$1)) {
         return false;
      } else {
         for (ja $$3 : ja.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avu.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ja $$6 : ja.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsh $$7 = $$0.a_($$6);
         if ($$7.a(dfh.on)) {
            $$5 = true;
         }

         if ($$7.a(dfh.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfh.on.o() : dfh.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfh.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfh.ow.o(), 3);
      }
   }

   @Override
   public dfi.a aq_() {
      return dfi.a.a;
   }
}
