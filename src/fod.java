public class fod extends fld {
   private static final int a = 600;
   private final vs b;
   private ffe c;
   private int d;
   private final fiv r = fiv.d();

   public fod(wu $$0, vs $$1) {
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
      this.r.a(new fgl(this.l, this.p));
      this.c = this.r.a(ffe.a(wt.p, $$0 -> this.b.a(fjw.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         ffc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fip.a(this.r, this.G());
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
