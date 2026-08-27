import javax.annotation.Nullable;

public class cbh extends bql implements bqo<cbi> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.33;
   private static final ctm cd = ctm.a(cqp.qY, cqp.qZ);
   private static final aim<cbi> ce = aiq.a(cbh.class, aio.w);
   private static final aim<Boolean> cf = aiq.a(cbh.class, aio.k);
   private static final aim<Boolean> cg = aiq.a(cbh.class, aio.k);
   private static final aim<Integer> ch = aiq.a(cbh.class, aio.b);
   private cbh.a<ciu> ci;
   @Nullable
   private bxu cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;

   public cbh(bpd<? extends cbh> $$0, cxb $$1) {
      super($$0, $$1);
      this.gA();
   }

   public ajh gt() {
      return this.gu().a();
   }

   @Override
   protected void z() {
      this.cj = new cbh.c(this, 0.6, cd, true);
      this.bR.a(1, new bwg(this));
      this.bR.a(1, new bxf(this, 1.5));
      this.bR.a(2, new bxr(this));
      this.bR.a(3, new cbh.b(this));
      this.bR.a(4, this.cj);
      this.bR.a(5, new bvz(this, 1.1, 8));
      this.bR.a(6, new bwk(this, 1.0, 10.0F, 5.0F, false));
      this.bR.a(7, new bwa(this, 0.8));
      this.bR.a(8, new bws(this, 0.3F));
      this.bR.a(9, new bxc(this));
      this.bR.a(10, new bvy(this, 0.8));
      this.bR.a(11, new bxz(this, 0.8, 1.0000001E-5F));
      this.bR.a(12, new bwu(this, ciu.class, 10.0F));
      this.bS.a(1, new byi<>(this, cby.class, false, null));
      this.bS.a(1, new byi<>(this, ccf.class, false, ccf.bY));
   }

   public cbi gu() {
      return this.an.a(ce);
   }

   public void a(cbi $$0) {
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

   public cpd gx() {
      return cpd.a(this.an.a(ch));
   }

   public void a(cpd $$0) {
      this.an.a(ch, $$0.a());
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, ki.ak.f(cbi.b));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, cpd.o.a());
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
      cbi $$1 = ki.ak.a(ajh.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cpd.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bqa.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bqa.a);
            this.g(true);
         } else {
            this.b(bqa.a);
            this.g(false);
         }
      } else {
         this.b(bqa.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected atx v() {
      if (this.r()) {
         if (this.gr()) {
            return aty.dW;
         } else {
            return this.ag.a(4) == 0 ? aty.dX : aty.dP;
         }
      } else {
         return aty.dQ;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gy() {
      this.b(aty.dT);
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.dV;
   }

   @Override
   protected atx n_() {
      return aty.dR;
   }

   public static bqv.a gz() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.r, 0.3F).a(bqw.c, 3.0);
   }

   @Override
   protected void a(ciu $$0, bnc $$1, cqm $$2) {
      if (this.o($$2)) {
         this.a(aty.dS, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gB() {
      return (float)this.g(bqw.c);
   }

   @Override
   public boolean C(box $$0) {
      return $$0.a(this.dN().b((bpp)this), this.gB());
   }

   @Override
   public void l() {
      super.l();
      if (this.cj != null && this.cj.i() && !this.r() && this.ah % 100 == 0) {
         this.a(aty.dU, 1.0F, 1.0F);
      }

      this.gC();
   }

   private void gC() {
      if ((this.gv() || this.gw()) && this.ah % 5 == 0) {
         this.a(aty.dW, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
   public cbh b(apf $$0, bos $$1) {
      cbh $$2 = bpd.q.a((cxb)$$0);
      if ($$2 != null && $$1 instanceof cbh $$3) {
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
   public boolean a(cbe $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof cbh $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ao() > 0.9F;
      avd<cbi> $$5 = $$4 ? auo.b : auo.a;
      ki.ak.a($$5, $$0.E_()).ifPresent($$0x -> this.a((cbi)$$0x.a()));
      apf $$6 = $$0.E();
      if ($$6.a().a(this.dm(), auz.n).b()) {
         this.a(ki.ak.f(cbi.k));
         this.fS();
      }

      return $$3;
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      cqh $$3 = $$2.d();
      if (this.dM().B) {
         if (this.r() && this.j($$0)) {
            return bnd.a;
         } else {
            return !this.o($$2) || !(this.ex() < this.eO()) && this.r() ? bnd.d : bnd.a;
         }
      } else {
         if (this.r()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cpe)) {
                  if ($$3.v() && this.o($$2) && this.ex() < this.eO()) {
                     this.a($$0, $$1, $$2);
                     this.c((float)$$3.w().a());
                     return bnd.b;
                  }

                  bnd $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.y(!this.gn());
                  }

                  return $$5;
               }

               cpd $$4 = ((cpe)$$3).c();
               if ($$4 != this.gx()) {
                  this.a($$4);
                  $$2.a(1, $$0);
                  this.fS();
                  return bnd.b;
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
            return bnd.b;
         }

         bnd $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fS();
         }

         return $$6;
      }
   }

   @Override
   public boolean o(cqm $$0) {
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
         this.ci = new cbh.a<>(this, ciu.class, 16.0F, 0.8, 1.33);
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

   static class a<T extends bpp> extends bvt<T> {
      private final cbh i;

      public a(cbh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bpc.e::test);
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

   static class b extends bwm {
      private final cbh a;
      @Nullable
      private ciu b;
      @Nullable
      private ib c;
      private int d;

      public b(cbh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gn()) {
            return false;
         } else {
            bpp $$0 = this.a.P_();
            if ($$0 instanceof ciu) {
               this.b = (ciu)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g((box)this.b) > 100.0) {
                  return false;
               }

               ib $$1 = this.b.dm();
               dnb $$2 = this.a.dM().a_($$1);
               if ($$2.a(aun.R)) {
                  this.c = $$2.d(czv.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ib($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cbh $$1 : this.a.dM().a(cbh.class, new epo(this.c).g(2.0))) {
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
         ele $$2 = this.a.dM().o().aM().getLootTable(eku.aw);
         elc $$3 = new elc.a((apf)this.a.dM()).a(enh.f, this.a.dk()).a(enh.a, this.a).a(eng.i);

         for (cqm $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cfe(
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
            if (this.a.g((box)this.b) < 2.5) {
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

   static class c extends bxu {
      @Nullable
      private ciu c;
      private final cbh d;

      public c(cbh $$0, double $$1, ctm $$2, boolean $$3) {
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
