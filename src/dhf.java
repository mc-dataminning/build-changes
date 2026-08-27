import com.mojang.serialization.MapCodec;

public class dhf extends dby implements dcb {
   public static final MapCodec<dhf> a = b(dhf::new);

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(doy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      if (!$$0.a_($$1.c()).a((cyd)$$0, $$1)) {
         return false;
      } else {
         for (ib $$3 : ib.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avc.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ib $$6 : ib.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         doz $$7 = $$0.a_($$6);
         if ($$7.a(dca.on)) {
            $$5 = true;
         }

         if ($$7.a(dca.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dca.on.n() : dca.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dca.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dca.ow.n(), 3);
      }
   }

   @Override
   public dcb.a ar_() {
      return dcb.a.a;
   }
}
