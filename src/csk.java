import javax.annotation.Nullable;

public class csk extends csh {
   private static final int d = 600;
   private static final int e = -1;
   private static final akn<Integer> f = akr.a(csk.class, akp.b);
   private static final byte g = 0;

   public csk(bxe<? extends csk> $$0, djz $$1) {
      super($$0, $$1);
   }

   public csk(djz $$0, double $$1, double $$2, double $$3, daa $$4, @Nullable daa $$5) {
      super(bxe.h, $$1, $$2, $$3, $$0, $$4, $$5);
      this.D();
   }

   public csk(djz $$0, bxw $$1, daa $$2, @Nullable daa $$3) {
      super(bxe.h, $$1, $$0, $$2, $$3);
      this.D();
   }

   private dbw B() {
      return this.s().a(kl.R, dbw.a);
   }

   private float C() {
      return this.s().a(kl.S, 1.0F);
   }

   private void a(dbw $$0) {
      this.s().b(kl.R, $$0);
      this.D();
   }

   @Override
   protected void a(daa $$0) {
      super.a($$0);
      this.D();
   }

   private void D() {
      dbw $$0 = this.B();
      this.al.a(f, $$0.equals(dbw.a) ? -1 : $$0.b());
   }

   public void a(bvz $$0) {
      this.a(this.B().a($$0));
   }

   @Override
   protected void a(akr.a $$0) {
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
      } else if (this.f() && this.a != 0 && !this.B().equals(dbw.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new daa(dae.pk));
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
   protected void a(bxw $$0) {
      super.a($$0);
      bwv $$1 = this.z();
      dbw $$2 = this.B();
      float $$3 = this.C();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected daa o() {
      return new daa(dae.pk);
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
