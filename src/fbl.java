public class fbl extends eym {
   private static final int a = 600;
   private final so b;
   private ess c;
   private int k;
   private final ewf l = ewf.d();

   public fbl(tn $$0, so $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected void aH_() {
      this.l.c().b().a(10);
      this.l.a(new ety(this.e, this.i));
      this.c = this.l.a(ess.a(tm.p, $$0 -> this.b.a(exg.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         esq var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      evz.a(this.l, this.s());
   }

   @Override
   public void c() {
      super.c();
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
