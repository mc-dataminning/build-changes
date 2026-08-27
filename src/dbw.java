import com.mojang.serialization.MapCodec;

public class dbw extends cwp implements cws {
   public static final MapCodec<dbw> a = b(dbw::new);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbw(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      if (!$$0.a_($$1.c()).a((csu)$$0, $$1)) {
         return false;
      } else {
         for (hx $$3 : hx.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(asg.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hx $$6 : hx.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         djg $$7 = $$0.a_($$6);
         if ($$7.a(cwr.on)) {
            $$5 = true;
         }

         if ($$7.a(cwr.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cwr.on.o() : cwr.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cwr.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cwr.ow.o(), 3);
      }
   }
}
