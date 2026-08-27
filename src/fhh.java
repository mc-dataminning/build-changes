public abstract class fhh<T extends ckv> extends fhg<T> implements fkb {
   public final fjr x;
   private boolean y;
   private final ajc z;
   private final ajc A;
   private final ajc B;

   public fhh(T $$0, fjr $$1, chz $$2, vs $$3, ajc $$4, ajc $$5, ajc $$6) {
      super($$0, $$2, $$3);
      this.x = $$1;
      this.z = $$4;
      this.A = $$5;
      this.B = $$6;
   }

   @Override
   public void aP_() {
      super.aP_();
      this.y = this.g < 379;
      this.x.a(this.g, this.h, this.f, this.y, this.p);
      this.t = this.x.a(this.g, this.c);
      this.c(new faw(this.t + 20, this.h / 2 - 49, 20, 18, fjv.a, $$0 -> {
         this.x.e();
         this.t = this.x.a(this.g, this.c);
         $$0.c(this.t + 20, this.h / 2 - 49);
      }));
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   public void E() {
      super.E();
      this.x.g();
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      if (this.x.f() && this.y) {
         this.b($$0, $$1, $$2, $$3);
         this.x.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.x.a($$0, $$1, $$2, $$3);
         this.x.a($$0, this.t, this.u, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.x.a($$0, this.t, this.u, $$1, $$2);
   }

   @Override
   protected void a(ezx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(this.z, $$4, $$5, 0, 0, this.c, this.k);
      if (this.p.s()) {
         int $$6 = 14;
         int $$7 = awm.f(this.p.r() * 13.0F) + 1;
         $$0.a(this.A, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = awm.f(this.p.q() * 24.0F);
      $$0.a(this.B, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.x.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.y && this.x.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(cmp $$0, int $$1, int $$2, cld $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.x.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.x.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      return this.x.a($$0, $$1, this.t, this.u, this.c, this.k, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.x.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void I() {
      this.x.i();
   }

   @Override
   public fjv J() {
      return this.x;
   }
}
