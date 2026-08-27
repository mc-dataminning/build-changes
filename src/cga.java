public class cga extends cfs {
   private static final int b = 40;
   private int c;

   public cga(cfp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dN().a(this.a.ds(), this.a.du(), this.a.dy(), auz.hZ, this.a.dc(), 2.5F, 0.8F + this.a.ej().i() * 0.3F, false);
   }

   @Override
   public void c() {
      if (this.c++ >= 40) {
         this.a.gm().a(cgf.f);
      }
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public cgf<cga> i() {
      return cgf.h;
   }
}
