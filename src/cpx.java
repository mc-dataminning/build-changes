import javax.annotation.Nullable;

public class cpx extends cpv {
   private static final int d = 600;
   private static final int e = -1;
   private static final aks<Integer> f = akw.a(cpx.class, aku.b);
   private static final byte g = 0;

   public cpx(bvi<? extends cpx> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cpx(dgz $$0, double $$1, double $$2, double $$3, cxg $$4, @Nullable cxg $$5) {
      super(bvi.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.H();
   }

   public cpx(dgz $$0, bvx $$1, cxg $$2, @Nullable cxg $$3) {
      super(bvi.g, $$1, $$0, $$2, $$3);
      this.H();
   }

   private czf G() {
      return this.w().a(ku.Q, czf.a);
   }

   private void a(czf $$0) {
      this.w().b(ku.Q, $$0);
      this.H();
   }

   @Override
   protected void a(cxg $$0) {
      super.a($$0);
      this.H();
   }

   private void H() {
      czf $$0 = this.G();
      this.al.a(f, $$0.equals(czf.a) ? -1 : $$0.b());
   }

   public void a(bug $$0) {
      this.a(this.G().a($$0));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(f, -1);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         if (this.l()) {
            if (this.a % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.l() && this.a != 0 && !this.G().equals(czf.a) && this.a >= 600) {
         this.dW().a(this, (byte)0);
         this.a(new cxg(cxk.pb));
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
      return this.al.a(f);
   }

   @Override
   protected void a(bvx $$0) {
      super.a($$0);
      bvb $$1 = this.E();
      czf $$2 = this.G();
      if ($$2.e().isPresent()) {
         for (bug $$3 : $$2.e().get().a().a()) {
            $$0.b(new bug($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (bug $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cxg v() {
      return new cxg(cxk.pb);
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
