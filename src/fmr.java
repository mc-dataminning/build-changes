public class fmr extends fmy {
   private static final xl a = xl.c("outOfMemory.title");
   private static final xl b = xl.c("outOfMemory.message");
   private static final int c = 300;
   private final fkm d = new fkm(this);

   public fmr() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      this.d.c(new fhk(300, b, this.p));
      fkq $$0 = this.d.b(fkq.e().a(8));
      $$0.a(fgz.a(xk.l, $$0x -> this.m.a(new fnd())).a());
      $$0.a(fgz.a(xl.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
