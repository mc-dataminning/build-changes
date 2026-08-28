import javax.annotation.Nullable;

public class cqe extends cpf {
   private static final ajy<Byte> e = akc.a(cqe.class, aka.a);
   private static final ajy<Boolean> f = akc.a(cqe.class, aka.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public cqe(but<? extends cqe> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cqe(dgj $$0, bvi $$1, cwq $$2) {
      super(but.by, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public cqe(dgj $$0, double $$1, double $$2, double $$3, cwq $$4) {
      super(but.by, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bum $$0 = this.p();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (this.dV() instanceof ard $$2 && this.b == cpf.a.b) {
               this.a($$2, this.u(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof coy) && this.dt().f($$0.bF()) < (double)$$0.dq() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fbb $$3 = $$0.bF().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awa.Aq, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean G() {
      bum $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof are) || !$$0.Z_();
   }

   @Override
   public boolean D() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fay c(fbb $$0, fbb $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fay $$0) {
      bum $$1 = $$0.a();
      float $$2 = 8.0F;
      bum $$3 = this.p();
      btc $$4 = this.dW().a(this, (bum)($$3 == null ? this : $$3));
      if (this.dV() instanceof ard $$5) {
         $$2 = ddc.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == but.N) {
            return;
         }

         if (this.dV() instanceof ard $$6) {
            ddc.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bvi $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cps.b, $$1, this.p(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awa.Ao, 1.0F, 1.0F);
   }

   @Override
   protected void a(ard $$0, fax $$1, cwq $$2) {
      fbb $$3 = $$1.b().a($$1.g());
      ddc.a($$0, $$2, this.p() instanceof bvi $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cwq dZ() {
      return this.w();
   }

   @Override
   protected boolean a(coy $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gi().f(this.u());
   }

   @Override
   protected cwq v() {
      return new cwq(cwu.wS);
   }

   @Override
   protected avz s() {
      return awa.Ap;
   }

   @Override
   public void a_(coy $$0) {
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

   private byte b(cwq $$0) {
      return this.dV() instanceof ard $$1 ? (byte)ayz.a(ddc.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.al.a(e);
      if (this.b != cpf.a.b || $$0 <= 0) {
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
