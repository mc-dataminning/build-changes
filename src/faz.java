public class faz extends eya {
   private static final int a = 600;
   private final sg b;
   private esg c;
   private int k;
   private final evt l = evt.d();

   public faz(tf $$0, sg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected void aC_() {
      this.l.c().b().a(10);
      this.l.a(new etm(this.e, this.i));
      this.c = this.l.a(esg.a(te.p, $$0 -> this.b.a(ewu.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         ese var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      evn.a(this.l, this.s());
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
