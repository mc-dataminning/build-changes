public class fao extends fac<cge> implements fcw {
   private static final afw x = new afw("textures/gui/container/crafting_table.png");
   private final fcq y = new fcq();
   private boolean z;

   public fao(cge $$0, ccw $$1, ui $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.z = this.g < 379;
      this.y.a(this.g, this.h, this.f, this.z, this.p);
      this.t = this.y.a(this.g, this.c);
      this.d(new etv(this.t + 5, this.h / 2 - 49, 20, 18, fcq.a, $$0 -> {
         this.y.f();
         this.t = this.y.a(this.g, this.c);
         $$0.b(this.t + 5, this.h / 2 - 49);
      }));
      this.e(this.y);
      this.c(this.y);
      this.l = 29;
   }

   @Override
   public void C() {
      super.C();
      this.y.h();
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      if (this.y.g() && this.z) {
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
   protected void a(esy $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.z || !this.y.g()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.y.a($$0, $$1, $$2)) {
         this.a(this.y);
         return true;
      } else {
         return this.z && this.y.g() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      return this.y.a($$0, $$1, this.t, this.u, this.c, this.k, $$4) && $$5;
   }

   @Override
   protected void a(chh $$0, int $$1, int $$2, cfy $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.y.a($$0);
   }

   @Override
   public void E() {
      this.y.i();
   }

   @Override
   public fcq F() {
      return this.y;
   }
}
