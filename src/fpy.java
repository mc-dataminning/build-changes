public class fpy extends fmy {
   private static final int a = 600;
   private final wj b;
   private fgz c;
   private int d;
   private final fkq r = fkq.d();

   public fpy(xl $$0, wj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.r.c().b().a(10);
      this.r.a(new fig(this.l, this.p));
      this.c = this.r.a(fgz.a(xk.p, $$0 -> this.b.a(flr.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fgx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fkk.a(this.r, this.G());
   }

   @Override
   public void e() {
      super.e();
      this.d++;
      if (this.d == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
