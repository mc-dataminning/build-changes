public class cht extends chd {
   public cht(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgr.a($$3);
      } else {
         if (!$$1.fR().d) {
            $$3.h(1);
         }

         $$1.b(apg.c.b(this));
         $$1.dK().a(null, $$1, aow.ys, $$1.da(), 1.0F, 1.0F);
         ciy $$4 = cjf.a($$0, $$1.do(), $$1.du(), (byte)0, true, false);
         if ($$3.b()) {
            return bgr.b($$4);
         } else {
            if (!$$1.fQ().e($$4.p())) {
               $$1.a($$4, false);
            }

            return bgr.b($$3);
         }
      }
   }
}
