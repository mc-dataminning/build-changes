import javax.annotation.Nullable;

public class cnj extends clj {
   public cnj(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if ($$3.a(cvh.oa)) {
         return czp.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bjb.a($$1.B) : bjb.d;
      } else {
         return bjb.d;
      }
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(arf.c.b(this));
      return bjc.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sd $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         sj $$1 = $$0.c("pages", 8);

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
