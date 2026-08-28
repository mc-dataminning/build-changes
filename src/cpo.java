import javax.annotation.Nullable;

public class cpo extends cop {
   private static final akk<Byte> g = ako.a(cpo.class, akm.a);
   private static final akk<Boolean> h = ako.a(cpo.class, akm.k);
   private boolean i;
   public int f;

   public cpo(bug<? extends cpo> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpo(dev $$0, buv $$1, cvx $$2) {
      super(bug.bf, $$1, $$0, $$2, null);
      this.am.a(g, this.c($$2));
      this.am.a(h, $$2.B());
   }

   public cpo(dev $$0, double $$1, double $$2, double $$3, cvx $$4) {
      super(bug.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.am.a(g, this.c($$4));
      this.am.a(h, $$4.B());
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      btz $$0 = this.s();
      int $$1 = this.am.a(g);
      if ($$1 > 0 && (this.i || this.C()) && $$0 != null) {
         if (!this.I()) {
            if (!this.dX().C && this.d == cop.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.au();
         } else {
            this.b(true);
            ezh $$2 = $$0.bG().d(this.dv());
            this.o(this.dC(), this.dE() + $$2.e * 0.015 * (double)$$1, this.dI());
            if (this.dX().C) {
               this.ac = this.dE();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.dA().c(0.95).e($$2.d().c($$3)));
            if (this.f == 0) {
               this.a(awk.zG, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean I() {
      btz $$0 = this.s();
      return $$0 == null || !$$0.bM() ? false : !($$0 instanceof arn) || !$$0.R_();
   }

   public boolean E() {
      return this.am.a(h);
   }

   @Nullable
   @Override
   protected eze a(ezh $$0, ezh $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eze $$0) {
      btz $$1 = $$0.a();
      float $$2 = 8.0F;
      btz $$3 = this.s();
      bsp $$4 = this.dY().a(this, (btz)($$3 == null ? this : $$3));
      if (this.dX() instanceof arm $$5) {
         $$2 = dbo.a($$5, this.eb(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.aq() == bug.H) {
            return;
         }

         if (this.dX() instanceof arm $$6) {
            dbo.a($$6, $$1, $$4, this.eb(), $$0x -> this.at());
         }

         if ($$1 instanceof buv $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.h(this.dA().d(-0.01, -0.1, -0.01));
      this.a(awk.zE, 1.0F, 1.0F);
   }

   @Override
   protected void a(arm $$0, ezd $$1, cvx $$2) {
      ezh $$3 = $$1.b().a($$1.g());
      dbo.a($$0, $$2, this.s() instanceof buv $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.at());
   }

   @Override
   public cvx eb() {
      return this.w();
   }

   @Override
   protected boolean a(coh $$0) {
      return super.a($$0) || this.C() && this.e($$0) && $$0.gk().f(this.t());
   }

   @Override
   protected cvx v() {
      return new cvx(cwb.vU);
   }

   @Override
   protected awj o() {
      return awk.zF;
   }

   @Override
   public void b_(coh $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.am.a(g, this.c(this.w()));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cvx $$0) {
      return this.dX() instanceof arm $$1 ? (byte)azj.a(dbo.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.am.a(g);
      if (this.d != cop.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float B() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
