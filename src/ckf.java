public class ckf extends cjx {
   private static final int b = 40;
   private int c;

   public ckf(cju $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dW().a(this.a.dB(), this.a.dD(), this.a.dH(), awa.iz, this.a.dn(), 2.5F, 0.8F + this.a.dZ().i() * 0.3F, false);
   }

   @Override
   public void a(arc $$0) {
      if (this.c++ >= 40) {
         this.a.gl().a(ckk.f);
      }
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public ckk<ckf> h() {
      return ckk.h;
   }
}
