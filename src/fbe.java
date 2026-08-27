public class fbe extends eye {
   private static final int a = 600;
   private final sm b;
   private esk c;
   private int k;
   private final evy l = evy.d();

   public fbe(tl $$0, sm $$1) {
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
      this.l.a(new etr(this.e, this.i));
      this.c = this.l.a(esk.a(tk.p, $$0 -> this.b.a(ewz.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         esi var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      evs.a(this.l, this.s());
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
