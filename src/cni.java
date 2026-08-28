public class cni extends cna {
   private static final int b = 40;
   private int c;

   public cni(cmx $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dV().a(this.a.dA(), this.a.dC(), this.a.dG(), awr.iC, this.a.dm(), 2.5F, 0.8F + this.a.dY().i() * 0.3F, false);
   }

   @Override
   public void a(aru $$0) {
      if (this.c++ >= 40) {
         this.a.t().a(cnn.f);
      }
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public cnn<cni> h() {
      return cnn.h;
   }
}
