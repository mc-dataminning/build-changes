import javax.annotation.Nullable;

public class coc extends cnd {
   private static final akk<Byte> g = ako.a(coc.class, akm.a);
   private static final akk<Boolean> h = ako.a(coc.class, akm.k);
   private boolean i;
   public int f;

   public coc(bta<? extends coc> $$0, dby $$1) {
      super($$0, $$1);
   }

   public coc(dby $$0, btp $$1, cup $$2) {
      super(bta.bf, $$1, $$0, $$2);
      this.ao.a(g, (byte)dab.i($$2));
      this.ao.a(h, $$2.y());
   }

   public coc(dby $$0, double $$1, double $$2, double $$3, cup $$4) {
      super(bta.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(g, (byte)dab.i($$4));
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

      bsu $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cnd.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            evr $$2 = $$0.bx().d(this.dn());
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
      bsu $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof arg) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected evo a(evr $$0, evr $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(evo $$0) {
      bsu $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof btp $$3) {
         $$2 += dab.a(this.y(), $$3.ak());
      }

      bsu $$4 = this.s();
      brn $$5 = this.dQ().a(this, (bsu)($$4 == null ? this : $$4));
      this.i = true;
      avz $$6 = awa.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == bta.H) {
            return;
         }

         if ($$1 instanceof btp $$7) {
            if ($$4 instanceof btp) {
               dab.a($$7, $$4);
               dab.b((btp)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.h(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof arf && this.dP().ac() && this.K()) {
         iz $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            bto $$10 = bta.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(evr.c($$9));
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
      return dab.k(this.y());
   }

   @Override
   protected boolean a(cmx $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected cup x() {
      return new cup(cus.vP);
   }

   @Override
   protected avz u() {
      return awa.zy;
   }

   @Override
   public void b_(cmx $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, (byte)dab.i(this.y()));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cnd.a.b || $$0 <= 0) {
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
