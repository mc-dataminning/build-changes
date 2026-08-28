import javax.annotation.Nullable;

public class cod extends cne {
   private static final akk<Byte> g = ako.a(cod.class, akm.a);
   private static final akk<Boolean> h = ako.a(cod.class, akm.k);
   private boolean i;
   public int f;

   public cod(btb<? extends cod> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cod(dbz $$0, btq $$1, cuq $$2) {
      super(btb.bf, $$1, $$0, $$2);
      this.ao.a(g, (byte)dac.i($$2));
      this.ao.a(h, $$2.y());
   }

   public cod(dbz $$0, double $$1, double $$2, double $$3, cuq $$4) {
      super(btb.bf, $$1, $$2, $$3, $$0, $$4);
      this.ao.a(g, (byte)dac.i($$4));
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

      bsv $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dP().B && this.d == cne.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            evs $$2 = $$0.bx().d(this.dn());
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
      bsv $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof arg) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected evp a(evs $$0, evs $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(evp $$0) {
      bsv $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof btq $$3) {
         $$2 += dac.a(this.y(), $$3.ak());
      }

      bsv $$4 = this.s();
      bro $$5 = this.dQ().a(this, (bsv)($$4 == null ? this : $$4));
      this.i = true;
      avz $$6 = awa.zx;
      if ($$1.a($$5, $$2)) {
         if ($$1.ak() == btb.H) {
            return;
         }

         if ($$1 instanceof btq $$7) {
            if ($$4 instanceof btq) {
               dac.a($$7, $$4);
               dac.b((btq)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.h(this.ds().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dP() instanceof arf && this.dP().ac() && this.K()) {
         iz $$9 = $$1.dp();
         if (this.dP().h($$9)) {
            btp $$10 = btb.am.a(this.dP());
            if ($$10 != null) {
               $$10.e(evs.c($$9));
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
      return dac.k(this.y());
   }

   @Override
   protected boolean a(cmy $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.gc().f(this.w());
   }

   @Override
   protected cuq x() {
      return new cuq(cut.vP);
   }

   @Override
   protected avz u() {
      return awa.zy;
   }

   @Override
   public void b_(cmy $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, (byte)dac.i(this.y()));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cne.a.b || $$0 <= 0) {
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
