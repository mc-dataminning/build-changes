import javax.annotation.Nullable;

public class cqf extends cqd {
   private static final int e = 600;
   private static final int f = -1;
   private static final alc<Integer> g = alg.a(cqf.class, ale.b);
   private static final byte h = 0;

   public cqf(bvq<? extends cqf> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqf(dhh $$0, double $$1, double $$2, double $$3, cxo $$4, @Nullable cxo $$5) {
      super(bvq.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.G();
   }

   public cqf(dhh $$0, bwf $$1, cxo $$2, @Nullable cxo $$3) {
      super(bvq.g, $$1, $$0, $$2, $$3);
      this.G();
   }

   private czn F() {
      return this.v().a(ku.Q, czn.a);
   }

   private void a(czn $$0) {
      this.v().b(ku.Q, $$0);
      this.G();
   }

   @Override
   protected void a(cxo $$0) {
      super.a($$0);
      this.G();
   }

   private void G() {
      czn $$0 = this.F();
      this.al.a(g, $$0.equals(czn.a) ? -1 : $$0.b());
   }

   public void a(buo $$0) {
      this.a(this.F().a($$0));
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
         if (this.a) {
            if (this.b % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.a && this.b != 0 && !this.F().equals(czn.a) && this.b >= 600) {
         this.dW().a(this, (byte)0);
         this.a(new cxo(cxs.oS));
      }
   }

   private void b(int $$0) {
      int $$1 = this.C();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dW().a(ll.a(ls.u, $$1), this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int C() {
      return this.al.a(g);
   }

   @Override
   protected void a(bwf $$0) {
      super.a($$0);
      bvj $$1 = this.D();
      czn $$2 = this.F();
      if ($$2.e().isPresent()) {
         for (buo $$3 : $$2.e().get().a().a()) {
            $$0.b(new buo($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (buo $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cxo u() {
      return new cxo(cxs.oS);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.C();
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
