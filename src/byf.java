import javax.annotation.Nullable;

public class byf extends bnj implements bnm<byg> {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double bZ = 1.33;
   private static final cqh ca = cqh.a(cnj.qY, cnj.qZ);
   private static final agn<byg> cb = agq.a(byf.class, agp.w);
   private static final agn<Boolean> cc = agq.a(byf.class, agp.k);
   private static final agn<Boolean> cd = agq.a(byf.class, agp.k);
   private static final agn<Integer> ce = agq.a(byf.class, agp.b);
   private byf.a<cfq> cf;
   @Nullable
   private bus cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;

   public byf(bmc<? extends byf> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public ahh gl() {
      return this.gm().a();
   }

   @Override
   protected void B() {
      this.cg = new byf.c(this, 0.6, ca, true);
      this.bP.a(1, new bte(this));
      this.bP.a(1, new bud(this, 1.5));
      this.bP.a(2, new bup(this));
      this.bP.a(3, new byf.b(this));
      this.bP.a(4, this.cg);
      this.bP.a(5, new bsx(this, 1.1, 8));
      this.bP.a(6, new bti(this, 1.0, 10.0F, 5.0F, false));
      this.bP.a(7, new bsy(this, 0.8));
      this.bP.a(8, new btq(this, 0.3F));
      this.bP.a(9, new bua(this));
      this.bP.a(10, new bsw(this, 0.8));
      this.bP.a(11, new bux(this, 0.8, 1.0000001E-5F));
      this.bP.a(12, new bts(this, cfq.class, 10.0F));
      this.bQ.a(1, new bvg<>(this, byw.class, false, null));
      this.bQ.a(1, new bvg<>(this, bzd.class, false, bzd.bV));
   }

   public byg gm() {
      return this.an.b(cb);
   }

   public void a(byg $$0) {
      this.an.b(cb, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gn() {
      return this.an.b(cc);
   }

   public void B(boolean $$0) {
      this.an.b(cd, $$0);
   }

   public boolean go() {
      return this.an.b(cd);
   }

   public clv gp() {
      return clv.a(this.an.b(ce));
   }

   public void a(clv $$0) {
      this.an.b(ce, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cb, kd.ak.e(byg.b));
      this.an.a(cc, false);
      this.an.a(cd, false);
      this.an.a(ce, clv.o.a());
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("variant", kd.ak.b(this.gm()).toString());
      $$0.a("CollarColor", (byte)this.gp().a());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      byg $$1 = kd.ak.a(ahh.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(clv.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void aa() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bna.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bna.a);
            this.g(true);
         } else {
            this.b(bna.a);
            this.g(false);
         }
      } else {
         this.b(bna.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected ars y() {
      if (this.u()) {
         if (this.gj()) {
            return art.dO;
         } else {
            return this.ag.a(4) == 0 ? art.dP : art.dH;
         }
      } else {
         return art.dI;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gq() {
      this.a(art.dL, this.eW(), this.eX());
   }

   @Override
   protected ars d(bkv $$0) {
      return art.dN;
   }

   @Override
   protected ars n_() {
      return art.dJ;
   }

   public static bnt.a gr() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.o, 0.3F).a(bnu.c, 3.0);
   }

   @Override
   protected void a(cfq $$0, bkb $$1, cng $$2) {
      if (this.m($$2)) {
         this.a(art.dK, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gs() {
      return (float)this.g(bnu.c);
   }

   @Override
   public boolean B(blw $$0) {
      return $$0.a(this.dM().b((bmo)this), this.gs());
   }

   @Override
   public void l() {
      super.l();
      if (this.cg != null && this.cg.i() && !this.u() && this.ah % 100 == 0) {
         this.a(art.dM, 1.0F, 1.0F);
      }

      this.gt();
   }

   private void gt() {
      if ((this.gn() || this.go()) && this.ah % 5 == 0) {
         this.a(art.dO, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gu();
      this.gv();
   }

   private void gu() {
      this.ci = this.ch;
      this.ck = this.cj;
      if (this.gn()) {
         this.ch = Math.min(1.0F, this.ch + 0.15F);
         this.cj = Math.min(1.0F, this.cj + 0.08F);
      } else {
         this.ch = Math.max(0.0F, this.ch - 0.22F);
         this.cj = Math.max(0.0F, this.cj - 0.13F);
      }
   }

   private void gv() {
      this.cm = this.cl;
      if (this.go()) {
         this.cl = Math.min(1.0F, this.cl + 0.1F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.13F);
      }
   }

   public float D(float $$0) {
      return aup.i($$0, this.ci, this.ch);
   }

   public float E(float $$0) {
      return aup.i($$0, this.ck, this.cj);
   }

   public float F(float $$0) {
      return aup.i($$0, this.cm, this.cl);
   }

   @Nullable
   public byf b(ane $$0, blr $$1) {
      byf $$2 = bmc.o.a((ctx)$$0);
      if ($$2 != null && $$1 instanceof byf $$3) {
         if (this.ag.h()) {
            $$2.a(this.gm());
         } else {
            $$2.a($$3.gm());
         }

         if (this.u()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.gp());
            } else {
               $$2.a($$3.gp());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(byc $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof byf $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ap() > 0.9F;
      asx<byg> $$6 = $$5 ? asj.b : asj.a;
      kd.ak.b($$6).flatMap($$1x -> $$1x.a($$0.F_())).ifPresent($$0x -> this.a((byg)$$0x.a()));
      ane $$7 = $$0.E();
      if ($$7.a().a(this.dl(), ast.n).b()) {
         this.a(kd.ak.e(byg.k));
         this.fK();
      }

      return $$3;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      cnb $$3 = $$2.d();
      if (this.dL().B) {
         if (this.u() && this.j($$0)) {
            return bkc.a;
         } else {
            return !this.m($$2) || !(this.ev() < this.eM()) && this.u() ? bkc.d : bkc.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof clw)) {
                  if ($$3.t() && this.m($$2) && this.ev() < this.eM()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.u().a());
                     return bkc.b;
                  }

                  bkc $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.gf());
                  }

                  return $$5;
               }

               clv $$4 = ((clw)$$3).d();
               if ($$4 != this.gp()) {
                  this.a($$4);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  this.fK();
                  return bkc.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }

            this.fK();
            return bkc.b;
         }

         bkc $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fK();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cng $$0) {
      return ca.a($$0);
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ah > 2400;
   }

   @Override
   protected void w() {
      if (this.cf == null) {
         this.cf = new byf.a<>(this, cfq.class, 16.0F, 0.8, 1.33);
      }

      this.bP.a(this.cf);
      if (!this.u()) {
         this.bP.a(4, this.cf);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bmo> extends bsr<T> {
      private final byf i;

      public a(byf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bmb.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.u() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }
   }

   static class b extends btk {
      private final byf a;
      @Nullable
      private cfq b;
      @Nullable
      private hx c;
      private int d;

      public b(byf $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.gf()) {
            return false;
         } else {
            bmo $$0 = this.a.R_();
            if ($$0 instanceof cfq) {
               this.b = (cfq)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((blw)this.b) > 100.0) {
                  return false;
               }

               hx $$1 = this.b.dl();
               djp $$2 = this.a.dL().a_($$1);
               if ($$2.a(asi.R)) {
                  this.c = $$2.d(cwr.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new hx($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (byf $$1 : this.a.dL().a(byf.class, new elx(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gn() || $$1.go())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.gf() && this.b != null && this.b.fD() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dL().f(1.0F);
         if (this.b.fW() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dL().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         auw $$0 = this.a.eg();
         hx.a $$1 = new hx.a();
         $$1.g(this.a.fT() ? this.a.fU().dl() : this.a.dl());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dl());
         ehn $$2 = this.a.dL().o().aJ().getLootTable(ehd.aw);
         ehl $$3 = new ehl.a((ane)this.a.dL()).a(ejq.f, this.a.dj()).a(ejq.a, this.a).a(ejp.i);

         for (cng $$5 : $$2.a($$3)) {
            this.a
               .dL()
               .b(
                  new ccb(
                     this.a.dL(),
                     (double)$$1.u() - (double)aup.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aup.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((blw)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends bus {
      @Nullable
      private cfq c;
      private final byf d;

      public c(byf $$0, double $$1, cqh $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.eg().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eg().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }
   }
}
