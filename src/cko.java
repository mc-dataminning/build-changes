import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cko extends cfc implements bti, buc {
   private static final akq ca = akq.b("suffocating");
   private static final bus cb = new bus(ca, -0.34F, bus.a.b);
   private static final float cc = 0.35F;
   private static final float ce = 0.55F;
   private static final ajv<Integer> cf = ajz.a(cko.class, ajx.b);
   private static final ajv<Boolean> cg = ajz.a(cko.class, ajx.k);
   private static final ajv<Boolean> ch = ajz.a(cko.class, ajx.k);
   private final bth ci = new bth(this.ao, cf, ch);
   @Nullable
   private cbs cj;

   public cko(bsw<? extends cko> $$0, dcu $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(epp.j, -1.0F);
      this.a(epp.i, 0.0F);
      this.a(epp.n, 0.0F);
      this.a(epp.o, 0.0F);
   }

   public static boolean c(bsw<cko> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      jd.a $$5 = $$3.j();

      do {
         $$5.c(ji.b);
      } while ($$1.b_($$5).a(awj.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cf.equals($$0) && this.dQ().B) {
         this.ci.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.ci.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.ci.b($$0);
   }

   @Override
   public boolean i() {
      return this.ci.d();
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_();
   }

   @Override
   public void a(@Nullable avp $$0) {
      this.ci.a(true);
      if ($$0 != null) {
         this.dQ().a(null, this, avo.ye, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bU.a(1, new cbd(this, 1.65));
      this.bU.a(2, new bzw(this, 1.0));
      this.cj = new cbs(this, 1.4, $$0 -> $$0.a(awm.au), false);
      this.bU.a(3, this.cj);
      this.bU.a(4, new cko.a(this, 1.0));
      this.bU.a(5, new caj(this, 1.0));
      this.bU.a(7, new cbh(this, 1.0, 60));
      this.bU.a(8, new cas(this, cmv.class, 8.0F));
      this.bU.a(8, new cbf(this));
      this.bU.a(9, new cas(this, cko.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(cg, $$0);
      buq $$1 = this.f(buu.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(cb);
         } else {
            $$1.c(ca);
         }
      }
   }

   public boolean s() {
      return this.ao.a(cg);
   }

   @Override
   public boolean a(eoy $$0) {
      return $$0.a(awj.b);
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayn.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcx $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btl cR() {
      return (btl)(this.i() && this.cU() instanceof cmv $$0 && $$0.b(cur.nS) ? $$0 : super.cR());
   }

   @Override
   public eww b(btl $$0) {
      eww[] $$1 = new eww[]{
         a((double)this.dk(), (double)$$0.dk(), $$0.dG()),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() - 22.5F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() + 22.5F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() - 45.0F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() + 45.0F)
      };
      Set<jd> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cL().e;
      double $$4 = this.cL().b - 0.5;
      jd.a $$5 = new jd.a();

      for (eww $$6 : $$1) {
         $$5.b(this.dv() + $$6.c, $$3, this.dB() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ji.a);
         }
      }

      for (jd $$8 : $$2) {
         if (!this.dQ().b_($$8).a(awj.b)) {
            double $$9 = this.dQ().j($$8);
            if (cow.a($$9)) {
               eww $$10 = eww.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  bty $$11 = (bty)var14.next();
                  ewr $$12 = $$0.f($$11);
                  if (cow.a(this.dQ(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eww(this.dv(), this.cL().e, this.dB());
   }

   @Override
   protected void a(cmv $$0, eww $$1) {
      this.a($$0.dG(), $$0.dI() * 0.5F);
      this.O = this.aY = this.ba = this.dG();
      this.ci.b();
      super.a($$0, $$1);
   }

   @Override
   protected eww b(cmv $$0, eww $$1) {
      return new eww(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmv $$0) {
      return (float)(this.g(buu.v) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.ci.c());
   }

   @Override
   protected float aP() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(this.bt() ? avo.yc : avo.yb, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ci.a(this.dT());
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
      this.aT();
      if (this.bt()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.x() && this.ah.a(140) == 0) {
         this.b(avo.xX);
      } else if (this.gj() && this.ah.a(60) == 0) {
         this.b(avo.xY);
      }

      if (!this.gb()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dta $$0 = this.dQ().a_(this.dq());
            dta $$1 = this.bp();
            $$2 = $$0.a(awd.aU) || $$1.a(awd.aU) || this.b(awj.b) > 0.0;
            if (this.dd() instanceof cko $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gm();
      this.aT();
   }

   private boolean x() {
      return this.cj != null && this.cj.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gm() {
      if (this.bt()) {
         exb $$0 = exb.a(this);
         if ($$0.a(dkm.d, this.dq(), true) && !this.dQ().b_(this.dq().c()).a(awj.b)) {
            this.e(true);
         } else {
            this.i(this.dt().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static but.a t() {
      return btn.A().a(buu.v, 0.175F).a(buu.m, 16.0);
   }

   @Override
   protected avn v() {
      return !this.gj() && !this.x() ? avo.xW : null;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.ya;
   }

   @Override
   protected avn n_() {
      return avo.xZ;
   }

   @Override
   protected boolean r(bsq $$0) {
      return !this.bT() && !this.a(awj.b);
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cko.b(this, $$0);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      if ($$1.a_($$0).u().a(awj.b)) {
         return 10.0F;
      } else {
         return this.bt() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cko b(aqt $$0, bsk $$1) {
      return bsw.aZ.a((dcu)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.at);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cur.nL);
      }
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bT() && !$$0.fO()) {
         if (!this.dQ().B) {
            $$0.n(this);
         }

         return bqq.a(this.dQ().B);
      } else {
         bqq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuo $$4 = $$0.b($$1);
            return $$4.a(cur.nL) ? $$4.a($$0, this, $$1) : bqq.e;
         } else {
            if ($$2 && !this.aX()) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.yd, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayv $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btn $$5 = bsw.bx.a((dcu)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cku.b(cku.a($$4), false));
               $$5.a(bsx.a, new cuo(cur.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsk $$6 = bsw.aZ.a((dcu)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsk.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private buf a(ddj $$0, bqo $$1, btn $$2, @Nullable buf $$3) {
      $$2.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
      $$2.a($$0, $$1, btp.g, $$3);
      $$2.a(this, true);
      return new bsk.a(0.0F);
   }

   static class a extends cax {
      private final cko g;

      a(cko $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jd k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bt() && this.a(this.g.dQ(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bt() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dcx $$0, jd $$1) {
         return $$0.a_($$1).a(dfy.H) && $$0.a_($$1.c()).a(epn.a);
      }
   }

   static class b extends ccx {
      b(cko $$0, dcu $$1) {
         super($$0, $$1);
      }

      @Override
      protected epo a(int $$0) {
         this.o = new epu();
         this.o.a(true);
         return new epo(this.o, $$0);
      }

      @Override
      protected boolean a(epp $$0) {
         return $$0 != epp.i && $$0 != epp.o && $$0 != epp.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jd $$0) {
         return this.b.a_($$0).a(dfy.H) || super.a($$0);
      }
   }
}
