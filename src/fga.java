public class fga extends fcz {
   private static final int a = 600;
   private final ug b;
   private exe c;
   private int k;
   private final fas l = fas.d();

   public fga(vf $$0, ug $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.l.c().b().a(10);
      this.l.a(new eyl(this.e, this.i));
      this.c = this.l.a(exe.a(ve.p, $$0 -> this.b.a(fbt.a)).a());
      this.c.j = false;
      this.l.a();
      this.l.a($$1 -> {
         exc var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fam.a(this.l, this.F());
   }

   @Override
   public void d() {
      super.d();
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
