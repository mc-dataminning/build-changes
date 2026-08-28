import javax.annotation.Nullable;

public class cru extends crr {
   private static final int d = 600;
   private static final int e = -1;
   private static final akj<Integer> f = akn.a(cru.class, akl.b);
   private static final byte g = 0;

   public cru(bwr<? extends cru> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cru(djh $$0, double $$1, double $$2, double $$3, czk $$4, @Nullable czk $$5) {
      super(bwr.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.D();
   }

   public cru(djh $$0, bxj $$1, czk $$2, @Nullable czk $$3) {
      super(bwr.g, $$1, $$0, $$2, $$3);
      this.D();
   }

   private dbg B() {
      return this.s().a(kk.R, dbg.a);
   }

   private float C() {
      return this.s().a(kk.S, 1.0F);
   }

   private void a(dbg $$0) {
      this.s().b(kk.R, $$0);
      this.D();
   }

   @Override
   protected void a(czk $$0) {
      super.a($$0);
      this.D();
   }

   private void D() {
      dbg $$0 = this.B();
      this.al.a(f, $$0.equals(dbg.a) ? -1 : $$0.b());
   }

   public void a(bvm $$0) {
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
      if (this.dU().C) {
         if (this.f()) {
            if (this.a % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.f() && this.a != 0 && !this.B().equals(dbg.a) && this.a >= 600) {
         this.dU().a(this, (byte)0);
         this.a(new czk(czo.pk));
      }
   }

   private void b(int $$0) {
      int $$1 = this.y();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dU().a(lr.a(ly.u, $$1), this.d(0.5), this.dC(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int y() {
      return this.al.a(f);
   }

   @Override
   protected void a(bxj $$0) {
      super.a($$0);
      bwi $$1 = this.z();
      dbg $$2 = this.B();
      float $$3 = this.C();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected czk o() {
      return new czk(czo.pk);
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
               this.dU().a(lr.a(ly.u, $$2, $$3, $$4), this.d(0.5), this.dC(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
