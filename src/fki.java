public class fki extends fhh {
   private static final int a = 600;
   private final us b;
   private fbi c;
   private int k;
   private final fez l = fez.d();

   public fki(vu $$0, us $$1) {
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
      this.l.a(new fcp(this.e, this.i));
      this.c = this.l.a(fbi.a(vt.p, $$0 -> this.b.a(fga.a)).a());
      this.c.j = false;
      this.l.a();
      this.l.a($$1 -> {
         fbg var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fet.a(this.l, this.F());
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
