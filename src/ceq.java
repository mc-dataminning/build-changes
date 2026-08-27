import javax.annotation.Nullable;

public class ceq extends cds {
   private static final afm<Byte> g = afp.a(ceq.class, afo.a);
   private static final afm<Boolean> h = afp.a(ceq.class, afo.k);
   private clb i = new clb(cle.uW);
   private boolean j;
   public int f;

   public ceq(bkm<? extends ceq> $$0, crs $$1) {
      super($$0, $$1);
   }

   public ceq(crs $$0, bky $$1, clb $$2) {
      super(bkm.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cpo.g($$2));
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

      bki $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dL().B && this.d == cds.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            eji $$2 = $$0.bp().d(this.dj());
            this.p(this.dq(), this.ds() + $$2.d * 0.015 * (double)$$1, this.dw());
            if (this.dL().B) {
               this.ad = this.ds();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.do().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aqn.xT, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      bki $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof amb) || !$$0.N_();
   }

   @Override
   protected clb w() {
      return this.i.p();
   }

   @Override
   public boolean F() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ejf a(eji $$0, eji $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ejf $$0) {
      bki $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bky $$3) {
         $$2 += cpo.a(this.i, $$3.eR());
      }

      bki $$4 = this.v();
      bjg $$5 = this.dM().a(this, (bki)($$4 == null ? this : $$4));
      this.j = true;
      aqm $$6 = aqn.xR;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == bkm.E) {
            return;
         }

         if ($$1 instanceof bky $$7) {
            if ($$4 instanceof bky) {
               cpo.a($$7, $$4);
               cpo.b((bky)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.do().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dL() instanceof ama && this.dL().Y() && this.I()) {
         ht $$9 = $$1.dl();
         if (this.dL().g($$9)) {
            bkx $$10 = bkm.ai.a(this.dL());
            if ($$10 != null) {
               $$10.d(eji.c($$9));
               $$10.b($$4 instanceof amb ? (amb)$$4 : null);
               this.dL().b($$10);
               $$6 = aqn.xY;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean I() {
      return cpo.i(this.i);
   }

   @Override
   protected boolean a(cdm $$0) {
      return super.a($$0) || this.E() && this.d((bki)$$0) && $$0.fS().e(this.w());
   }

   @Override
   protected aqm s() {
      return aqn.xS;
   }

   @Override
   public void b_(cdm $$0) {
      if (this.d((bki)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = clb.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cpo.g(this.i));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new rz()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cds.a.b || $$0 <= 0) {
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
