import javax.annotation.Nullable;

public class com extends cmm {
   public com(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if ($$3.a(cwl.oa)) {
         return dat.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bjv.a($$1.B) : bjv.d;
      } else {
         return bjv.d;
      }
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(arw.c.b(this));
      return bjw.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sl $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         sr $$1 = $$0.c("pages", 8);

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
