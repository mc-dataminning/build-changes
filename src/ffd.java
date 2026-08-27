public class ffd extends fcc {
   private static final int a = 600;
   private final uc b;
   private ewh c;
   private int k;
   private final ezv l = ezv.d();

   public ffd(vb $$0, uc $$1) {
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
      this.l.a(new exo(this.e, this.i));
      this.c = this.l.a(ewh.a(va.p, $$0 -> this.b.a(faw.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      ezp.a(this.l, this.s());
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
