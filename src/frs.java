public class frs extends fon {
   private static final int a = 600;
   private final wc b;
   private fin c;
   private int d;
   private final fme r = fme.d();

   public frs(xe $$0, wc $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.r.c().b().a(10);
      this.r.a(new fju(this.l, this.p));
      this.c = this.r.a(fin.a(xd.p, $$0 -> this.b.a(fnf.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fly.a(this.r, this.G());
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
