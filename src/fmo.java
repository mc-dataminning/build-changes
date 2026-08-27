public class fmo extends fjo {
   private static final int a = 600;
   private final ve b;
   private fdp c;
   private int d;
   private final fhg o = fhg.d();

   public fmo(wg $$0, ve $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.o.c().b().a(10);
      this.o.a(new few(this.i, this.m));
      this.c = this.o.a(fdp.a(wf.p, $$0 -> this.b.a(fih.a)).a());
      this.c.j = false;
      this.o.a();
      this.o.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fha.a(this.o, this.G());
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
