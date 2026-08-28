import javax.annotation.Nullable;

public class cst extends csq {
   private static final int d = 600;
   private static final int e = -1;
   private static final aku<Integer> f = aky.a(cst.class, akw.b);
   private static final byte g = 0;

   public cst(bxn<? extends cst> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public cst(dkj $$0, double $$1, double $$2, double $$3, dak $$4, @Nullable dak $$5) {
      super(bxn.h, $$1, $$2, $$3, $$0, $$4, $$5);
      this.D();
   }

   public cst(dkj $$0, byf $$1, dak $$2, @Nullable dak $$3) {
      super(bxn.h, $$1, $$0, $$2, $$3);
      this.D();
   }

   private dcg B() {
      return this.s().a(kl.R, dcg.a);
   }

   private float C() {
      return this.s().a(kl.S, 1.0F);
   }

   private void a(dcg $$0) {
      this.s().b(kl.R, $$0);
      this.D();
   }

   @Override
   protected void a(dak $$0) {
      super.a($$0);
      this.D();
   }

   private void D() {
      dcg $$0 = this.B();
      this.al.a(f, $$0.equals(dcg.a) ? -1 : $$0.b());
   }

   public void a(bwi $$0) {
      this.a(this.B().a($$0));
   }

   @Override
   protected void a(aky.a $$0) {
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
      } else if (this.f() && this.a != 0 && !this.B().equals(dcg.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new dak(dao.pk));
      }
   }

   private void b(int $$0) {
      int $$1 = this.y();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dV().a(ls.a(lz.u, $$1), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int y() {
      return this.al.a(f);
   }

   @Override
   protected void a(byf $$0) {
      super.a($$0);
      bxe $$1 = this.z();
      dcg $$2 = this.B();
      float $$3 = this.C();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected dak o() {
      return new dak(dao.pk);
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
               this.dV().a(ls.a(lz.u, $$2, $$3, $$4), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
