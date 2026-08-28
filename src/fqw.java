public class fqw extends fod {
   private static final int a = 600;
   private final vt b;
   private fim c;
   private int r;
   private final fmd s = fmd.d();

   public fqw(wz $$0, vt $$1) {
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
      this.s.a(new fjt(this.k, this.o));
      this.c = this.s.a(fim.a(wy.p, $$0 -> this.b.a(fnc.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      flx.a(this.s, this.H());
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
