import javax.annotation.Nullable;

public class cct extends cbv {
   private static final aec<Byte> g = aef.a(cct.class, aee.a);
   private static final aec<Boolean> h = aef.a(cct.class, aee.k);
   private cja i = new cja(cjd.uV);
   private boolean j;
   public int f;

   public cct(bip<? extends cct> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cct(cpq $$0, bjb $$1, cja $$2) {
      super(bip.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cnl.g($$2));
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

      bil $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.y()) && $$0 != null) {
         if (!this.E()) {
            if (!this.dK().B && this.d == cbv.a.b) {
               this.a(this.p(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            ehi $$2 = $$0.bp().d(this.di());
            this.p(this.dp(), this.dr() + $$2.d * 0.015 * (double)$$1, this.dv());
            if (this.dK().B) {
               this.ad = this.dr();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.dn().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(aoz.xP, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean E() {
      bil $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof ako) || !$$0.G_();
   }

   @Override
   protected cja p() {
      return this.i.p();
   }

   @Override
   public boolean z() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ehf a(ehi $$0, ehi $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ehf $$0) {
      bil $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bjb $$3) {
         $$2 += cnl.a(this.i, $$3.eQ());
      }

      bil $$4 = this.v();
      bhj $$5 = this.dL().a(this, (bil)($$4 == null ? this : $$4));
      this.j = true;
      aoy $$6 = aoz.xN;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == bip.E) {
            return;
         }

         if ($$1 instanceof bjb $$7) {
            if ($$4 instanceof bjb) {
               cnl.a($$7, $$4);
               cnl.b((bjb)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.dn().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dK() instanceof akn && this.dK().Y() && this.D()) {
         gw $$9 = $$1.dk();
         if (this.dK().g($$9)) {
            bja $$10 = bip.ai.a(this.dK());
            if ($$10 != null) {
               $$10.d(ehi.c($$9));
               $$10.b($$4 instanceof ako ? (ako)$$4 : null);
               this.dK().b($$10);
               $$6 = aoz.xU;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean D() {
      return cnl.i(this.i);
   }

   @Override
   protected boolean a(cbp $$0) {
      return super.a($$0) || this.y() && this.d((bil)$$0) && $$0.fQ().e(this.p());
   }

   @Override
   protected aoy m() {
      return aoz.xO;
   }

   @Override
   public void b_(cbp $$0) {
      if (this.d((bil)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = cja.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cnl.g(this.i));
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qu()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void j() {
      int $$0 = this.an.b(g);
      if (this.d != cbv.a.b || $$0 <= 0) {
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
