import javax.annotation.Nullable;

public class cim extends chn {
   private static final aie<Byte> g = aih.a(cim.class, aig.a);
   private static final aie<Boolean> h = aih.a(cim.class, aig.k);
   private static final coz i = new coz(cpc.vL);
   private boolean j;
   public int f;

   public cim(bnu<? extends cim> $$0, cvn $$1) {
      super($$0, $$1, i);
   }

   public cim(cvn $$0, bog $$1, coz $$2) {
      super(bnu.bd, $$1, $$0, $$2);
      this.am.b(g, (byte)ctj.g($$2));
      this.am.b(h, $$2.C());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(g, (byte)0);
      this.am.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bno $$0 = this.w();
      int $$1 = this.am.b(g);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dM().B && this.d == chn.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            ens $$2 = $$0.br().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ac = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(atk.yU, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      bno $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof aow) || !$$0.P_();
   }

   @Override
   public boolean H() {
      return this.am.b(h);
   }

   @Nullable
   @Override
   protected enp a(ens $$0, ens $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(enp $$0) {
      bno $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bog $$3) {
         $$2 += ctj.a(this.y(), $$3.ai());
      }

      bno $$4 = this.w();
      bmn $$5 = this.dN().a(this, (bno)($$4 == null ? this : $$4));
      this.j = true;
      atj $$6 = atk.yS;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bnu.G) {
            return;
         }

         if ($$1 instanceof bog $$7) {
            if ($$4 instanceof bog) {
               ctj.a($$7, $$4);
               ctj.b((bog)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof aov && this.dM().aa() && this.K()) {
         hz $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bof $$10 = bnu.ak.a(this.dM());
            if ($$10 != null) {
               $$10.e(ens.c($$9));
               $$10.b($$4 instanceof aow ? (aow)$$4 : null);
               this.dM().b($$10);
               $$6 = atk.yZ;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return ctj.i(this.y());
   }

   @Override
   protected boolean a(chh $$0) {
      return super.a($$0) || this.G() && this.d((bno)$$0) && $$0.fT().e(this.x());
   }

   @Override
   protected atj s() {
      return atk.yT;
   }

   @Override
   public void b_(chh $$0) {
      if (this.d((bno)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.am.b(g, (byte)ctj.g(this.y()));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.am.b(g);
      if (this.d != chn.a.b || $$0 <= 0) {
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
