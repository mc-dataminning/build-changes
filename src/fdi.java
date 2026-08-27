public class fdi extends fah {
   private static final int a = 600;
   private final ts b;
   private eum c;
   private int k;
   private final eya l = eya.d();

   public fdi(ur $$0, ts $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.l.c().b().a(10);
      this.l.a(new evt(this.e, this.i));
      this.c = this.l.a(eum.a(uq.p, $$0 -> this.b.a(ezb.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         euk var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      exu.a(this.l, this.s());
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
