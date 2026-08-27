import javax.annotation.Nullable;

public class cnd extends cme {
   private static final ajs<Byte> g = ajw.a(cnd.class, aju.a);
   private static final ajs<Boolean> h = ajw.a(cnd.class, aju.k);
   private boolean i;
   public int f;

   public cnd(bsc<? extends cnd> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cnd(daz $$0, bsq $$1, ctq $$2) {
      super(bsc.bf, $$1, $$0, $$2);
      this.ao.a(g, (byte)czc.i($$2));
      this.ao.a(h, $$2.y());
   }

   public cnd(daz $$0, double $$1, double $$2, double $$3, ctq $$4) {
      super(bsc.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(g, (byte)czc.i($$4));
      this.ao.a(h, $$4.y());
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      brw $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cme.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            eum $$2 = $$0.bx().d(this.dn());
            this.p(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avi.zz, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      brw $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof aqo) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected euj a(eum $$0, eum $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(euj $$0) {
      brw $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bsq $$3) {
         $$2 += czc.a(this.y(), $$3.ak());
      }

      brw $$4 = this.s();
      bqp $$5 = this.dQ().a(this, (brw)($$4 == null ? this : $$4));
      this.i = true;
      avh $$6 = avi.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == bsc.H) {
            return;
         }

         if ($$1 instanceof bsq $$7) {
            if ($$4 instanceof bsq) {
               czc.a($$7, $$4);
               czc.b((bsq)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof aqn && this.dP().ab() && this.K()) {
         io $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            bsp $$10 = bsc.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(eum.c($$9));
               $$10.b($$4 instanceof aqo ? (aqo)$$4 : null);
               this.dP().b($$10);
               $$6 = avi.zE;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return czc.k(this.y());
   }

   @Override
   protected boolean a(cly $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected ctq x() {
      return new ctq(ctt.vP);
   }

   @Override
   protected avh u() {
      return avi.zy;
   }

   @Override
   public void b_(cly $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, (byte)czc.i(this.y()));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cme.a.b || $$0 <= 0) {
         super.p();
      }
   }

   @Override
   protected float E() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
