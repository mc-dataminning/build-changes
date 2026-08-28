public class fsv extends fqd {
   private static final int a = 600;
   private final vx b;
   private fkk c;
   private int d;
   private final foc s = foc.d();

   public fsv(xd $$0, vx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aR_() {
      this.s.c().b().a(10);
      this.s.a(new flr(this.l, this.p));
      this.c = this.s.a(fkk.a(xc.p, $$0 -> this.b.a(fpc.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fki var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fnw.a(this.s, this.H());
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
