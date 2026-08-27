public class fay extends exz {
   private static final int a = 600;
   private final sg b;
   private esh c;
   private int k;
   private final evs l = evs.d();

   public fay(tf $$0, sg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected void aE_() {
      this.l.c().b().a(10);
      this.l.a(new etm(this.e, this.i));
      this.c = this.l.a(esh.a(te.p, $$0 -> this.b.a(ewt.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         esf var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      evm.a(this.l, this.s());
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
