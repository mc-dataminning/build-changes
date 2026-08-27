import javax.annotation.Nullable;

public class cot extends cms {
   public cot(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if ($$3.a(cwr.oa)) {
         return daz.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bka.a($$1.B) : bka.d;
      } else {
         return bka.d;
      }
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(asb.c.b(this));
      return bkb.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sn $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         st $$1 = $$0.c("pages", 8);

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
