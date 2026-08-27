import com.mojang.serialization.MapCodec;

public class dho extends dch implements dck {
   public static final MapCodec<dho> a = b(dho::new);

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public dho(dph.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      if (!$$0.a_($$1.c()).a((cym)$$0, $$1)) {
         return false;
      } else {
         for (id $$3 : id.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(ave.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (id $$6 : id.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dpi $$7 = $$0.a_($$6);
         if ($$7.a(dcj.on)) {
            $$5 = true;
         }

         if ($$7.a(dcj.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dcj.on.n() : dcj.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dcj.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dcj.ow.n(), 3);
      }
   }

   @Override
   public dck.a aq_() {
      return dck.a.a;
   }
}
