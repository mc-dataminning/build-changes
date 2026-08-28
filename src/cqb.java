import javax.annotation.Nullable;

public class cqb extends cpc {
   private static final ajx<Byte> e = akb.a(cqb.class, ajz.a);
   private static final ajx<Boolean> f = akb.a(cqb.class, ajz.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public cqb(buq<? extends cqb> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cqb(dgg $$0, bvf $$1, cwn $$2) {
      super(buq.by, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public cqb(dgg $$0, double $$1, double $$2, double $$3, cwn $$4) {
      super(buq.by, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      buj $$0 = this.p();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (this.dW() instanceof arc $$2 && this.b == cpc.a.b) {
               this.a($$2, this.u(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cov) && this.du().f($$0.bF()) < (double)$$0.dr() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fay $$3 = $$0.bF().d(this.du());
            this.o(this.dB(), this.dD() + $$3.e * 0.015 * (double)$$1, this.dH());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dz().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(avz.Aq, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean G() {
      buj $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof ard) || !$$0.Z_();
   }

   @Override
   public boolean D() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fav c(fay $$0, fay $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fav $$0) {
      buj $$1 = $$0.a();
      float $$2 = 8.0F;
      buj $$3 = this.p();
      bsz $$4 = this.dX().a(this, (buj)($$3 == null ? this : $$3));
      if (this.dW() instanceof arc $$5) {
         $$2 = dcz.a($$5, this.ea(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == buq.N) {
            return;
         }

         if (this.dW() instanceof arc $$6) {
            dcz.a($$6, $$1, $$4, this.ea(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bvf $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cpp.b, $$1, this.p(), false);
      this.h(this.dz().d(0.02, 0.2, 0.02));
      this.a(avz.Ao, 1.0F, 1.0F);
   }

   @Override
   protected void a(arc $$0, fau $$1, cwn $$2) {
      fay $$3 = $$1.b().a($$1.g());
      dcz.a($$0, $$2, this.p() instanceof bvf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cwn ea() {
      return this.w();
   }

   @Override
   protected boolean a(cov $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gi().f(this.u());
   }

   @Override
   protected cwn v() {
      return new cwn(cwr.wS);
   }

   @Override
   protected avy s() {
      return avz.Ap;
   }

   @Override
   public void a_(cov $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(e, this.b(this.w()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cwn $$0) {
      return this.dW() instanceof arc $$1 ? (byte)ayy.a(dcz.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.al.a(e);
      if (this.b != cpc.a.b || $$0 <= 0) {
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
