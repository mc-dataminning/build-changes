import javax.annotation.Nullable;

public class clf extends ckg {
   private static final aja<Byte> h = aje.a(clf.class, ajc.a);
   private static final aja<Boolean> i = aje.a(clf.class, ajc.k);
   private boolean j;
   public int g;

   public clf(bqg<? extends clf> $$0, czg $$1) {
      super($$0, $$1);
   }

   public clf(czg $$0, bqt $$1, crs $$2) {
      super(bqg.be, $$1, $$0, $$2);
      this.an.a(h, (byte)cxa.i($$2));
      this.an.a(i, $$2.x());
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(h, (byte)0);
      $$0.a(i, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bqa $$0 = this.u();
      int $$1 = this.an.a(h);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dM().B && this.d == ckg.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            esj $$2 = $$0.bu().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.g == 0) {
               this.a(auo.zg, 10.0F, 1.0F);
            }

            this.g++;
         }
      }

      super.l();
   }

   private boolean M() {
      bqa $$0 = this.u();
      return $$0 == null || !$$0.bA() ? false : !($$0 instanceof apv) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.an.a(i);
   }

   @Nullable
   @Override
   protected esg a(esj $$0, esj $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(esg $$0) {
      bqa $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bqt $$3) {
         $$2 += cxa.a(this.y(), $$3.ai());
      }

      bqa $$4 = this.u();
      boy $$5 = this.dN().a(this, (bqa)($$4 == null ? this : $$4));
      this.j = true;
      aun $$6 = auo.ze;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bqg.H) {
            return;
         }

         if ($$1 instanceof bqt $$7) {
            if ($$4 instanceof bqt) {
               cxa.a($$7, $$4);
               cxa.b((bqt)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof apu && this.dM().ab() && this.K()) {
         id $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bqs $$10 = bqg.al.a(this.dM());
            if ($$10 != null) {
               $$10.e(esj.c($$9));
               $$10.b($$4 instanceof apv ? (apv)$$4 : null);
               this.dM().b($$10);
               $$6 = auo.zl;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return cxa.k(this.y());
   }

   @Override
   protected boolean a(cka $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.fZ().e(this.w());
   }

   @Override
   protected crs x() {
      return new crs(crv.vN);
   }

   @Override
   protected aun r() {
      return auo.zf;
   }

   @Override
   public void b_(cka $$0) {
      if (this.e($$0) || this.u() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.a(h, (byte)cxa.i(this.y()));
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void p() {
      int $$0 = this.an.a(h);
      if (this.d != ckg.a.b || $$0 <= 0) {
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
