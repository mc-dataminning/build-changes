public class csb extends crq {
   private static final ajx<Boolean> c = akb.a(csb.class, ajz.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public fbx b = fbx.c;

   public csb(bvi<? extends csb> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().w_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.b = fbx.c;
         }

         this.r(this.i > 0);
      }

      if (this.q() && this.ae.a(4) == 0) {
         this.dU().a(lt.aa, this.dz(), this.dB() + 0.8, this.dF(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(ard $$0) {
      return this.bj() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected cxd o() {
      return cxl.os;
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.os);
   }

   @Override
   protected fbx a(fbx $$0) {
      fbx $$1;
      if (this.b.h() > 1.0E-7) {
         this.b = this.k($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.b);
         if (this.bj()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private fbx k(fbx $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(awy.bP) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.ds().d($$0.ds()).f();
      }

      return bsy.a;
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      double $$1 = $$0.k("PushX");
      double $$2 = $$0.k("PushZ");
      this.b = new fbx($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean q() {
      return this.al.a(c);
   }

   protected void r(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public dxq v() {
      return dkg.cL.m().b(dnn.a, jn.c).b(dnn.b, Boolean.valueOf(this.q()));
   }
}
