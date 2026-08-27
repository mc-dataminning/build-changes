public class bxu extends bxm {
   private static final int b = 40;
   private int c;

   public bxu(bxj $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dL().a(this.a.dq(), this.a.ds(), this.a.dw(), apf.gX, this.a.da(), 2.5F, 0.8F + this.a.ef().i() * 0.3F, false);
   }

   @Override
   public void c() {
      if (this.c++ >= 40) {
         this.a.ga().a(bxz.f);
      }
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public bxz<bxu> i() {
      return bxz.h;
   }
}
