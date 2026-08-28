public class fqu extends fob {
   private static final int a = 600;
   private final vt b;
   private fik c;
   private int r;
   private final fmb s = fmb.d();

   public fqu(wz $$0, vt $$1) {
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
      this.s.a(new fjr(this.k, this.o));
      this.c = this.s.a(fik.a(wy.p, $$0 -> this.b.a(fna.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      flv.a(this.s, this.H());
   }

   @Override
   public void e() {
      super.e();
      this.r++;
      if (this.r == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
