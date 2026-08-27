public class fgn extends fdm {
   private static final int a = 600;
   private final uh b;
   private exr c;
   private int k;
   private final fbf l = fbf.d();

   public fgn(vg $$0, uh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.l.c().b().a(10);
      this.l.a(new eyy(this.e, this.i));
      this.c = this.l.a(exr.a(vf.p, $$0 -> this.b.a(fcg.a)).a());
      this.c.j = false;
      this.l.a();
      this.l.a($$1 -> {
         exp var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      faz.a(this.l, this.F());
   }

   @Override
   public void e() {
      super.e();
      this.k++;
      if (this.k == 600) {
         this.c.j = true;
      }

      if (this.b.k()) {
         this.b.d();
      } else {
         this.b.p();
      }
   }
}
