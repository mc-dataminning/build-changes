import javax.annotation.Nullable;

public class cqr extends cqp {
   private static final int d = 600;
   private static final int e = -1;
   private static final akg<Integer> f = akk.a(cqr.class, aki.b);
   private static final byte g = 0;

   public cqr(bwb<? extends cqr> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cqr(dhp $$0, double $$1, double $$2, double $$3, cxy $$4, @Nullable cxy $$5) {
      super(bwb.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.D();
   }

   public cqr(dhp $$0, bwr $$1, cxy $$2, @Nullable cxy $$3) {
      super(bwb.g, $$1, $$0, $$2, $$3);
      this.D();
   }

   private czu B() {
      return this.s().a(kx.R, czu.a);
   }

   private float C() {
      return this.s().a(kx.S, 1.0F);
   }

   private void a(czu $$0) {
      this.s().b(kx.R, $$0);
      this.D();
   }

   @Override
   protected void a(cxy $$0) {
      super.a($$0);
      this.D();
   }

   private void D() {
      czu $$0 = this.B();
      this.al.a(f, $$0.equals(czu.a) ? -1 : $$0.b());
   }

   public void a(buw $$0) {
      this.a(this.B().a($$0));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(f, -1);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.f()) {
            if (this.a % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.f() && this.a != 0 && !this.B().equals(czu.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cxy(cyc.pf));
      }
   }

   private void b(int $$0) {
      int $$1 = this.y();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dV().a(lo.a(lv.u, $$1), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int y() {
      return this.al.a(f);
   }

   @Override
   protected void a(bwr $$0) {
      super.a($$0);
      bvs $$1 = this.z();
      czu $$2 = this.B();
      float $$3 = this.C();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected cxy o() {
      return new cxy(cyc.pf);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.y();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dV().a(lo.a(lv.u, $$2, $$3, $$4), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
