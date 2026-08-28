public class fsl extends fpt {
   private static final int a = 600;
   private final vx b;
   private fka c;
   private int d;
   private final fns s = fns.d();

   public fsl(xd $$0, vx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Override
   protected void aT_() {
      this.s.c().b().a(10);
      this.s.a(new flh(this.l, this.p));
      this.c = this.s.a(fka.a(xc.p, $$0 -> this.b.a(fos.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fjy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fnm.a(this.s, this.H());
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
