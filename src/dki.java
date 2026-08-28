import com.mojang.serialization.MapCodec;

public class dki extends dfa implements dfd {
   public static final MapCodec<dki> a = b(dki::new);

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dsc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      if (!$$0.a_($$1.c()).a((dbf)$$0, $$1)) {
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
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iz $$6 : iz.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsd $$7 = $$0.a_($$6);
         if ($$7.a(dfc.on)) {
            $$5 = true;
         }

         if ($$7.a(dfc.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfc.on.o() : dfc.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfc.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfc.ow.o(), 3);
      }
   }

   @Override
   public dfd.a ap_() {
      return dfd.a.a;
   }
}
