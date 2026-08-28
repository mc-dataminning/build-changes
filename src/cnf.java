import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cnf extends chs implements bvy, bwr {
   private static final alz bZ = alz.b("suffocating");
   private static final bxh ca = new bxh(bZ, -0.34F, bxh.a.b);
   private static final float cb = 0.35F;
   private static final float cd = 0.55F;
   private static final alc<Integer> ce = alg.a(cnf.class, ale.b);
   private static final alc<Boolean> cf = alg.a(cnf.class, ale.k);
   private static final alc<Boolean> cg = alg.a(cnf.class, ale.k);
   private final bvx ch = new bvx(this.al, ce, cg);
   @Nullable
   private ceh ci;

   public cnf(bvm<? extends cnf> $$0, dha $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eug.j, -1.0F);
      this.a(eug.i, 0.0F);
      this.a(eug.n, 0.0F);
      this.a(eug.o, 0.0F);
   }

   public static boolean c(bvm<cnf> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      jh.a $$5 = $$3.k();

      do {
         $$5.c(jm.b);
      } while ($$1.b_($$5).a(aya.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(alc<?> $$0) {
      if (ce.equals($$0) && this.dV().C) {
         this.ch.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.ch.a($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.ch.b($$0);
   }

   @Override
   public boolean j() {
      return this.ch.d();
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_();
   }

   @Override
   public void a(cxk $$0, @Nullable axg $$1) {
      this.ch.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, axf.yC, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bT.a(1, new cds(this, 1.65));
      this.bT.a(2, new ccl(this, 1.0));
      this.ci = new ceh(this, 1.4, $$0 -> $$0.a(ayd.aA), false);
      this.bT.a(3, this.ci);
      this.bT.a(4, new cnf.a(this, 1.0));
      this.bT.a(5, new ccy(this, 1.0));
      this.bT.a(7, new cdw(this, 1.0, 60));
      this.bT.a(8, new cdh(this, cps.class, 8.0F));
      this.bT.a(8, new cdu(this));
      this.bT.a(9, new cdh(this, cnf.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(cf, $$0);
      bxf $$1 = this.g(bxj.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(ca);
         } else {
            $$1.c(bZ);
         }
      }
   }

   public boolean p() {
      return this.al.a(cf);
   }

   @Override
   public boolean a(etp $$0) {
      return $$0.a(aya.b);
   }

   @Override
   protected fbs a(bvf $$0, bvi $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * bae.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dhd $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bwb cX() {
      return (bwb)(this.j() && this.da() instanceof cps $$0 && $$0.b(cxo.ol) ? $$0 : super.cX());
   }

   @Override
   public fbs b(bwb $$0) {
      fbs[] $$1 = new fbs[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<jh> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      jh.a $$5 = new jh.a();

      for (fbs $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dV().b_($$8).a(aya.b)) {
            double $$9 = this.dV().j($$8);
            if (crx.a($$9)) {
               fbs $$10 = fbs.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fM().iterator();

               while (var14.hasNext()) {
                  bwn $$11 = (bwn)var14.next();
                  fbn $$12 = $$0.f($$11);
                  if (crx.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fbs(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(cps $$0, fbs $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected fbs b(cps $$0, fbs $$1) {
      return new fbs(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cps $$0) {
      return (float)(this.h(bxj.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(this.bx() ? axf.yA : axf.yz, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dxn $$2, jh $$3) {
      if (this.bx()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(axf.yv);
      } else if (this.gj() && this.ae.a(60) == 0) {
         this.b(axf.yw);
      }

      if (!this.fZ()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dxn $$0 = this.dV().a_(this.dv());
            dxn $$1 = this.bt();
            $$2 = $$0.a(axu.aW) || $$1.a(axu.aW) || this.b(aya.b) > 0.0;
            if (this.dk() instanceof cnf $$3 && $$3.p()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.h();
      this.gm();
   }

   private boolean x() {
      return this.ci != null && this.ci.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gm() {
      if (this.bx()) {
         fbx $$0 = fbx.a(this);
         if ($$0.a(dow.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(aya.b)) {
            this.d(true);
         } else {
            this.h(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bxi.a t() {
      return chs.gr().a(bxj.v, 0.175F);
   }

   @Override
   protected axe u() {
      return !this.gj() && !this.x() ? axf.yu : null;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.yy;
   }

   @Override
   protected axe o_() {
      return axf.yx;
   }

   @Override
   protected boolean r(bvf $$0) {
      return !this.ca() && !this.a(aya.b);
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cfn b(dha $$0) {
      return new cnf.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      if ($$1.a_($$0).y().a(aya.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cnf b(ash $$0, buw $$1) {
      return bvm.bt.a($$0, bvl.e);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.az);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxo.oe);
      }
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fW()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bte.a;
      } else {
         bte $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxk $$4 = $$0.b($$1);
            return (bte)($$4.a(cxo.oe) ? $$4.a($$0, this, $$1) : bte.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.yB, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         bam $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bwd $$5 = bvm.bR.a($$0.a(), bvl.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cnl.b(cnl.a($$4), false));
               $$5.a(bvn.a, new cxk(cxo.ol));
               this.a(new cxk(cxo.oe), null);
            }
         } else if ($$4.a(10) == 0) {
            buw $$6 = bvm.bt.a($$0.a(), bvl.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new buw.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwu a(dhr $$0, btc $$1, bwd $$2, @Nullable bwu $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bvl.g, $$3);
      $$2.a(this, true);
      return new buw.a(0.0F);
   }

   static class a extends cdm {
      private final cnf g;

      a(cnf $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jh k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bx() && this.a(this.g.dV(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bx() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dhd $$0, jh $$1) {
         return $$0.a_($$1).a(dkg.K) && $$0.a_($$1.d()).a(eue.a);
      }
   }

   static class b extends cfm {
      b(cnf $$0, dha $$1) {
         super($$0, $$1);
      }

      @Override
      protected euf a(int $$0) {
         this.o = new eul();
         this.o.a(true);
         return new euf(this.o, $$0);
      }

      @Override
      protected boolean a(eug $$0) {
         return $$0 != eug.i && $$0 != eug.o && $$0 != eug.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dkg.K) || super.a($$0);
      }
   }
}
