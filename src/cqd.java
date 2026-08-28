import javax.annotation.Nullable;

public class cqd extends cpe {
   private static final ajx<Byte> e = akb.a(cqd.class, ajz.a);
   private static final ajx<Boolean> f = akb.a(cqd.class, ajz.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public cqd(bur<? extends cqd> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cqd(dgi $$0, bvg $$1, cwp $$2) {
      super(bur.bz, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public cqd(dgi $$0, double $$1, double $$2, double $$3, cwp $$4) {
      super(bur.bz, $$1, $$2, $$3, $$0, $$4, $$4);
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

      buk $$0 = this.p();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (this.dW() instanceof arc $$2 && this.b == cpe.a.b) {
               this.a($$2, this.u(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cox) && this.du().f($$0.bF()) < (double)$$0.dr() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fba $$3 = $$0.bF().d(this.du());
            this.o(this.dB(), this.dD() + $$3.e * 0.015 * (double)$$1, this.dH());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dz().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awa.Ar, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean G() {
      buk $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof ard) || !$$0.Z_();
   }

   @Override
   public boolean D() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fax c(fba $$0, fba $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fax $$0) {
      buk $$1 = $$0.a();
      float $$2 = 8.0F;
      buk $$3 = this.p();
      bta $$4 = this.dX().a(this, (buk)($$3 == null ? this : $$3));
      if (this.dW() instanceof arc $$5) {
         $$2 = ddb.a($$5, this.ea(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bur.O) {
            return;
         }

         if (this.dW() instanceof arc $$6) {
            ddb.a($$6, $$1, $$4, this.ea(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bvg $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cpr.b, $$1, this.p(), false);
      this.h(this.dz().d(0.02, 0.2, 0.02));
      this.a(awa.Ap, 1.0F, 1.0F);
   }

   @Override
   protected void a(arc $$0, faw $$1, cwp $$2) {
      fba $$3 = $$1.b().a($$1.g());
      ddb.a($$0, $$2, this.p() instanceof bvg $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cwp ea() {
      return this.w();
   }

   @Override
   protected boolean a(cox $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gi().f(this.u());
   }

   @Override
   protected cwp v() {
      return new cwp(cwt.wS);
   }

   @Override
   protected avz s() {
      return awa.Aq;
   }

   @Override
   public void a_(cox $$0) {
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

   private byte b(cwp $$0) {
      return this.dW() instanceof arc $$1 ? (byte)ayz.a(ddb.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.al.a(e);
      if (this.b != cpe.a.b || $$0 <= 0) {
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
