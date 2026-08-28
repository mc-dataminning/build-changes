import javax.annotation.Nullable;

public class coe extends cnf {
   private static final akk<Byte> g = ako.a(coe.class, akm.a);
   private static final akk<Boolean> h = ako.a(coe.class, akm.k);
   private boolean i;
   public int f;

   public coe(btc<? extends coe> $$0, dca $$1) {
      super($$0, $$1);
   }

   public coe(dca $$0, btr $$1, cur $$2) {
      super(btc.bf, $$1, $$0, $$2);
      this.ao.a(g, (byte)dad.i($$2));
      this.ao.a(h, $$2.y());
   }

   public coe(dca $$0, double $$1, double $$2, double $$3, cur $$4) {
      super(btc.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(g, (byte)dad.i($$4));
      this.ao.a(h, $$4.y());
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

      bsw $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cnf.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            evt $$2 = $$0.bx().d(this.dn());
            this.p(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(awa.zz, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      bsw $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof arg) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected evq a(evt $$0, evt $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(evq $$0) {
      bsw $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof btr $$3) {
         $$2 += dad.a(this.y(), $$3.ak());
      }

      bsw $$4 = this.s();
      brp $$5 = this.dQ().a(this, (bsw)($$4 == null ? this : $$4));
      this.i = true;
      avz $$6 = awa.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == btc.H) {
            return;
         }

         if ($$1 instanceof btr $$7) {
            if ($$4 instanceof btr) {
               dad.a($$7, $$4);
               dad.b((btr)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.h(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof arf && this.dP().ac() && this.K()) {
         iz $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            btq $$10 = btc.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(evt.c($$9));
               $$10.b($$4 instanceof arg ? (arg)$$4 : null);
               this.dP().b($$10);
               $$6 = awa.zE;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return dad.k(this.y());
   }

   @Override
   protected boolean a(cmz $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected cur x() {
      return new cur(cuu.vP);
   }

   @Override
   protected avz u() {
      return awa.zy;
   }

   @Override
   public void b_(cmz $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, (byte)dad.i(this.y()));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cnf.a.b || $$0 <= 0) {
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
