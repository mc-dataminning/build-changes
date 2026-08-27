import javax.annotation.Nullable;

public class cda extends ccc {
   private static final aeg<Byte> g = aej.a(cda.class, aei.a);
   private static final aeg<Boolean> h = aej.a(cda.class, aei.k);
   private cjh i = new cjh(cjk.uV);
   private boolean j;
   public int f;

   public cda(biw<? extends cda> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cda(cpx $$0, bji $$1, cjh $$2) {
      super(biw.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cns.g($$2));
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

      bis $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dL().B && this.d == ccc.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            ehp $$2 = $$0.bp().d(this.dj());
            this.p(this.dq(), this.ds() + $$2.d * 0.015 * (double)$$1, this.dw());
            if (this.dL().B) {
               this.ad = this.ds();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.do().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(apf.xP, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      bis $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof akt) || !$$0.M_();
   }

   @Override
   protected cjh w() {
      return this.i.p();
   }

   @Override
   public boolean F() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ehm a(ehp $$0, ehp $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ehm $$0) {
      bis $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bji $$3) {
         $$2 += cns.a(this.i, $$3.eR());
      }

      bis $$4 = this.v();
      bhq $$5 = this.dM().a(this, (bis)($$4 == null ? this : $$4));
      this.j = true;
      ape $$6 = apf.xN;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == biw.E) {
            return;
         }

         if ($$1 instanceof bji $$7) {
            if ($$4 instanceof bji) {
               cns.a($$7, $$4);
               cns.b((bji)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.do().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dL() instanceof aks && this.dL().Y() && this.I()) {
         gw $$9 = $$1.dl();
         if (this.dL().g($$9)) {
            bjh $$10 = biw.ai.a(this.dL());
            if ($$10 != null) {
               $$10.d(ehp.c($$9));
               $$10.b($$4 instanceof akt ? (akt)$$4 : null);
               this.dL().b($$10);
               $$6 = apf.xU;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean I() {
      return cns.i(this.i);
   }

   @Override
   protected boolean a(cbw $$0) {
      return super.a($$0) || this.E() && this.d((bis)$$0) && $$0.fR().e(this.w());
   }

   @Override
   protected ape s() {
      return apf.xO;
   }

   @Override
   public void b_(cbw $$0) {
      if (this.d((bis)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = cjh.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cns.g(this.i));
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qy()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != ccc.a.b || $$0 <= 0) {
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
