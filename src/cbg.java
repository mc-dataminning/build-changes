import javax.annotation.Nullable;

public class cbg extends bqk implements bqn<cbh> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.33;
   private static final ctk cd = ctk.a(cqn.qY, cqn.qZ);
   private static final aim<cbh> ce = aiq.a(cbg.class, aio.w);
   private static final aim<Boolean> cf = aiq.a(cbg.class, aio.k);
   private static final aim<Boolean> cg = aiq.a(cbg.class, aio.k);
   private static final aim<Integer> ch = aiq.a(cbg.class, aio.b);
   private cbg.a<cis> ci;
   @Nullable
   private bxt cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;

   public cbg(bpc<? extends cbg> $$0, cwz $$1) {
      super($$0, $$1);
      this.gA();
   }

   public ajh gt() {
      return this.gu().a();
   }

   @Override
   protected void z() {
      this.cj = new cbg.c(this, 0.6, cd, true);
      this.bR.a(1, new bwf(this));
      this.bR.a(1, new bxe(this, 1.5));
      this.bR.a(2, new bxq(this));
      this.bR.a(3, new cbg.b(this));
      this.bR.a(4, this.cj);
      this.bR.a(5, new bvy(this, 1.1, 8));
      this.bR.a(6, new bwj(this, 1.0, 10.0F, 5.0F, false));
      this.bR.a(7, new bvz(this, 0.8));
      this.bR.a(8, new bwr(this, 0.3F));
      this.bR.a(9, new bxb(this));
      this.bR.a(10, new bvx(this, 0.8));
      this.bR.a(11, new bxy(this, 0.8, 1.0000001E-5F));
      this.bR.a(12, new bwt(this, cis.class, 10.0F));
      this.bS.a(1, new byh<>(this, cbx.class, false, null));
      this.bS.a(1, new byh<>(this, cce.class, false, cce.bY));
   }

   public cbh gu() {
      return this.an.a(ce);
   }

   public void a(cbh $$0) {
      this.an.a(ce, $$0);
   }

   public void z(boolean $$0) {
      this.an.a(cf, $$0);
   }

   public boolean gv() {
      return this.an.a(cf);
   }

   public void A(boolean $$0) {
      this.an.a(cg, $$0);
   }

   public boolean gw() {
      return this.an.a(cg);
   }

   public cpb gx() {
      return cpb.a(this.an.a(ch));
   }

   public void a(cpb $$0) {
      this.an.a(ch, $$0.a());
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, ki.ak.f(cbh.b));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, cpb.o.a());
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("variant", ki.ak.b(this.gu()).toString());
      $$0.a("CollarColor", (byte)this.gx().a());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      cbh $$1 = ki.ak.a(ajh.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cpb.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bpz.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bpz.a);
            this.g(true);
         } else {
            this.b(bpz.a);
            this.g(false);
         }
      } else {
         this.b(bpz.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected atx v() {
      if (this.r()) {
         if (this.gr()) {
            return aty.dS;
         } else {
            return this.ag.a(4) == 0 ? aty.dT : aty.dL;
         }
      } else {
         return aty.dM;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gy() {
      this.b(aty.dP);
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.dR;
   }

   @Override
   protected atx n_() {
      return aty.dN;
   }

   public static bqu.a gz() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.r, 0.3F).a(bqv.c, 3.0);
   }

   @Override
   protected void a(cis $$0, bnb $$1, cqk $$2) {
      if (this.o($$2)) {
         this.a(aty.dO, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gB() {
      return (float)this.g(bqv.c);
   }

   @Override
   public boolean C(bow $$0) {
      return $$0.a(this.dN().b((bpo)this), this.gB());
   }

   @Override
   public void l() {
      super.l();
      if (this.cj != null && this.cj.i() && !this.r() && this.ah % 100 == 0) {
         this.a(aty.dQ, 1.0F, 1.0F);
      }

      this.gC();
   }

   private void gC() {
      if ((this.gv() || this.gw()) && this.ah % 5 == 0) {
         this.a(aty.dS, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gD();
      this.gE();
   }

   private void gD() {
      this.cl = this.ck;
      this.cn = this.cm;
      if (this.gv()) {
         this.ck = Math.min(1.0F, this.ck + 0.15F);
         this.cm = Math.min(1.0F, this.cm + 0.08F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.22F);
         this.cm = Math.max(0.0F, this.cm - 0.13F);
      }
   }

   private void gE() {
      this.cp = this.co;
      if (this.gw()) {
         this.co = Math.min(1.0F, this.co + 0.1F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   public float G(float $$0) {
      return aww.i($$0, this.cl, this.ck);
   }

   public float H(float $$0) {
      return aww.i($$0, this.cn, this.cm);
   }

   public float I(float $$0) {
      return aww.i($$0, this.cp, this.co);
   }

   @Nullable
   public cbg b(apf $$0, bor $$1) {
      cbg $$2 = bpc.p.a((cwz)$$0);
      if ($$2 != null && $$1 instanceof cbg $$3) {
         if (this.ag.h()) {
            $$2.a(this.gu());
         } else {
            $$2.a($$3.gu());
         }

         if (this.r()) {
            $$2.b(this.d());
            $$2.b(true, true);
            if (this.ag.h()) {
               $$2.a(this.gx());
            } else {
               $$2.a($$3.gx());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cbd $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof cbg $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ao() > 0.9F;
      avd<cbh> $$5 = $$4 ? auo.b : auo.a;
      ki.ak.a($$5, $$0.E_()).ifPresent($$0x -> this.a((cbh)$$0x.a()));
      apf $$6 = $$0.E();
      if ($$6.a().a(this.dm(), auz.n).b()) {
         this.a(ki.ak.f(cbh.k));
         this.fS();
      }

      return $$3;
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      cqf $$3 = $$2.d();
      if (this.dM().B) {
         if (this.r() && this.j($$0)) {
            return bnc.a;
         } else {
            return !this.o($$2) || !(this.ex() < this.eO()) && this.r() ? bnc.d : bnc.a;
         }
      } else {
         if (this.r()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cpc)) {
                  if ($$3.v() && this.o($$2) && this.ex() < this.eO()) {
                     this.a($$0, $$1, $$2);
                     this.c((float)$$3.w().a());
                     return bnc.b;
                  }

                  bnc $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.y(!this.gn());
                  }

                  return $$5;
               }

               cpb $$4 = ((cpc)$$3).c();
               if ($$4 != this.gx()) {
                  this.a($$4);
                  $$2.a(1, $$0);
                  this.fS();
                  return bnc.b;
               }
            }
         } else if (this.o($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.y(true);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }

            this.fS();
            return bnc.b;
         }

         bnc $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fS();
         }

         return $$6;
      }
   }

   @Override
   public boolean o(cqk $$0) {
      return cd.a($$0);
   }

   @Override
   public boolean h(double $$0) {
      return !this.r() && this.ah > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gA();
   }

   protected void gA() {
      if (this.ci == null) {
         this.ci = new cbg.a<>(this, cis.class, 16.0F, 0.8, 1.33);
      }

      this.bR.a(this.ci);
      if (!this.r()) {
         this.bR.a(4, this.ci);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bpo> extends bvs<T> {
      private final cbg i;

      public a(cbg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bpb.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.r() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.r() && super.b();
      }
   }

   static class b extends bwl {
      private final cbg a;
      @Nullable
      private cis b;
      @Nullable
      private ib c;
      private int d;

      public b(cbg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gn()) {
            return false;
         } else {
            bpo $$0 = this.a.P_();
            if ($$0 instanceof cis) {
               this.b = (cis)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g((bow)this.b) > 100.0) {
                  return false;
               }

               ib $$1 = this.b.dm();
               dmz $$2 = this.a.dM().a_($$1);
               if ($$2.a(aun.R)) {
                  this.c = $$2.d(czt.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ib($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cbg $$1 : this.a.dM().a(cbg.class, new epm(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gv() || $$1.gw())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.r() && !this.a.gn() && this.b != null && this.b.fI() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.dM().f(1.0F);
         if (this.b.gd() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dM().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         axd $$0 = this.a.ei();
         ib.a $$1 = new ib.a();
         $$1.g(this.a.gb() ? this.a.gc().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         elc $$2 = this.a.dM().o().aM().getLootTable(eks.aw);
         ela $$3 = new ela.a((apf)this.a.dM()).a(enf.f, this.a.dk()).a(enf.a, this.a).a(ene.i);

         for (cqk $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cfd(
                     this.a.dM(),
                     (double)$$1.u() - (double)aww.a(this.a.aX * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aww.b(this.a.aX * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bow)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends bxt {
      @Nullable
      private cis c;
      private final cbg d;

      public c(cbg $$0, double $$1, ctk $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.ei().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ei().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }
   }
}
