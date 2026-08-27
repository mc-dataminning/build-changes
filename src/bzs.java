import javax.annotation.Nullable;

public class bzs extends byu {
   private static final aby<Byte> g = acb.a(bzs.class, aca.a);
   private static final aby<Boolean> h = acb.a(bzs.class, aca.k);
   private cfz i = new cfz(cgc.uV);
   private boolean j;
   public int f;

   public bzs(bfn<? extends bzs> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzs(cmm $$0, bfz $$1, cfz $$2) {
      super(bfn.bb, $$1, $$0);
      this.i = $$2.p();
      this.am.b(g, (byte)cki.g($$2));
      this.am.b(h, $$2.B());
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(g, (byte)0);
      this.am.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      bfj $$0 = this.v();
      int $$1 = this.am.b(g);
      if ($$1 > 0 && (this.j || this.y()) && $$0 != null) {
         if (!this.E()) {
            if (!this.dI().B && this.d == byu.a.b) {
               this.a(this.p(), 0.1F);
            }

            this.ai();
         } else {
            this.p(true);
            eei $$2 = $$0.bm().d(this.dg());
            this.p(this.dn(), this.dp() + $$2.d * 0.015 * (double)$$1, this.dt());
            if (this.dI().B) {
               this.ac = this.dp();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.dl().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(amh.xJ, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean E() {
      bfj $$0 = this.v();
      return $$0 == null || !$$0.bs() ? false : !($$0 instanceof aig) || !$$0.G_();
   }

   @Override
   protected cfz p() {
      return this.i.p();
   }

   @Override
   public boolean z() {
      return this.am.b(h);
   }

   @Nullable
   @Override
   protected eef a(eei $$0, eei $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eef $$0) {
      bfj $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bfz $$3) {
         $$2 += cki.a(this.i, $$3.eN());
      }

      bfj $$4 = this.v();
      ben $$5 = this.dJ().a(this, (bfj)($$4 == null ? this : $$4));
      this.j = true;
      amg $$6 = amh.xH;
      if ($$1.a($$5, $$2)) {
         if ($$1.ae() == bfn.E) {
            return;
         }

         if ($$1 instanceof bfz $$7) {
            if ($$4 instanceof bfz) {
               cki.a($$7, $$4);
               cki.b((bfz)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.dl().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dI() instanceof aif && this.dI().Y() && this.D()) {
         gu $$9 = $$1.di();
         if (this.dI().g($$9)) {
            bfy $$10 = bfn.ai.a(this.dI());
            if ($$10 != null) {
               $$10.d(eei.c($$9));
               $$10.b($$4 instanceof aig ? (aig)$$4 : null);
               this.dI().b($$10);
               $$6 = amh.xO;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean D() {
      return cki.i(this.i);
   }

   @Override
   protected boolean a(byo $$0) {
      return super.a($$0) || this.y() && this.d((bfj)$$0) && $$0.fN().e(this.p());
   }

   @Override
   protected amg k() {
      return amh.xI;
   }

   @Override
   public void b_(byo $$0) {
      if (this.d((bfj)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = cfz.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.am.b(g, (byte)cki.g(this.i));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qr()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void j() {
      int $$0 = this.am.b(g);
      if (this.d != byu.a.b || $$0 <= 0) {
         super.j();
      }
   }

   @Override
   protected float x() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
