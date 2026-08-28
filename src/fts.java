public class fts extends fra {
   private static final int a = 600;
   private final wc b;
   private flh c;
   private int d;
   private final fpa s = fpa.d();

   public fts(xi $$0, wc $$1) {
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
      this.s.a(new fmo(this.l, this.p));
      this.c = this.s.a(flh.a(xh.p, $$0 -> this.b.a(fpz.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fou.a(this.s, this.H());
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
