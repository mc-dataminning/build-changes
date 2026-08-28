public class ckf extends cjx {
   private static final int b = 40;
   private int c;

   public ckf(cju $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), awa.iz, this.a.dm(), 2.5F, 0.8F + this.a.dY().i() * 0.3F, false);
   }

   @Override
   public void a(ard $$0) {
      if (this.c++ >= 40) {
         this.a.go().a(ckk.f);
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
