import javax.annotation.Nullable;

public class ccy extends cca {
   private static final aef<Byte> g = aei.a(ccy.class, aeh.a);
   private static final aef<Boolean> h = aei.a(ccy.class, aeh.k);
   private cjf i = new cjf(cji.uV);
   private boolean j;
   public int f;

   public ccy(biu<? extends ccy> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccy(cpv $$0, bjg $$1, cjf $$2) {
      super(biu.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cnq.g($$2));
      this.an.b(h, $$2.B());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(g, (byte)0);
      this.an.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      biq $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dL().B && this.d == cca.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.al();
         } else {
            this.p(true);
            ehn $$2 = $$0.bq().d(this.dj());
            this.p(this.dq(), this.ds() + $$2.d * 0.015 * (double)$$1, this.dw());
            if (this.dL().B) {
               this.ad = this.ds();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.do().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(ape.xP, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      biq $$0 = this.v();
      return $$0 == null || !$$0.bw() ? false : !($$0 instanceof aks) || !$$0.M_();
   }

   @Override
   protected cjf w() {
      return this.i.p();
   }

   @Override
   public boolean F() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ehk a(ehn $$0, ehn $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ehk $$0) {
      biq $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bjg $$3) {
         $$2 += cnq.a(this.i, $$3.eR());
      }

      biq $$4 = this.v();
      bho $$5 = this.dM().a(this, (biq)($$4 == null ? this : $$4));
      this.j = true;
      apd $$6 = ape.xN;
      if ($$1.a($$5, $$2)) {
         if ($$1.ah() == biu.E) {
            return;
         }

         if ($$1 instanceof bjg $$7) {
            if ($$4 instanceof bjg) {
               cnq.a($$7, $$4);
               cnq.b((bjg)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.do().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dL() instanceof akr && this.dL().Y() && this.I()) {
         gw $$9 = $$1.dl();
         if (this.dL().g($$9)) {
            bjf $$10 = biu.ai.a(this.dL());
            if ($$10 != null) {
               $$10.d(ehn.c($$9));
               $$10.b($$4 instanceof aks ? (aks)$$4 : null);
               this.dL().b($$10);
               $$6 = ape.xU;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean I() {
      return cnq.i(this.i);
   }

   @Override
   protected boolean a(cbu $$0) {
      return super.a($$0) || this.E() && this.d((biq)$$0) && $$0.fR().e(this.w());
   }

   @Override
   protected apd s() {
      return ape.xO;
   }

   @Override
   public void b_(cbu $$0) {
      if (this.d((biq)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = cjf.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cnq.g(this.i));
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qx()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cca.a.b || $$0 <= 0) {
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
