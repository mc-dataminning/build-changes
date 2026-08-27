import com.mojang.serialization.MapCodec;

public class dfh extends daa implements dad {
   public static final MapCodec<dfh> a = b(dfh::new);

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(dmy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      if (!$$0.a_($$1.c()).a((cwf)$$0, $$1)) {
         return false;
      } else {
         for (ib $$3 : ib.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aun.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ib $$6 : ib.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dmz $$7 = $$0.a_($$6);
         if ($$7.a(dac.on)) {
            $$5 = true;
         }

         if ($$7.a(dac.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dac.on.o() : dac.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dac.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dac.ow.o(), 3);
      }
   }

   @Override
   public dad.a at_() {
      return dad.a.a;
   }
}
