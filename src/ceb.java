import javax.annotation.Nullable;

public class ceb extends cdd {
   private static final afc<Byte> g = aff.a(ceb.class, afe.a);
   private static final afc<Boolean> h = aff.a(ceb.class, afe.k);
   private ckj i = new ckj(ckm.uV);
   private boolean j;
   public int f;

   public ceb(bjx<? extends ceb> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public ceb(cqz $$0, bkj $$1, ckj $$2) {
      super(bjx.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cov.g($$2));
      this.an.b(h, $$2.B());
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(g, (byte)0);
      this.an.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bjt $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dL().B && this.d == cdd.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            eif $$2 = $$0.bp().d(this.dj());
            this.p(this.dq(), this.ds() + $$2.d * 0.015 * (double)$$1, this.dw());
            if (this.dL().B) {
               this.ad = this.ds();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.do().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aqd.xR, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      bjt $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof alr) || !$$0.N_();
   }

   @Override
   protected ckj w() {
      return this.i.p();
   }

   @Override
   public boolean F() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected eic a(eif $$0, eif $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eic $$0) {
      bjt $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bkj $$3) {
         $$2 += cov.a(this.i, $$3.eR());
      }

      bjt $$4 = this.v();
      bir $$5 = this.dM().a(this, (bjt)($$4 == null ? this : $$4));
      this.j = true;
      aqc $$6 = aqd.xP;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == bjx.E) {
            return;
         }

         if ($$1 instanceof bkj $$7) {
            if ($$4 instanceof bkj) {
               cov.a($$7, $$4);
               cov.b((bkj)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.do().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dL() instanceof alq && this.dL().Y() && this.I()) {
         ht $$9 = $$1.dl();
         if (this.dL().g($$9)) {
            bki $$10 = bjx.ai.a(this.dL());
            if ($$10 != null) {
               $$10.d(eif.c($$9));
               $$10.b($$4 instanceof alr ? (alr)$$4 : null);
               this.dL().b($$10);
               $$6 = aqd.xW;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean I() {
      return cov.i(this.i);
   }

   @Override
   protected boolean a(ccx $$0) {
      return super.a($$0) || this.E() && this.d((bjt)$$0) && $$0.fS().e(this.w());
   }

   @Override
   protected aqc s() {
      return aqd.xQ;
   }

   @Override
   public void b_(ccx $$0) {
      if (this.d((bjt)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = ckj.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cov.g(this.i));
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new rt()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cdd.a.b || $$0 <= 0) {
         super.q();
      }
   }

   @Override
   protected float C() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
