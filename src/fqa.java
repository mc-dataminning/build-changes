public class fqa extends fnj {
   private static final int a = 600;
   private final vp b;
   private fhs c;
   private int q;
   private final flj r = flj.d();

   public fqa(wu $$0, vp $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.r.c().b().a(10);
      this.r.a(new fiz(this.k, this.o));
      this.c = this.r.a(fhs.a(wt.p, $$0 -> this.b.a(fmi.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fhq var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fld.a(this.r, this.H());
   }

   @Override
   public void e() {
      super.e();
      this.q++;
      if (this.q == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
