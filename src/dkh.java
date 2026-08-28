import com.mojang.serialization.MapCodec;

public class dkh extends dez implements dfc {
   public static final MapCodec<dkh> a = b(dkh::new);

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(dsb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      if (!$$0.a_($$1.c()).a((dbe)$$0, $$1)) {
         return false;
      } else {
         for (iz $$3 : iz.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awp.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iz $$6 : iz.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsc $$7 = $$0.a_($$6);
         if ($$7.a(dfb.on)) {
            $$5 = true;
         }

         if ($$7.a(dfb.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfb.on.o() : dfb.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfb.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfb.ow.o(), 3);
      }
   }

   @Override
   public dfc.a ap_() {
      return dfc.a.a;
   }
}
