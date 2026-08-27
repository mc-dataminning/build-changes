public abstract class eyu<T extends ced> extends eyt<T> implements fbn {
   public final fbd x;
   private boolean y;
   private final aep z;
   private final aep A;
   private final aep B;

   public eyu(T $$0, fbd $$1, cbk $$2, te $$3, aep $$4, aep $$5, aep $$6) {
      super($$0, $$2, $$3);
      this.x = $$1;
      this.z = $$4;
      this.A = $$5;
      this.B = $$6;
   }

   @Override
   public void aE_() {
      super.aE_();
      this.y = this.g < 379;
      this.x.a(this.g, this.h, this.f, this.y, this.p);
      this.t = this.x.a(this.g, this.c);
      this.d(new esu(this.t + 20, this.h / 2 - 49, 20, 18, fbh.a, $$0 -> {
         this.x.f();
         this.t = this.x.a(this.g, this.c);
         $$0.b(this.t + 20, this.h / 2 - 49);
      }));
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   public void B() {
      super.B();
      this.x.h();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      if (this.x.g() && this.y) {
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
   protected void a(erx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(this.z, $$4, $$5, 0, 0, this.c, this.k);
      if (this.p.s()) {
         int $$6 = this.p.r();
         $$0.a(this.A, 14, 14, 0, 12 - $$6, $$4 + 56, $$5 + 36 + 12 - $$6, 14, $$6 + 1);
      }

      int $$7 = this.p.q();
      $$0.a(this.B, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$7 + 1, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.x.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.y && this.x.g() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(cfu $$0, int $$1, int $$2, cel $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.x.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.x.a($$0, $$1, $$2) ? false : super.a($$0, $$1, $$2);
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
   public void D() {
      this.x.i();
   }

   @Override
   public fbh E() {
      return this.x;
   }
}
