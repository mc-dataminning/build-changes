public class fea extends faz {
   private static final int a = 600;
   private final tw b;
   private eve c;
   private int k;
   private final eys l = eys.d();

   public fea(uv $$0, tw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aQ_() {
      this.l.c().b().a(10);
      this.l.a(new ewl(this.e, this.i));
      this.c = this.l.a(eve.a(uu.p, $$0 -> this.b.a(ezt.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      eym.a(this.l, this.s());
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
