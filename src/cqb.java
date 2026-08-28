import javax.annotation.Nullable;

public class cqb extends cpz {
   private static final int e = 600;
   private static final int f = -1;
   private static final alc<Integer> g = alg.a(cqb.class, ale.b);
   private static final byte h = 0;

   public cqb(bvm<? extends cqb> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqb(dha $$0, double $$1, double $$2, double $$3, cxk $$4, @Nullable cxk $$5) {
      super(bvm.g, $$1, $$2, $$3, $$0, $$4, $$5);
      this.G();
   }

   public cqb(dha $$0, bwb $$1, cxk $$2, @Nullable cxk $$3) {
      super(bvm.g, $$1, $$0, $$2, $$3);
      this.G();
   }

   private czj F() {
      return this.v().a(ku.Q, czj.a);
   }

   private void a(czj $$0) {
      this.v().b(ku.Q, $$0);
      this.G();
   }

   @Override
   protected void a(cxk $$0) {
      super.a($$0);
      this.G();
   }

   private void G() {
      czj $$0 = this.F();
      this.al.a(g, $$0.equals(czj.a) ? -1 : $$0.b());
   }

   public void a(buk $$0) {
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
      if (this.dV().C) {
         if (this.a) {
            if (this.b % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.a && this.b != 0 && !this.F().equals(czj.a) && this.b >= 600) {
         this.dV().a(this, (byte)0);
         this.a(new cxk(cxo.oS));
      }
   }

   private void b(int $$0) {
      int $$1 = this.C();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.dV().a(ll.a(ls.u, $$1), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int C() {
      return this.al.a(g);
   }

   @Override
   protected void a(bwb $$0) {
      super.a($$0);
      bvf $$1 = this.D();
      czj $$2 = this.F();
      if ($$2.e().isPresent()) {
         for (buk $$3 : $$2.e().get().a().a()) {
            $$0.b(new buk($$3.c(), Math.max($$3.a($$0x -> $$0x / 8), 1), $$3.e(), $$3.f(), $$3.g()), $$1);
         }
      }

      for (buk $$4 : $$2.d()) {
         $$0.b($$4, $$1);
      }
   }

   @Override
   protected cxk u() {
      return new cxk(cxo.oS);
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
               this.dV().a(ll.a(ls.u, $$2, $$3, $$4), this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
