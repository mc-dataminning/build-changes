public class etr extends esh {
   private float a = 0.5F;

   public etr(tl $$0, erx $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public etr(int $$0, int $$1, tl $$2, erx $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public etr(int $$0, int $$1, int $$2, int $$3, tl $$4, erx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public etr i(int $$0) {
      super.a($$0);
      return this;
   }

   private etr b(float $$0) {
      this.a = $$0;
      return this;
   }

   public etr e() {
      return this.b(0.0F);
   }

   public etr f() {
      return this.b(0.5F);
   }

   public etr g() {
      return this.b(1.0F);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      tl $$4 = this.m();
      erx $$5 = this.a();
      int $$6 = this.l();
      int $$7 = $$5.a($$4);
      int $$8 = this.r() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.t() + (this.i() - 9) / 2;
      arn $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private arn a(tl $$0, int $$1) {
      erx $$2 = this.a();
      tq $$3 = $$2.a($$0, $$1 - $$2.a(tk.t));
      return qr.a().a(tq.a($$3, tk.t));
   }
}
