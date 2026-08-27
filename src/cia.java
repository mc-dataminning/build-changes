public class cia extends chk {
   public cia(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgz.a($$3);
      } else {
         if (!$$1.fS().d) {
            $$3.h(1);
         }

         $$1.b(apo.c.b(this));
         $$1.dL().a(null, $$1, ape.yx, $$1.db(), 1.0F, 1.0F);
         cjf $$4 = cjm.a($$0, $$1.dp(), $$1.dv(), (byte)0, true, false);
         if ($$3.b()) {
            return bgz.b($$4);
         } else {
            if (!$$1.fR().e($$4.p())) {
               $$1.a($$4, false);
            }

            return bgz.b($$3);
         }
      }
   }
}
