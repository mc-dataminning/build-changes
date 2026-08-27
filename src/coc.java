import javax.annotation.Nullable;

public class coc extends cmc {
   public coc(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if ($$3.a(cwb.oa)) {
         return daj.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bjl.a($$1.B) : bjl.d;
      } else {
         return bjl.d;
      }
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(arm.c.b(this));
      return bjm.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sj $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         sp $$1 = $$0.c("pages", 8);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            String $$3 = $$1.j($$2);
            if ($$3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }
}
