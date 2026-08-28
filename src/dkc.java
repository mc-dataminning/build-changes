import com.mojang.serialization.MapCodec;

public class dkc extends deu implements dex {
   public static final MapCodec<dkc> a = b(dkc::new);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(drw.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      if (!$$0.a_($$1.c()).a((daz)$$0, $$1)) {
         return false;
      } else {
         for (iz $$3 : iz.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awl.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iz $$6 : iz.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         drx $$7 = $$0.a_($$6);
         if ($$7.a(dew.on)) {
            $$5 = true;
         }

         if ($$7.a(dew.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dew.on.n() : dew.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dew.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dew.ow.n(), 3);
      }
   }

   @Override
   public dex.a ar_() {
      return dex.a.a;
   }
}
