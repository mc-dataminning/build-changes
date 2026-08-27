public class fkg extends fhf {
   private static final int a = 600;
   private final us b;
   private fbg c;
   private int k;
   private final fex l = fex.d();

   public fkg(vu $$0, us $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aM_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.l.c().b().a(10);
      this.l.a(new fcn(this.e, this.i));
      this.c = this.l.a(fbg.a(vt.p, $$0 -> this.b.a(ffy.a)).a());
      this.c.j = false;
      this.l.a();
      this.l.a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fer.a(this.l, this.F());
   }

   @Override
   public void e() {
      super.e();
      this.k++;
      if (this.k == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
