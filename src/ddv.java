import com.mojang.serialization.MapCodec;

public class ddv extends cyo implements cyr {
   public static final MapCodec<ddv> a = b(ddv::new);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(dle.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      if (!$$0.a_($$1.c()).a((cut)$$0, $$1)) {
         return false;
      } else {
         for (hz $$3 : hz.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(atz.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hz $$6 : hz.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dlf $$7 = $$0.a_($$6);
         if ($$7.a(cyq.on)) {
            $$5 = true;
         }

         if ($$7.a(cyq.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cyq.on.o() : cyq.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cyq.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cyq.ow.o(), 3);
      }
   }

   @Override
   public cyr.a av_() {
      return cyr.a.a;
   }
}
