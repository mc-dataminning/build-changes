import javax.annotation.Nullable;

public class ckr extends cir {
   public ckr(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if ($$3.a(csl.oa)) {
         return cws.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgo.a($$1.B) : bgo.d;
      } else {
         return bgo.d;
      }
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(ape.c.b(this));
      return bgp.a($$3, $$0.r_());
   }

   public static boolean a(@Nullable qs $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         qy $$1 = $$0.c("pages", 8);

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
