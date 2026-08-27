public class fcd extends ezd {
   private static final int a = 600;
   private final tj b;
   private etj c;
   private int k;
   private final ewx l = ewx.d();

   public fcd(ui $$0, tj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aB_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.l.c().b().a(10);
      this.l.a(new euq(this.e, this.i));
      this.c = this.l.a(etj.a(uh.p, $$0 -> this.b.a(exy.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      ewr.a(this.l, this.s());
   }

   @Override
   public void d() {
      super.d();
      this.k++;
      if (this.k == 600) {
         this.c.i = true;
      }

      if (this.b.k()) {
         this.b.d();
      } else {
         this.b.p();
      }
   }
}
