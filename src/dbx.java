import com.mojang.serialization.MapCodec;

public class dbx extends cwq implements cwt {
   public static final MapCodec<dbx> a = b(dbx::new);

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbx(djg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      if (!$$0.a_($$1.c()).a((csv)$$0, $$1)) {
         return false;
      } else {
         for (hx $$3 : hx.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(ash.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hx $$6 : hx.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         djh $$7 = $$0.a_($$6);
         if ($$7.a(cws.on)) {
            $$5 = true;
         }

         if ($$7.a(cws.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cws.on.o() : cws.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cws.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cws.ow.o(), 3);
      }
   }
}
