public class foz extends fly {
   private static final int a = 600;
   private final vv b;
   private ffz c;
   private int d;
   private final fjq r = fjq.d();

   public foz(wx $$0, vv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.r.c().b().a(10);
      this.r.a(new fhg(this.l, this.p));
      this.c = this.r.a(ffz.a(ww.p, $$0 -> this.b.a(fkr.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         ffx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fjk.a(this.r, this.G());
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
