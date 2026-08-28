import javax.annotation.Nullable;

public class cqu extends cpv {
   private static final aks<Byte> e = akw.a(cqu.class, aku.a);
   private static final aks<Boolean> f = akw.a(cqu.class, aku.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public cqu(bvi<? extends cqu> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqu(dgz $$0, bvx $$1, cxg $$2) {
      super(bvi.bz, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public cqu(dgz $$0, double $$1, double $$2, double $$3, cxg $$4) {
      super(bvi.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bvb $$0 = this.p();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (this.dW() instanceof arx $$2 && this.b == cpv.a.b) {
               this.a($$2, this.u(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cpo) && this.du().f($$0.bF()) < (double)$$0.dr() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fbr $$3 = $$0.bF().d(this.du());
            this.o(this.dB(), this.dD() + $$3.e * 0.015 * (double)$$1, this.dH());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dz().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awv.Ar, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean G() {
      bvb $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof ary) || !$$0.aa_();
   }

   @Override
   public boolean D() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fbo c(fbr $$0, fbr $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fbo $$0) {
      bvb $$1 = $$0.a();
      float $$2 = 8.0F;
      bvb $$3 = this.p();
      btr $$4 = this.dX().a(this, (bvb)($$3 == null ? this : $$3));
      if (this.dW() instanceof arx $$5) {
         $$2 = dds.a($$5, this.ea(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bvi.O) {
            return;
         }

         if (this.dW() instanceof arx $$6) {
            dds.a($$6, $$1, $$4, this.ea(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bvx $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cqi.b, $$1, this.p(), false);
      this.h(this.dz().d(0.02, 0.2, 0.02));
      this.a(awv.Ap, 1.0F, 1.0F);
   }

   @Override
   protected void a(arx $$0, fbn $$1, cxg $$2) {
      fbr $$3 = $$1.b().a($$1.g());
      dds.a($$0, $$2, this.p() instanceof bvx $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cxg ea() {
      return this.w();
   }

   @Override
   protected boolean a(cpo $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gi().f(this.u());
   }

   @Override
   protected cxg v() {
      return new cxg(cxk.wS);
   }

   @Override
   protected awu s() {
      return awv.Aq;
   }

   @Override
   public void a_(cpo $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(e, this.b(this.w()));
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cxg $$0) {
      return this.dW() instanceof arx $$1 ? (byte)azu.a(dds.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.al.a(e);
      if (this.b != cpv.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float A() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
