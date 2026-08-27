import com.mojang.serialization.MapCodec;

public class dah extends cva implements cvd {
   public static final MapCodec<dah> a = b(dah::new);

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public dah(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      if (!$$0.a_($$1.c()).a((crg)$$0, $$1)) {
         return false;
      } else {
         for (ht $$3 : ht.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(arg.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ht $$6 : ht.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dhi $$7 = $$0.a_($$6);
         if ($$7.a(cvc.on)) {
            $$5 = true;
         }

         if ($$7.a(cvc.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cvc.on.o() : cvc.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cvc.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cvc.ow.o(), 3);
      }
   }
}
