public class bqs extends brr {
   private final bvx g;

   public bqs(bvx $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.ge() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(crc $$0, ht $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dgb $$2 = $$0.a_($$1);
         if ($$2.a(cuc.cv)) {
            return dee.a($$0, $$1) < 1;
         } else {
            return $$2.a(cuc.cD) && $$2.c(cxf.b) ? true : $$2.a(aqs.R, $$0x -> $$0x.d(ctt.b).map($$0xx -> $$0xx != dgo.a).orElse(true));
         }
      }
   }
}
