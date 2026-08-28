import com.mojang.serialization.MapCodec;

public class dkq extends dfi implements dfl {
   public static final MapCodec<dkq> a = b(dkq::new);

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dsk.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      if (!$$0.a_($$1.c()).a((dbm)$$0, $$1)) {
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
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ja $$6 : ja.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsl $$7 = $$0.a_($$6);
         if ($$7.a(dfk.on)) {
            $$5 = true;
         }

         if ($$7.a(dfk.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfk.on.o() : dfk.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfk.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfk.ow.o(), 3);
      }
   }

   @Override
   public dfl.a aq_() {
      return dfl.a.a;
   }
}
