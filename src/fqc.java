public class fqc extends fnc {
   private static final int a = 600;
   private final wj b;
   private fhd c;
   private int d;
   private final fku r = fku.d();

   public fqc(xo $$0, wj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.r.c().b().a(10);
      this.r.a(new fik(this.l, this.p));
      this.c = this.r.a(fhd.a(xn.p, $$0 -> this.b.a(flv.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fhb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fko.a(this.r, this.G());
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
