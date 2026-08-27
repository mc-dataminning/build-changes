public class fji extends fgh {
   private static final int a = 600;
   private final uq b;
   private fak c;
   private int k;
   private final fea l = fea.d();

   public fji(vs $$0, uq $$1) {
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
      this.l.a(new fbr(this.e, this.i));
      this.c = this.l.a(fak.a(vr.p, $$0 -> this.b.a(ffb.a)).a());
      this.c.j = false;
      this.l.a();
      this.l.a($$1 -> {
         fai var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fdu.a(this.l, this.F());
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
