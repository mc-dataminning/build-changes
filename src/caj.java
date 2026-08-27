public class caj extends cab {
   private static final int b = 40;
   private int c;

   public caj(bzy $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), arc.hA, this.a.db(), 2.5F, 0.8F + this.a.eg().i() * 0.3F, false);
   }

   @Override
   public void c() {
      if (this.c++ >= 40) {
         this.a.gb().a(cao.f);
      }
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public cao<caj> i() {
      return cao.h;
   }
}
