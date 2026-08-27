import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cds extends bsw implements bsz<iw<cdt>> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final ajm<iw<cdt>> ce = ajq.a(cds.class, ajo.x);
   private static final ajm<Boolean> cf = ajq.a(cds.class, ajo.k);
   private static final ajm<Boolean> cg = ajq.a(cds.class, ajo.k);
   private static final ajm<Integer> ch = ajq.a(cds.class, ajo.b);
   private static final akg<cdt> ci = cdt.b;
   @Nullable
   private cds.a<clh> cj;
   @Nullable
   private caf ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public cds(brn<? extends cds> $$0, dad $$1) {
      super($$0, $$1);
      this.gB();
   }

   public akh gv() {
      return this.gw().a().a();
   }

   @Override
   protected void z() {
      this.ck = new cds.c(this, 0.6, $$0 -> $$0.a(avz.ae), true);
      this.bS.a(1, new byr(this));
      this.bS.a(1, new bzq(this, 1.5));
      this.bS.a(2, new cac(this));
      this.bS.a(3, new cds.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new byk(this, 1.1, 8));
      this.bS.a(6, new byv(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new byl(this, 0.8));
      this.bS.a(8, new bzd(this, 0.3F));
      this.bS.a(9, new bzn(this));
      this.bS.a(10, new byj(this, 0.8));
      this.bS.a(11, new cak(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new bzf(this, clh.class, 10.0F));
      this.bT.a(1, new cat<>(this, cej.class, false, null));
      this.bT.a(1, new cat<>(this, ceq.class, false, ceq.bY));
   }

   public iw<cdt> gw() {
      return this.ao.a(ce);
   }

   @Override
   public void i(iw<cdt> $$0) {
      this.ao.a(ce, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   public boolean gx() {
      return this.ao.a(cf);
   }

   void A(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gC() {
      return this.ao.a(cg);
   }

   public crs gy() {
      return crs.a(this.ao.a(ch));
   }

   private void a(crs $$0) {
      this.ao.a(ch, $$0.a());
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(ce, ld.ak.g(ci));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, crs.o.a());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("variant", this.gw().e().orElse(ci).a().toString());
      $$0.a("CollarColor", (byte)this.gy().a());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      Optional.ofNullable(akh.a($$0.l("variant"))).map($$0x -> akg.a(le.l, $$0x)).flatMap(ld.ak::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(crs.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bsl.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bsl.a);
            this.h(true);
         } else {
            this.b(bsl.a);
            this.h(false);
         }
      } else {
         this.b(bsl.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avb v() {
      if (this.r()) {
         if (this.gt()) {
            return avc.dX;
         } else {
            return this.ah.a(4) == 0 ? avc.dY : avc.dQ;
         }
      } else {
         return avc.dR;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gz() {
      this.b(avc.dU);
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.dW;
   }

   @Override
   protected avb o_() {
      return avc.dS;
   }

   public static btg.a gA() {
      return bsc.A().a(bth.q, 10.0).a(bth.r, 0.3F).a(bth.c, 3.0);
   }

   @Override
   protected void a(clh $$0, bpl $$1, csz $$2) {
      if (this.o($$2)) {
         this.a(avc.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gD() {
      return (float)this.g(bth.c);
   }

   @Override
   public boolean C(brh $$0) {
      return $$0.a(this.dO().b((bsa)this), this.gD());
   }

   @Override
   public void l() {
      super.l();
      if (this.ck != null && this.ck.i() && !this.r() && this.ai % 100 == 0) {
         this.a(avc.dV, 1.0F, 1.0F);
      }

      this.gE();
   }

   private void gE() {
      if ((this.gx() || this.gC()) && this.ai % 5 == 0) {
         this.a(avc.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gF();
      this.gG();
   }

   private void gF() {
      this.cm = this.cl;
      this.co = this.cn;
      if (this.gx()) {
         this.cl = Math.min(1.0F, this.cl + 0.15F);
         this.cn = Math.min(1.0F, this.cn + 0.08F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.22F);
         this.cn = Math.max(0.0F, this.cn - 0.13F);
      }
   }

   private void gG() {
      this.cq = this.cp;
      if (this.gC()) {
         this.cp = Math.min(1.0F, this.cp + 0.1F);
      } else {
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   public float G(float $$0) {
      return axz.i($$0, this.cm, this.cl);
   }

   public float H(float $$0) {
      return axz.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return axz.i($$0, this.cq, this.cp);
   }

   @Nullable
   public cds b(aqh $$0, brb $$1) {
      cds $$2 = brn.p.a((dad)$$0);
      if ($$2 != null && $$1 instanceof cds $$3) {
         if (this.ah.h()) {
            $$2.i(this.gw());
         } else {
            $$2.i($$3.gw());
         }

         if (this.r()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gy());
            } else {
               $$2.a($$3.gy());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cdp $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof cds $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      awg<cdt> $$5 = $$4 ? avs.b : avs.a;
      ld.ak.a($$5, $$0.E_()).ifPresent(this::i);
      aqh $$6 = $$0.E();
      if ($$6.a().a(this.dn(), awc.o).b()) {
         this.i(ld.ak.g(cdt.k));
         this.fT();
      }

      return $$3;
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      csu $$3 = $$2.f();
      if (this.r()) {
         if (this.j($$0)) {
            if ($$3 instanceof crt $$4) {
               crs $$5 = $$4.c();
               if ($$5 != this.gy()) {
                  if (!this.dN().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fT();
                  }

                  return bpm.a(this.dN().x_());
               }
            } else if (this.o($$2) && this.ey() < this.eP()) {
               if (!this.dN().x_()) {
                  this.a($$0, $$1, $$2);
                  coa $$6 = $$2.a(ka.t);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bpm.a(this.dN().x_());
            }

            bpm $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gp());
               return bpm.a(this.dN().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dN().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fT();
         }

         return bpm.a(this.dN().x_());
      }

      bpm $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fT();
      }

      return $$8;
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.r() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gB();
   }

   protected void gB() {
      if (this.cj == null) {
         this.cj = new cds.a<>(this, clh.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.r()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(clh $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dN().a(this, (byte)7);
      } else {
         this.dN().a(this, (byte)6);
      }
   }

   @Override
   public boolean bU() {
      return this.bY() || super.bU();
   }

   static class a<T extends bsa> extends bye<T> {
      private final cds i;

      public a(cds $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, brm.e::test);
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

   static class b extends byx {
      private final cds a;
      @Nullable
      private clh b;
      @Nullable
      private in c;
      private int d;

      public b(cds $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gp()) {
            return false;
         } else {
            bsa $$0 = this.a.P_();
            if ($$0 instanceof clh) {
               this.b = (clh)$$0;
               if (!$$0.fJ()) {
                  return false;
               }

               if (this.a.g((brh)this.b) > 100.0) {
                  return false;
               }

               in $$1 = this.b.dn();
               dqh $$2 = this.a.dN().a_($$1);
               if ($$2.a(avr.R)) {
                  this.c = $$2.d(dcx.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new in($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cds $$1 : this.a.dN().a(cds.class, new etk(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gx() || $$1.gC())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.r() && !this.a.gp() && this.b != null && this.b.fJ() && this.c != null && !this.h();
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
         float $$0 = this.a.dN().f(1.0F);
         if (this.b.ge() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dN().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         ayg $$0 = this.a.ej();
         in.a $$1 = new in.a();
         $$1.g(this.a.gc() ? this.a.ge().dn() : this.a.dn());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dn());
         eoq $$2 = this.a.dN().o().be().b(eoj.az);
         eoo $$3 = new eoo.a((aqh)this.a.dN()).a(erc.f, this.a.dl()).a(erc.a, this.a).a(erb.i);

         for (csz $$5 : $$2.a($$3)) {
            this.a
               .dN()
               .b(
                  new chr(
                     this.a.dN(),
                     (double)$$1.u() - (double)axz.a(this.a.aZ * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)axz.b(this.a.aZ * (float) (Math.PI / 180.0)),
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
            if (this.a.g((brh)this.b) < 2.5) {
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

   static class c extends caf {
      @Nullable
      private clh c;
      private final cds d;

      public c(cds $$0, double $$1, Predicate<csz> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.ej().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ej().a(this.a(500)) == 0) {
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
