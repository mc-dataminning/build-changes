public class fit extends fig<cmh> implements flb {
   private static final ajh x = new ajh("textures/gui/container/crafting_table.png");
   private final fkv y = new fkv();
   private boolean z;

   public fit(cmh $$0, cit $$1, vu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.z = this.g < 379;
      this.y.a(this.g, this.h, this.f, this.z, this.p);
      this.t = this.y.a(this.g, this.c);
      this.c(new fbu(this.t + 5, this.h / 2 - 49, 20, 18, fkv.a, $$0 -> {
         this.y.e();
         this.t = this.y.a(this.g, this.c);
         $$0.c(this.t + 5, this.h / 2 - 49);
      }));
      this.d(this.y);
      this.l = 29;
   }

   @Override
   public void E() {
      super.E();
      this.y.g();
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      if (this.y.f() && this.z) {
         this.b($$0, $$1, $$2, $$3);
         this.y.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.y.a($$0, $$1, $$2, $$3);
         this.y.a($$0, this.t, this.u, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.y.a($$0, this.t, this.u, $$1, $$2);
   }

   @Override
   protected void a(fav $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.y.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.y.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.z || !this.y.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.y.a($$0, $$1, $$2)) {
         this.a(this.y);
         return true;
      } else {
         return this.z && this.y.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      return this.y.a($$0, $$1, this.t, this.u, this.c, this.k, $$4) && $$5;
   }

   @Override
   protected void a(cnl $$0, int $$1, int $$2, clz $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.y.a($$0);
   }

   @Override
   public void I() {
      this.y.i();
   }

   @Override
   public fkv J() {
      return this.y;
   }
}
