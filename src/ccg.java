import javax.annotation.Nullable;

public class ccg extends brk implements brn<cch> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.33;
   private static final cvg cd = cvg.a(crm.qY, crm.qZ);
   private static final aiy<cch> ce = ajc.a(ccg.class, aja.w);
   private static final aiy<Boolean> cf = ajc.a(ccg.class, aja.k);
   private static final aiy<Boolean> cg = ajc.a(ccg.class, aja.k);
   private static final aiy<Integer> ch = ajc.a(ccg.class, aja.b);
   private ccg.a<cjt> ci;
   @Nullable
   private byt cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;

   public ccg(bqb<? extends ccg> $$0, cyx $$1) {
      super($$0, $$1);
      this.gA();
   }

   public ajt gt() {
      return this.gu().a();
   }

   @Override
   protected void z() {
      this.cj = new ccg.c(this, 0.6, cd, true);
      this.bR.a(1, new bxf(this));
      this.bR.a(1, new bye(this, 1.5));
      this.bR.a(2, new byq(this));
      this.bR.a(3, new ccg.b(this));
      this.bR.a(4, this.cj);
      this.bR.a(5, new bwy(this, 1.1, 8));
      this.bR.a(6, new bxj(this, 1.0, 10.0F, 5.0F, false));
      this.bR.a(7, new bwz(this, 0.8));
      this.bR.a(8, new bxr(this, 0.3F));
      this.bR.a(9, new byb(this));
      this.bR.a(10, new bwx(this, 0.8));
      this.bR.a(11, new byy(this, 0.8, 1.0000001E-5F));
      this.bR.a(12, new bxt(this, cjt.class, 10.0F));
      this.bS.a(1, new bzh<>(this, ccx.class, false, null));
      this.bS.a(1, new bzh<>(this, cde.class, false, cde.bY));
   }

   public cch gu() {
      return this.an.a(ce);
   }

   public void a(cch $$0) {
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

   public cqc gx() {
      return cqc.a(this.an.a(ch));
   }

   public void a(cqc $$0) {
      this.an.a(ch, $$0.a());
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ce, kr.ak.f(cch.b));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, cqc.o.a());
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("variant", kr.ak.b(this.gu()).toString());
      $$0.a("CollarColor", (byte)this.gx().a());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      cch $$1 = kr.ak.a(ajt.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cqc.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bqz.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bqz.a);
            this.g(true);
         } else {
            this.b(bqz.a);
            this.g(false);
         }
      } else {
         this.b(bqz.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aul v() {
      if (this.r()) {
         if (this.gr()) {
            return aum.dX;
         } else {
            return this.ag.a(4) == 0 ? aum.dY : aum.dQ;
         }
      } else {
         return aum.dR;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gy() {
      this.b(aum.dU);
   }

   @Override
   protected aul d(bot $$0) {
      return aum.dW;
   }

   @Override
   protected aul o_() {
      return aum.dS;
   }

   public static bru.a gz() {
      return bqq.A().a(brv.q, 10.0).a(brv.r, 0.3F).a(brv.c, 3.0);
   }

   @Override
   protected void a(cjt $$0, bnz $$1, crj $$2) {
      if (this.o($$2)) {
         this.a(aum.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gB() {
      return (float)this.g(brv.c);
   }

   @Override
   public boolean C(bpv $$0) {
      return $$0.a(this.dN().b((bqo)this), this.gB());
   }

   @Override
   public void l() {
      super.l();
      if (this.cj != null && this.cj.i() && !this.r() && this.ah % 100 == 0) {
         this.a(aum.dV, 1.0F, 1.0F);
      }

      this.gC();
   }

   private void gC() {
      if ((this.gv() || this.gw()) && this.ah % 5 == 0) {
         this.a(aum.dX, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
      return axk.i($$0, this.cl, this.ck);
   }

   public float H(float $$0) {
      return axk.i($$0, this.cn, this.cm);
   }

   public float I(float $$0) {
      return axk.i($$0, this.cp, this.co);
   }

   @Nullable
   public ccg b(aps $$0, bpp $$1) {
      ccg $$2 = bqb.p.a((cyx)$$0);
      if ($$2 != null && $$1 instanceof ccg $$3) {
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
   public boolean a(ccd $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof ccg $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      avr<cch> $$5 = $$4 ? avd.b : avd.a;
      kr.ak.a($$5, $$0.E_()).ifPresent($$0x -> this.a((cch)$$0x.a()));
      aps $$6 = $$0.E();
      if ($$6.a().a(this.dm(), avn.n).b()) {
         this.a(kr.ak.f(cch.k));
         this.fS();
      }

      return $$3;
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      cre $$3 = $$2.f();
      if (this.dM().B) {
         if (this.r() && this.j($$0)) {
            return boa.a;
         } else {
            return !this.o($$2) || !(this.ex() < this.eO()) && this.r() ? boa.d : boa.a;
         }
      } else {
         if (this.r()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cqd)) {
                  if ($$3.y() && this.o($$2) && this.ex() < this.eO()) {
                     this.a($$0, $$1, $$2);
                     this.c((float)$$3.z().a());
                     return boa.b;
                  }

                  boa $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.p_()) {
                     this.y(!this.gn());
                  }

                  return $$5;
               }

               cqc $$4 = ((cqd)$$3).c();
               if ($$4 != this.gx()) {
                  this.a($$4);
                  $$2.a(1, $$0);
                  this.fS();
                  return boa.b;
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
            return boa.b;
         }

         boa $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fS();
         }

         return $$6;
      }
   }

   @Override
   public boolean o(crj $$0) {
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
         this.ci = new ccg.a<>(this, cjt.class, 16.0F, 0.8, 1.33);
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

   static class a<T extends bqo> extends bws<T> {
      private final ccg i;

      public a(ccg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqa.e::test);
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

   static class b extends bxl {
      private final ccg a;
      @Nullable
      private cjt b;
      @Nullable
      private ib c;
      private int d;

      public b(ccg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gn()) {
            return false;
         } else {
            bqo $$0 = this.a.P_();
            if ($$0 instanceof cjt) {
               this.b = (cjt)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g((bpv)this.b) > 100.0) {
                  return false;
               }

               ib $$1 = this.b.dm();
               doz $$2 = this.a.dM().a_($$1);
               if ($$2.a(avc.R)) {
                  this.c = $$2.d(dbr.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ib($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (ccg $$1 : this.a.dM().a(ccg.class, new erv(this.c).g(2.0))) {
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
         axr $$0 = this.a.ei();
         ib.a $$1 = new ib.a();
         $$1.g(this.a.gb() ? this.a.gc().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         enj $$2 = this.a.dM().o().aM().getLootTable(emz.aw);
         enh $$3 = new enh.a((aps)this.a.dM()).a(epo.f, this.a.dk()).a(epo.a, this.a).a(epn.i);

         for (crj $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cgd(
                     this.a.dM(),
                     (double)$$1.u() - (double)axk.a(this.a.aX * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)axk.b(this.a.aX * (float) (Math.PI / 180.0)),
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
            if (this.a.g((bpv)this.b) < 2.5) {
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

   static class c extends byt {
      @Nullable
      private cjt c;
      private final ccg d;

      public c(ccg $$0, double $$1, cvg $$2, boolean $$3) {
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
