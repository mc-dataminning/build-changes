import javax.annotation.Nullable;

public class cey extends cea {
   private static final afo<Byte> g = afr.a(cey.class, afq.a);
   private static final afo<Boolean> h = afr.a(cey.class, afq.k);
   private static final clj i = new clj(clm.vH);
   private boolean j;
   public int f;

   public cey(bku<? extends cey> $$0, csa $$1) {
      super($$0, $$1, i);
   }

   public cey(csa $$0, blg $$1, clj $$2) {
      super(bku.bb, $$1, $$0, $$2);
      this.an.b(g, (byte)cpw.g($$2));
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

      bkq $$0 = this.w();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dN().B && this.d == cea.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            eju $$2 = $$0.br().d(this.dl());
            this.p(this.ds(), this.du() + $$2.d * 0.015 * (double)$$1, this.dy());
            if (this.dN().B) {
               this.ad = this.du();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dq().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aqr.yk, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      bkq $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof amf) || !$$0.O_();
   }

   @Override
   public boolean H() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ejr a(eju $$0, eju $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ejr $$0) {
      bkq $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof blg $$3) {
         $$2 += cpw.a(this.y(), $$3.eT());
      }

      bkq $$4 = this.w();
      bjo $$5 = this.dO().a(this, (bkq)($$4 == null ? this : $$4));
      this.j = true;
      aqq $$6 = aqr.yi;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bku.E) {
            return;
         }

         if ($$1 instanceof blg $$7) {
            if ($$4 instanceof blg) {
               cpw.a($$7, $$4);
               cpw.b((blg)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dq().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dN() instanceof ame && this.dN().Z() && this.K()) {
         ht $$9 = $$1.dn();
         if (this.dN().g($$9)) {
            blf $$10 = bku.ai.a(this.dN());
            if ($$10 != null) {
               $$10.e(eju.c($$9));
               $$10.b($$4 instanceof amf ? (amf)$$4 : null);
               this.dN().b($$10);
               $$6 = aqr.yp;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cpw.i(this.y());
   }

   @Override
   protected boolean a(cdu $$0) {
      return super.a($$0) || this.G() && this.d((bkq)$$0) && $$0.fT().e(this.x());
   }

   @Override
   protected aqq s() {
      return aqr.yj;
   }

   @Override
   public void b_(cdu $$0) {
      if (this.d((bkq)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cpw.g(this.y()));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cea.a.b || $$0 <= 0) {
         super.q();
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
