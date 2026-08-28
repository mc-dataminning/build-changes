public class fqe extends fne {
   private static final int a = 600;
   private final wk b;
   private fhf c;
   private int d;
   private final fkw r = fkw.d();

   public fqe(xp $$0, wk $$1) {
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
      this.r.a(new fim(this.l, this.p));
      this.c = this.r.a(fhf.a(xo.p, $$0 -> this.b.a(flx.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fhd var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fkq.a(this.r, this.G());
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
