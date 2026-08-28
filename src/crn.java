import javax.annotation.Nullable;

public class crn extends crk {
   private static final int d = 600;
   private static final int e = -1;
   private static final akj<Integer> f = akn.a(crn.class, akl.b);
   private static final byte g = 0;

   public crn(bwo<? extends crn> $$0, dja $$1) {
      super($$0, $$1);
   }

   public crn(dja $$0, double $$1, double $$2, double $$3, czd $$4, @Nullable czd $$5) {
      super(bwo.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.D();
   }

   public crn(dja $$0, bxe $$1, czd $$2, @Nullable czd $$3) {
      super(bwo.g, $$1, $$0, $$2, $$3);
      this.D();
   }

   private daz B() {
      return this.s().a(kj.R, daz.a);
   }

   private float C() {
      return this.s().a(kj.S, 1.0F);
   }

   private void a(daz $$0) {
      this.s().b(kj.R, $$0);
      this.D();
   }

   @Override
   protected void a(czd $$0) {
      super.a($$0);
      this.D();
   }

   private void D() {
      daz $$0 = this.B();
      this.al.a(f, $$0.equals(daz.a) ? -1 : $$0.b());
   }

   public void a(bvj $$0) {
      this.a(this.B().a($$0));
   }

   @Override
   protected void a(akn.a $$0) {
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
      } else if (this.f() && this.a != 0 && !this.B().equals(daz.a) && this.a >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new czd(czh.pk));
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
   protected void a(bxe $$0) {
      super.a($$0);
      bwf $$1 = this.z();
      daz $$2 = this.B();
      float $$3 = this.C();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected czd o() {
      return new czd(czh.pk);
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
