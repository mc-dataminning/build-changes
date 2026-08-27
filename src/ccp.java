import javax.annotation.Nullable;

public class ccp extends cbr {
   private static final adx<Byte> g = aea.a(ccp.class, adz.a);
   private static final adx<Boolean> h = aea.a(ccp.class, adz.k);
   private ciw i = new ciw(ciz.uV);
   private boolean j;
   public int f;

   public ccp(bik<? extends ccp> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccp(cpk $$0, biw $$1, ciw $$2) {
      super(bik.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cnf.g($$2));
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

      big $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.y()) && $$0 != null) {
         if (!this.E()) {
            if (!this.dK().B && this.d == cbr.a.b) {
               this.a(this.p(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            ehf $$2 = $$0.bp().d(this.di());
            this.p(this.dp(), this.dr() + $$2.d * 0.015 * (double)$$1, this.dv());
            if (this.dK().B) {
               this.ad = this.dr();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.dn().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aou.xK, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean E() {
      big $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof akj) || !$$0.G_();
   }

   @Override
   protected ciw p() {
      return this.i.p();
   }

   @Override
   public boolean z() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ehc a(ehf $$0, ehf $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ehc $$0) {
      big $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof biw $$3) {
         $$2 += cnf.a(this.i, $$3.eQ());
      }

      big $$4 = this.v();
      bhe $$5 = this.dL().a(this, (big)($$4 == null ? this : $$4));
      this.j = true;
      aot $$6 = aou.xI;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == bik.E) {
            return;
         }

         if ($$1 instanceof biw $$7) {
            if ($$4 instanceof biw) {
               cnf.a($$7, $$4);
               cnf.b((biw)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.dn().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dK() instanceof aki && this.dK().Y() && this.D()) {
         gv $$9 = $$1.dk();
         if (this.dK().g($$9)) {
            biv $$10 = bik.ai.a(this.dK());
            if ($$10 != null) {
               $$10.d(ehf.c($$9));
               $$10.b($$4 instanceof akj ? (akj)$$4 : null);
               this.dK().b($$10);
               $$6 = aou.xP;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean D() {
      return cnf.i(this.i);
   }

   @Override
   protected boolean a(cbl $$0) {
      return super.a($$0) || this.y() && this.d((big)$$0) && $$0.fQ().e(this.p());
   }

   @Override
   protected aot m() {
      return aou.xJ;
   }

   @Override
   public void b_(cbl $$0) {
      if (this.d((big)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = ciw.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cnf.g(this.i));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qs()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void j() {
      int $$0 = this.an.b(g);
      if (this.d != cbr.a.b || $$0 <= 0) {
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
