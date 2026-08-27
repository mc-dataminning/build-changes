public class fnt extends fkt {
   private static final int a = 600;
   private final vq b;
   private feu c;
   private int d;
   private final fil r = fil.d();

   public fnt(ws $$0, vq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.r.c().b().a(10);
      this.r.a(new fgb(this.l, this.p));
      this.c = this.r.a(feu.a(wr.p, $$0 -> this.b.a(fjm.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fif.a(this.r, this.G());
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
