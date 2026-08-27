import com.mojang.serialization.MapCodec;

public class cyi extends ctc implements ctf {
   public static final MapCodec<cyi> a = b(cyi::new);

   @Override
   public MapCodec<cyi> a() {
      return a;
   }

   public cyi(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      if (!$$0.a_($$1.c()).a((cph)$$0, $$1)) {
         return false;
      } else {
         for (gw $$3 : gw.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(apv.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gw $$6 : gw.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dfd $$7 = $$0.a_($$6);
         if ($$7.a(cte.on)) {
            $$5 = true;
         }

         if ($$7.a(cte.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cte.on.o() : cte.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cte.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cte.ow.o(), 3);
      }
   }
}
