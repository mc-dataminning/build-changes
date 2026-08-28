public class fsz extends fqh {
   private static final int a = 600;
   private final vy b;
   private fko c;
   private int d;
   private final fog s = fog.d();

   public fsz(xe $$0, vy $$1) {
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
      this.s.a(new flv(this.l, this.p));
      this.c = this.s.a(fko.a(xd.p, $$0 -> this.b.a(fpg.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fkm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      foa.a(this.s, this.H());
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
