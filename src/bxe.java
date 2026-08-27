public class bxe extends byd {
   private final ccl g;

   public bxe(ccl $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gn() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(czj $$0, id $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dpi $$2 = $$0.a_($$1);
         if ($$2.a(dcj.cv)) {
            return dmv.a($$0, $$1) < 1;
         } else {
            return $$2.a(dcj.cD) && $$2.c(dfo.b) ? true : $$2.a(ave.R, $$0x -> $$0x.d(dca.b).map($$0xx -> $$0xx != dpv.a).orElse(true));
         }
      }
   }
}
