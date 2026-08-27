public class fdv extends fau {
   private static final int a = 600;
   private final ts b;
   private euz c;
   private int k;
   private final eyn l = eyn.d();

   public fdv(ur $$0, ts $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.l.c().b().a(10);
      this.l.a(new ewg(this.e, this.i));
      this.c = this.l.a(euz.a(uq.p, $$0 -> this.b.a(ezo.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         eux var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      eyh.a(this.l, this.s());
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
