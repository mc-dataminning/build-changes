import javax.annotation.Nullable;

public class cnx extends cmy {
   private static final akg<Byte> g = akk.a(cnx.class, aki.a);
   private static final akg<Boolean> h = akk.a(cnx.class, aki.k);
   private boolean i;
   public int f;

   public cnx(bsv<? extends cnx> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cnx(dbt $$0, btk $$1, cuk $$2) {
      super(bsv.bf, $$1, $$0, $$2);
      this.ao.a(g, (byte)czw.i($$2));
      this.ao.a(h, $$2.y());
   }

   public cnx(dbt $$0, double $$1, double $$2, double $$3, cuk $$4) {
      super(bsv.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(g, (byte)czw.i($$4));
      this.ao.a(h, $$4.y());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bsp $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cmy.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            evm $$2 = $$0.bx().d(this.dn());
            this.p(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avw.zz, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      bsp $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof arc) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected evj a(evm $$0, evm $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(evj $$0) {
      bsp $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof btk $$3) {
         $$2 += czw.a(this.y(), $$3.ak());
      }

      bsp $$4 = this.s();
      bri $$5 = this.dQ().a(this, (bsp)($$4 == null ? this : $$4));
      this.i = true;
      avv $$6 = avw.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == bsv.H) {
            return;
         }

         if ($$1 instanceof btk $$7) {
            if ($$4 instanceof btk) {
               czw.a($$7, $$4);
               czw.b((btk)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.h(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof arb && this.dP().ac() && this.K()) {
         iz $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            btj $$10 = bsv.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(evm.c($$9));
               $$10.b($$4 instanceof arc ? (arc)$$4 : null);
               this.dP().b($$10);
               $$6 = avw.zE;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return czw.k(this.y());
   }

   @Override
   protected boolean a(cms $$0) {
      return super.a($$0) || this.G() && this.A($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected cuk x() {
      return new cuk(cun.vP);
   }

   @Override
   protected avv u() {
      return avw.zy;
   }

   @Override
   public void b_(cms $$0) {
      if (this.A($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, (byte)czw.i(this.y()));
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cmy.a.b || $$0 <= 0) {
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
