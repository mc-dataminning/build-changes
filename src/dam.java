import com.mojang.serialization.MapCodec;

public class dam extends cvf implements cvi {
   public static final MapCodec<dam> a = b(dam::new);

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public dam(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      if (!$$0.a_($$1.c()).a((crl)$$0, $$1)) {
         return false;
      } else {
         for (hx $$3 : hx.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(ark.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hx $$6 : hx.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dhn $$7 = $$0.a_($$6);
         if ($$7.a(cvh.on)) {
            $$5 = true;
         }

         if ($$7.a(cvh.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cvh.on.o() : cvh.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cvh.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cvh.ow.o(), 3);
      }
   }
}
