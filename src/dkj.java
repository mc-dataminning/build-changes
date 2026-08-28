import com.mojang.serialization.MapCodec;

public class dkj extends dfb implements dfe {
   public static final MapCodec<dkj> a = b(dkj::new);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(dsd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      if (!$$0.a_($$1.c()).a((dbg)$$0, $$1)) {
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
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iz $$6 : iz.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dse $$7 = $$0.a_($$6);
         if ($$7.a(dfd.on)) {
            $$5 = true;
         }

         if ($$7.a(dfd.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfd.on.o() : dfd.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfd.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfd.ow.o(), 3);
      }
   }

   @Override
   public dfe.a ap_() {
      return dfe.a.a;
   }
}
