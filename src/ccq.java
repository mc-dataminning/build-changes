import javax.annotation.Nullable;

public class ccq extends cbs {
   private static final adz<Byte> g = aec.a(ccq.class, aeb.a);
   private static final adz<Boolean> h = aec.a(ccq.class, aeb.k);
   private cix i = new cix(cja.uV);
   private boolean j;
   public int f;

   public ccq(bim<? extends ccq> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public ccq(cpl $$0, biy $$1, cix $$2) {
      super(bim.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cng.g($$2));
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

      bii $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.y()) && $$0 != null) {
         if (!this.E()) {
            if (!this.dK().B && this.d == cbs.a.b) {
               this.a(this.p(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            ehd $$2 = $$0.bp().d(this.di());
            this.p(this.dp(), this.dr() + $$2.d * 0.015 * (double)$$1, this.dv());
            if (this.dK().B) {
               this.ad = this.dr();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.dn().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aow.xP, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean E() {
      bii $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof akl) || !$$0.G_();
   }

   @Override
   protected cix p() {
      return this.i.p();
   }

   @Override
   public boolean z() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected eha a(ehd $$0, ehd $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eha $$0) {
      bii $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof biy $$3) {
         $$2 += cng.a(this.i, $$3.eQ());
      }

      bii $$4 = this.v();
      bhg $$5 = this.dL().a(this, (bii)($$4 == null ? this : $$4));
      this.j = true;
      aov $$6 = aow.xN;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == bim.E) {
            return;
         }

         if ($$1 instanceof biy $$7) {
            if ($$4 instanceof biy) {
               cng.a($$7, $$4);
               cng.b((biy)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.dn().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dK() instanceof akk && this.dK().Y() && this.D()) {
         gu $$9 = $$1.dk();
         if (this.dK().g($$9)) {
            bix $$10 = bim.ai.a(this.dK());
            if ($$10 != null) {
               $$10.d(ehd.c($$9));
               $$10.b($$4 instanceof akl ? (akl)$$4 : null);
               this.dK().b($$10);
               $$6 = aow.xU;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean D() {
      return cng.i(this.i);
   }

   @Override
   protected boolean a(cbm $$0) {
      return super.a($$0) || this.y() && this.d((bii)$$0) && $$0.fQ().e(this.p());
   }

   @Override
   protected aov m() {
      return aow.xO;
   }

   @Override
   public void b_(cbm $$0) {
      if (this.d((bii)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = cix.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cng.g(this.i));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qr()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void j() {
      int $$0 = this.an.b(g);
      if (this.d != cbs.a.b || $$0 <= 0) {
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
