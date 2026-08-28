import javax.annotation.Nullable;

public class crc extends cqz {
   private static final int d = 600;
   private static final int e = -1;
   private static final akh<Integer> f = akl.a(crc.class, akj.b);
   private static final byte g = 0;

   public crc(bwj<? extends crc> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crc(dip $$0, double $$1, double $$2, double $$3, cys $$4, @Nullable cys $$5) {
      super(bwj.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.D();
   }

   public crc(dip $$0, bwz $$1, cys $$2, @Nullable cys $$3) {
      super(bwj.g, $$1, $$0, $$2, $$3);
      this.D();
   }

   private dao B() {
      return this.s().a(kj.R, dao.a);
   }

   private float C() {
      return this.s().a(kj.S, 1.0F);
   }

   private void a(dao $$0) {
      this.s().b(kj.R, $$0);
      this.D();
   }

   @Override
   protected void a(cys $$0) {
      super.a($$0);
      this.D();
   }

   private void D() {
      dao $$0 = this.B();
      this.al.a(f, $$0.equals(dao.a) ? -1 : $$0.b());
   }

   public void a(bve $$0) {
      this.a(this.B().a($$0));
   }

   @Override
   protected void a(akl.a $$0) {
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
      } else if (this.f() && this.a != 0 && !this.B().equals(dao.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cys(cyw.pf));
      }
   }

   private void b(int $$0) {
      int $$1 = this.y();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dV().a(lq.a(lx.u, $$1), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int y() {
      return this.al.a(f);
   }

   @Override
   protected void a(bwz $$0) {
      super.a($$0);
      bwa $$1 = this.z();
      dao $$2 = this.B();
      float $$3 = this.C();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected cys o() {
      return new cys(cyw.pf);
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
               this.dV().a(lq.a(lx.u, $$2, $$3, $$4), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
