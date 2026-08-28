public class ftk extends fqs {
   private static final int a = 600;
   private final wb b;
   private fkz c;
   private int d;
   private final fos s = fos.d();

   public ftk(xh $$0, wb $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aI_() {
      return false;
   }

   @Override
   protected void aS_() {
      this.s.c().b().a(10);
      this.s.a(new fmg(this.l, this.p));
      this.c = this.s.a(fkz.a(xg.p, $$0 -> this.b.a(fpr.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fol.a(this.s, this.H());
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
