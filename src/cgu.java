import javax.annotation.Nullable;

public class cgu extends cfw {
   private static final agn<Byte> g = agq.a(cgu.class, agp.a);
   private static final agn<Boolean> h = agq.a(cgu.class, agp.k);
   private static final cng i = new cng(cnj.vL);
   private boolean j;
   public int f;

   public cgu(bmc<? extends cgu> $$0, ctx $$1) {
      super($$0, $$1, i);
   }

   public cgu(ctx $$0, bmo $$1, cng $$2) {
      super(bmc.bd, $$1, $$0, $$2);
      this.an.b(g, (byte)crt.g($$2));
      this.an.b(h, $$2.B());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(g, (byte)0);
      this.an.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      blw $$0 = this.w();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.G()) && $$0 != null) {
         if (!this.M()) {
            if (!this.dL().B && this.d == cfw.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            emc $$2 = $$0.br().d(this.dj());
            this.p(this.dq(), this.ds() + $$2.d * 0.015 * (double)$$1, this.dw());
            if (this.dL().B) {
               this.ad = this.ds();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.do().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(art.yU, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean M() {
      blw $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof anf) || !$$0.P_();
   }

   @Override
   public boolean H() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected elz a(emc $$0, emc $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(elz $$0) {
      blw $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bmo $$3) {
         $$2 += crt.a(this.y(), $$3.eS());
      }

      blw $$4 = this.w();
      bkv $$5 = this.dM().a(this, (blw)($$4 == null ? this : $$4));
      this.j = true;
      ars $$6 = art.yS;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bmc.G) {
            return;
         }

         if ($$1 instanceof bmo $$7) {
            if ($$4 instanceof bmo) {
               crt.a($$7, $$4);
               crt.b((bmo)$$4, $$7);
            }

            this.a($$7);
         }
      } else if ($$1.ai().a(asl.s)) {
         this.a($$1);
         return;
      }

      this.g(this.do().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dL() instanceof ane && this.dL().aa() && this.K()) {
         hx $$9 = $$1.dl();
         if (this.dL().h($$9)) {
            bmn $$10 = bmc.ak.a(this.dL());
            if ($$10 != null) {
               $$10.e(emc.c($$9));
               $$10.b($$4 instanceof anf ? (anf)$$4 : null);
               this.dL().b($$10);
               $$6 = art.yZ;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean K() {
      return crt.i(this.y());
   }

   @Override
   protected boolean a(cfq $$0) {
      return super.a($$0) || this.G() && this.d((blw)$$0) && $$0.fS().e(this.x());
   }

   @Override
   protected ars s() {
      return art.yT;
   }

   @Override
   public void b_(cfq $$0) {
      if (this.d((blw)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)crt.g(this.y()));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cfw.a.b || $$0 <= 0) {
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
