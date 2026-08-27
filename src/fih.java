public abstract class fih<T extends clr> extends fig<T> implements flb {
   public final fkr x;
   private boolean y;
   private final ajh z;
   private final ajh A;
   private final ajh B;

   public fih(T $$0, fkr $$1, cit $$2, vu $$3, ajh $$4, ajh $$5, ajh $$6) {
      super($$0, $$2, $$3);
      this.x = $$1;
      this.z = $$4;
      this.A = $$5;
      this.B = $$6;
   }

   @Override
   public void aO_() {
      super.aO_();
      this.y = this.g < 379;
      this.x.a(this.g, this.h, this.f, this.y, this.p);
      this.t = this.x.a(this.g, this.c);
      this.c(new fbu(this.t + 20, this.h / 2 - 49, 20, 18, fkv.a, $$0 -> {
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
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
   protected void a(fav $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(this.z, $$4, $$5, 0, 0, this.c, this.k);
      if (this.p.s()) {
         int $$6 = 14;
         int $$7 = aww.f(this.p.r() * 13.0F) + 1;
         $$0.a(this.A, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = aww.f(this.p.q() * 24.0F);
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
   protected void a(cnl $$0, int $$1, int $$2, clz $$3) {
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
   public fkv J() {
      return this.x;
   }
}
