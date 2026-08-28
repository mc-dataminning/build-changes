import javax.annotation.Nullable;

public class cqg extends cqe {
   private static final int e = 600;
   private static final int f = -1;
   private static final alc<Integer> g = alg.a(cqg.class, ale.b);
   private static final byte h = 0;

   public cqg(bvr<? extends cqg> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqg(dhi $$0, double $$1, double $$2, double $$3, cxp $$4, @Nullable cxp $$5) {
      super(bvr.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.H();
   }

   public cqg(dhi $$0, bwg $$1, cxp $$2, @Nullable cxp $$3) {
      super(bvr.g, $$1, $$0, $$2, $$3);
      this.H();
   }

   private czo G() {
      return this.w().a(ku.Q, czo.a);
   }

   private void a(czo $$0) {
      this.w().b(ku.Q, $$0);
      this.H();
   }

   @Override
   protected void a(cxp $$0) {
      super.a($$0);
      this.H();
   }

   private void H() {
      czo $$0 = this.G();
      this.al.a(g, $$0.equals(czo.a) ? -1 : $$0.b());
   }

   public void a(bup $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(g, -1);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         if (this.l()) {
            if (this.b % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.l() && this.b != 0 && !this.G().equals(czo.a) && this.b >= 600) {
         this.dW().a(this, (byte)0);
         this.a(new cxp(cxt.oS));
      }
   }

   private void b(int $$0) {
      int $$1 = this.D();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dW().a(ll.a(ls.u, $$1), this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int D() {
      return this.al.a(g);
   }

   @Override
   protected void a(bwg $$0) {
      super.a($$0);
      bvk $$1 = this.E();
      czo $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (bup $$3 : $$2.e().get().a().a()) {
            $$0.b(new bup($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bup $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cxp v() {
      return new cxp(cxt.oS);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.D();
         if ($$1 != -1) {
            float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dW().a(ll.a(ls.u, $$2, $$3, $$4), this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
