import javax.annotation.Nullable;

public class cky extends cjz {
   private static final aiy<Byte> h = ajc.a(cky.class, aja.a);
   private static final aiy<Boolean> i = ajc.a(cky.class, aja.k);
   private boolean j;
   public int g;

   public cky(bqb<? extends cky> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cky(cyx $$0, bqo $$1, crj $$2) {
      super(bqb.be, $$1, $$0, $$2);
      this.an.a(h, (byte)cwr.h($$2));
      this.an.a(i, $$2.x());
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bpv $$0 = this.u();
      int $$1 = this.an.a(h);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dM().B && this.d == cjz.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            esa $$2 = $$0.bu().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(aum.zg, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      bpv $$0 = this.u();
      return $$0 == null || !$$0.bA() ? false : !($$0 instanceof apt) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.an.a(i);
   }

   @Nullable
   @Override
   protected erx a(esa $$0, esa $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(erx $$0) {
      bpv $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bqo $$3) {
         $$2 += cwr.a(this.y(), $$3.ai());
      }

      bpv $$4 = this.u();
      bot $$5 = this.dN().a(this, (bpv)($$4 == null ? this : $$4));
      this.j = true;
      aul $$6 = aum.ze;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bqb.H) {
            return;
         }

         if ($$1 instanceof bqo $$7) {
            if ($$4 instanceof bqo) {
               cwr.a($$7, $$4);
               cwr.b((bqo)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof aps && this.dM().ab() && this.K()) {
         ib $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bqn $$10 = bqb.al.a(this.dM());
            if ($$10 != null) {
               $$10.e(esa.c($$9));
               $$10.b($$4 instanceof apt ? (apt)$$4 : null);
               this.dM().b($$10);
               $$6 = aum.zl;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cwr.j(this.y());
   }

   @Override
   protected boolean a(cjt $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.fZ().e(this.w());
   }

   @Override
   protected crj x() {
      return new crj(crm.vN);
   }

   @Override
   protected aul r() {
      return aum.zf;
   }

   @Override
   public void b_(cjt $$0) {
      if (this.e($$0) || this.u() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.a(h, (byte)cwr.h(this.y()));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void p() {
      int $$0 = this.an.a(h);
      if (this.d != cjz.a.b || $$0 <= 0) {
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
