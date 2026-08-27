import com.mojang.serialization.MapCodec;

public class did extends dcv implements dcy {
   public static final MapCodec<did> a = b(did::new);

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dpx.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      if (!$$0.a_($$1.c()).a((cza)$$0, $$1)) {
         return false;
      } else {
         for (im $$3 : im.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avo.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (im $$6 : im.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dpy $$7 = $$0.a_($$6);
         if ($$7.a(dcx.on)) {
            $$5 = true;
         }

         if ($$7.a(dcx.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dcx.on.n() : dcx.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dcx.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dcx.ow.n(), 3);
      }
   }

   @Override
   public dcy.a aq_() {
      return dcy.a.a;
   }
}
