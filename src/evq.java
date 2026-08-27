public abstract class evq<T extends cbg> extends evp<T> implements eyi {
   private static final acq x = new acq("textures/gui/recipe_button.png");
   public final exy w;
   private boolean y;
   private final acq z;

   public evq(T $$0, exy $$1, byn $$2, sw $$3, acq $$4) {
      super($$0, $$2, $$3);
      this.w = $$1;
      this.z = $$4;
   }

   @Override
   public void b() {
      super.b();
      this.y = this.g < 379;
      this.w.a(this.g, this.h, this.f, this.y, this.p);
      this.s = this.w.a(this.g, this.c);
      this.d(new ept(this.s + 20, this.h / 2 - 49, 20, 18, 0, 0, 19, x, $$0 -> {
         this.w.f();
         this.s = this.w.a(this.g, this.c);
         $$0.b(this.s + 20, this.h / 2 - 49);
      }));
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   public void B() {
      super.B();
      this.w.h();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      if (this.w.g() && this.y) {
         this.a($$0, $$3, $$1, $$2);
         this.w.a($$0, $$1, $$2, $$3);
      } else {
         this.w.a($$0, $$1, $$2, $$3);
         super.a($$0, $$1, $$2, $$3);
         this.w.a($$0, this.s, this.t, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.w.a($$0, this.s, this.t, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.s;
      int $$5 = this.t;
      $$0.a(this.z, $$4, $$5, 0, 0, this.c, this.k);
      if (this.p.s()) {
         int $$6 = this.p.r();
         $$0.a(this.z, $$4 + 56, $$5 + 36 + 12 - $$6, 176, 12 - $$6, 14, $$6 + 1);
      }

      int $$7 = this.p.q();
      $$0.a(this.z, $$4 + 79, $$5 + 34, 176, 14, $$7 + 1, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.w.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.y && this.w.g() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ccx $$0, int $$1, int $$2, cbo $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.w.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.w.a($$0, $$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      return this.w.a($$0, $$1, this.s, this.t, this.c, this.k, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.w.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void D() {
      this.w.i();
   }

   @Override
   public eyc E() {
      return this.w;
   }
}
