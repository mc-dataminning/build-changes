import com.mojang.serialization.MapCodec;

public class ddz extends cys implements cyv {
   public static final MapCodec<ddz> a = b(ddz::new);

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public ddz(dli.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      if (!$$0.a_($$1.c()).a((cux)$$0, $$1)) {
         return false;
      } else {
         for (hz $$3 : hz.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aua.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hz $$6 : hz.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dlj $$7 = $$0.a_($$6);
         if ($$7.a(cyu.on)) {
            $$5 = true;
         }

         if ($$7.a(cyu.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cyu.on.o() : cyu.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cyu.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cyu.ow.o(), 3);
      }
   }

   @Override
   public cyv.a av_() {
      return cyv.a.a;
   }
}
