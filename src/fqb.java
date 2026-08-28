public class fqb extends fnb {
   private static final int a = 600;
   private final wj b;
   private fhc c;
   private int d;
   private final fkt r = fkt.d();

   public fqb(xo $$0, wj $$1) {
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
      this.r.a(new fij(this.l, this.p));
      this.c = this.r.a(fhc.a(xn.p, $$0 -> this.b.a(flu.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fha var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fkn.a(this.r, this.G());
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
