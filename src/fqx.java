public class fqx extends fqk {
   private final fpx a;
   private final frh c;

   public fqx(int $$0, int $$1, int $$2, int $$3, wv $$4, fpx $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.c = new frh($$4, $$5).d(this.A() - this.b());
   }

   public fqx a(int $$0) {
      this.c.c($$0);
      return this;
   }

   @Override
   public void h(int $$0) {
      super.h($$0);
      this.c.d(this.A() - this.b());
   }

   @Override
   protected int c() {
      return this.c.y();
   }

   @Override
   protected double o() {
      return 9.0;
   }

   @Override
   protected void c(fpz $$0) {
      super.c($$0);
   }

   public boolean q() {
      return super.j();
   }

   @Override
   protected void c(fpz $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.e(), (float)this.p(), 0.0F);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(fuk $$0) {
      $$0.a(fuj.a, this.B());
   }

   @Override
   public void b(wv $$0) {
      super.b($$0);
      this.c.b($$0);
   }
}
