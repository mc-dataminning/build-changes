import com.mojang.serialization.MapCodec;

public class dkf extends dex implements dfa {
   public static final MapCodec<dkf> a = b(dkf::new);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(drz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      if (!$$0.a_($$1.c()).a((dbc)$$0, $$1)) {
         return false;
      } else {
         for (iz $$3 : iz.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awo.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iz $$6 : iz.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsa $$7 = $$0.a_($$6);
         if ($$7.a(dez.on)) {
            $$5 = true;
         }

         if ($$7.a(dez.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dez.on.o() : dez.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dez.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dez.ow.o(), 3);
      }
   }

   @Override
   public dfa.a aq_() {
      return dfa.a.a;
   }
}
