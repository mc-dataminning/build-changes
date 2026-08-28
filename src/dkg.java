import com.mojang.serialization.MapCodec;

public class dkg extends dey implements dfb {
   public static final MapCodec<dkg> a = b(dkg::new);

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dsa.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      if (!$$0.a_($$1.c()).a((dbd)$$0, $$1)) {
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
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iz $$6 : iz.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dsb $$7 = $$0.a_($$6);
         if ($$7.a(dfa.on)) {
            $$5 = true;
         }

         if ($$7.a(dfa.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfa.on.o() : dfa.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dfa.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dfa.ow.o(), 3);
      }
   }

   @Override
   public dfb.a ap_() {
      return dfb.a.a;
   }
}
