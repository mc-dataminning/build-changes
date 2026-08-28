public class fpd extends fop {
   private final foc a;
   private final fpn c;

   public fpd(int $$0, int $$1, int $$2, int $$3, wp $$4, foc $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.c = new fpn($$4, $$5).d(this.A() - this.b());
   }

   public fpd a(int $$0) {
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
   protected void c(foe $$0) {
      if (this.j()) {
         super.c($$0);
      } else if (this.aM_()) {
         this.a($$0, this.F() - this.a(), this.G() - this.a(), this.A() + this.b(), this.y() + this.b());
      }
   }

   @Override
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (!this.j()) {
            this.c($$0);
            $$0.c().a();
            $$0.c().a((float)this.F(), (float)this.G(), 0.0F);
            this.c.a($$0, $$1, $$2, $$3);
            $$0.c().b();
         } else {
            super.b($$0, $$1, $$2, $$3);
         }
      }
   }

   public boolean q() {
      return super.j();
   }

   @Override
   protected void c(foe $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.e(), (float)this.p(), 0.0F);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(fsq $$0) {
      $$0.a(fsp.a, this.B());
   }
}
