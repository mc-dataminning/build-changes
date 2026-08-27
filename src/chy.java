public class chy extends cir {
   public chy(cir.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ciw $$0) {
      return true;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aou.hz, aov.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         ccn $$4 = new ccn($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dC(), $$1.dA(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(ape.c.b(this));
      if (!$$1.fR().d) {
         $$3.h(1);
      }

      return bgp.a($$3, $$0.r_());
   }
}
