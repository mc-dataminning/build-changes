public class fpu extends fnd {
   private static final int a = 600;
   private final vp b;
   private fhm c;
   private int q;
   private final fld r = fld.d();

   public fpu(wu $$0, vp $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.r.c().b().a(10);
      this.r.a(new fit(this.k, this.o));
      this.c = this.r.a(fhm.a(wt.p, $$0 -> this.b.a(fmc.a)).a());
      this.c.j = false;
      this.r.a();
      this.r.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fkx.a(this.r, this.H());
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
