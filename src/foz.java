public class foz extends flz {
   private static final int a = 600;
   private final vv b;
   private fga c;
   private int d;
   private final fjr r = fjr.d();

   public foz(wx $$0, vv $$1) {
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
      this.r.a(new fhh(this.l, this.p));
      this.c = this.r.a(fga.a(ww.p, $$0 -> this.b.a(fks.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         ffy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fjl.a(this.r, this.G());
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
