import javax.annotation.Nullable;

public class ccl extends brp implements brs<ccm> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.33;
   private static final cvp cd = cvp.a(crv.qY, crv.qZ);
   private static final aja<ccm> ce = aje.a(ccl.class, ajc.w);
   private static final aja<Boolean> cf = aje.a(ccl.class, ajc.k);
   private static final aja<Boolean> cg = aje.a(ccl.class, ajc.k);
   private static final aja<Integer> ch = aje.a(ccl.class, ajc.b);
   private ccl.a<cka> ci;
   @Nullable
   private byy cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;

   public ccl(bqg<? extends ccl> $$0, czg $$1) {
      super($$0, $$1);
      this.gA();
   }

   public ajv gt() {
      return this.gu().a();
   }

   @Override
   protected void z() {
      this.cj = new ccl.c(this, 0.6, cd, true);
      this.bR.a(1, new bxk(this));
      this.bR.a(1, new byj(this, 1.5));
      this.bR.a(2, new byv(this));
      this.bR.a(3, new ccl.b(this));
      this.bR.a(4, this.cj);
      this.bR.a(5, new bxd(this, 1.1, 8));
      this.bR.a(6, new bxo(this, 1.0, 10.0F, 5.0F, false));
      this.bR.a(7, new bxe(this, 0.8));
      this.bR.a(8, new bxw(this, 0.3F));
      this.bR.a(9, new byg(this));
      this.bR.a(10, new bxc(this, 0.8));
      this.bR.a(11, new bzd(this, 0.8, 1.0000001E-5F));
      this.bR.a(12, new bxy(this, cka.class, 10.0F));
      this.bS.a(1, new bzm<>(this, cdc.class, false, null));
      this.bS.a(1, new bzm<>(this, cdj.class, false, cdj.bY));
   }

   public ccm gu() {
      return this.an.a(ce);
   }

   public void a(ccm $$0) {
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

   public cql gx() {
      return cql.a(this.an.a(ch));
   }

   public void a(cql $$0) {
      this.an.a(ch, $$0.a());
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, kt.ak.f(ccm.b));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, cql.o.a());
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("variant", kt.ak.b(this.gu()).toString());
      $$0.a("CollarColor", (byte)this.gx().a());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      ccm $$1 = kt.ak.a(ajv.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cql.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bre.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bre.a);
            this.g(true);
         } else {
            this.b(bre.a);
            this.g(false);
         }
      } else {
         this.b(bre.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aun v() {
      if (this.r()) {
         if (this.gr()) {
            return auo.dX;
         } else {
            return this.ag.a(4) == 0 ? auo.dY : auo.dQ;
         }
      } else {
         return auo.dR;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gy() {
      this.b(auo.dU);
   }

   @Override
   protected aun d(boy $$0) {
      return auo.dW;
   }

   @Override
   protected aun o_() {
      return auo.dS;
   }

   public static brz.a gz() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.r, 0.3F).a(bsa.c, 3.0);
   }

   @Override
   protected void a(cka $$0, boe $$1, crs $$2) {
      if (this.o($$2)) {
         this.a(auo.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gB() {
      return (float)this.g(bsa.c);
   }

   @Override
   public boolean C(bqa $$0) {
      return $$0.a(this.dN().b((bqt)this), this.gB());
   }

   @Override
   public void l() {
      super.l();
      if (this.cj != null && this.cj.i() && !this.r() && this.ah % 100 == 0) {
         this.a(auo.dV, 1.0F, 1.0F);
      }

      this.gC();
   }

   private void gC() {
      if ((this.gv() || this.gw()) && this.ah % 5 == 0) {
         this.a(auo.dX, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
      return axm.i($$0, this.cl, this.ck);
   }

   public float H(float $$0) {
      return axm.i($$0, this.cn, this.cm);
   }

   public float I(float $$0) {
      return axm.i($$0, this.cp, this.co);
   }

   @Nullable
   public ccl b(apu $$0, bpu $$1) {
      ccl $$2 = bqg.p.a((czg)$$0);
      if ($$2 != null && $$1 instanceof ccl $$3) {
         if (this.ag.h()) {
            $$2.a(this.gu());
         } else {
            $$2.a($$3.gu());
         }

         if (this.r()) {
            $$2.b(this.W_());
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
   public boolean a(cci $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof ccl $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      avt<ccm> $$5 = $$4 ? avf.b : avf.a;
      kt.ak.a($$5, $$0.E_()).ifPresent($$0x -> this.a((ccm)$$0x.a()));
      apu $$6 = $$0.E();
      if ($$6.a().a(this.dm(), avp.n).b()) {
         this.a(kt.ak.f(ccm.k));
         this.fS();
      }

      return $$3;
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      crn $$3 = $$2.f();
      if (this.dM().B) {
         if (this.r() && this.j($$0)) {
            return bof.a;
         } else {
            return !this.o($$2) || !(this.ex() < this.eO()) && this.r() ? bof.d : bof.a;
         }
      } else {
         if (this.r()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cqm)) {
                  if ($$3.y() && this.o($$2) && this.ex() < this.eO()) {
                     this.a($$0, $$1, $$2);
                     this.c((float)$$3.z().a());
                     return bof.b;
                  }

                  bof $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.p_()) {
                     this.y(!this.gn());
                  }

                  return $$5;
               }

               cql $$4 = ((cqm)$$3).c();
               if ($$4 != this.gx()) {
                  this.a($$4);
                  $$2.a(1, $$0);
                  this.fS();
                  return bof.b;
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
            return bof.b;
         }

         bof $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fS();
         }

         return $$6;
      }
   }

   @Override
   public boolean o(crs $$0) {
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
         this.ci = new ccl.a<>(this, cka.class, 16.0F, 0.8, 1.33);
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

   static class a<T extends bqt> extends bwx<T> {
      private final ccl i;

      public a(ccl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqf.e::test);
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

   static class b extends bxq {
      private final ccl a;
      @Nullable
      private cka b;
      @Nullable
      private id c;
      private int d;

      public b(ccl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gn()) {
            return false;
         } else {
            bqt $$0 = this.a.P_();
            if ($$0 instanceof cka) {
               this.b = (cka)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g((bqa)this.b) > 100.0) {
                  return false;
               }

               id $$1 = this.b.dm();
               dpi $$2 = this.a.dM().a_($$1);
               if ($$2.a(ave.R)) {
                  this.c = $$2.d(dca.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new id($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (ccl $$1 : this.a.dM().a(ccl.class, new ese(this.c).g(2.0))) {
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
         axt $$0 = this.a.ei();
         id.a $$1 = new id.a();
         $$1.g(this.a.gb() ? this.a.gc().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         ens $$2 = this.a.dM().o().aM().getLootTable(eni.aw);
         enq $$3 = new enq.a((apu)this.a.dM()).a(epx.f, this.a.dk()).a(epx.a, this.a).a(epw.i);

         for (crs $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cgk(
                     this.a.dM(),
                     (double)$$1.u() - (double)axm.a(this.a.aX * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)axm.b(this.a.aX * (float) (Math.PI / 180.0)),
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
            if (this.a.g((bqa)this.b) < 2.5) {
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

   static class c extends byy {
      @Nullable
      private cka c;
      private final ccl d;

      public c(ccl $$0, double $$1, cvp $$2, boolean $$3) {
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
