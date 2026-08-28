import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cnk extends chx implements bwd, bww {
   private static final alz bZ = alz.b("suffocating");
   private static final bxm ca = new bxm(bZ, -0.34F, bxm.a.b);
   private static final float cb = 0.35F;
   private static final float cd = 0.55F;
   private static final alc<Integer> ce = alg.a(cnk.class, ale.b);
   private static final alc<Boolean> cf = alg.a(cnk.class, ale.k);
   private static final alc<Boolean> cg = alg.a(cnk.class, ale.k);
   private final bwc ch = new bwc(this.al, ce, cg);
   @Nullable
   private cem ci;

   public cnk(bvr<? extends cnk> $$0, dhi $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(euo.j, -1.0F);
      this.a(euo.i, 0.0F);
      this.a(euo.n, 0.0F);
      this.a(euo.o, 0.0F);
   }

   public static boolean c(bvr<cnk> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      jh.a $$5 = $$3.k();

      do {
         $$5.c(jm.b);
      } while ($$1.b_($$5).a(aya.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(alc<?> $$0) {
      if (ce.equals($$0) && this.dW().C) {
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
   public void a(cxp $$0, @Nullable axg $$1) {
      this.ch.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, axf.yD, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdx(this, 1.65));
      this.bT.a(2, new ccq(this, 1.0));
      this.ci = new cem(this, 1.4, $$0 -> $$0.a(ayd.aA), false);
      this.bT.a(3, this.ci);
      this.bT.a(4, new cnk.a(this, 1.0));
      this.bT.a(5, new cdd(this, 1.0));
      this.bT.a(7, new ceb(this, 1.0, 60));
      this.bT.a(8, new cdm(this, cpx.class, 8.0F));
      this.bT.a(8, new cdz(this));
      this.bT.a(9, new cdm(this, cnk.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(cf, $$0);
      bxk $$1 = this.g(bxo.v);
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
   public boolean a(etx $$0) {
      return $$0.a(aya.b);
   }

   @Override
   protected fby a(bvk $$0, bvn $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * bae.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dhl $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bwg cX() {
      return (bwg)(this.j() && this.da() instanceof cpx $$0 && $$0.b(cxt.ol) ? $$0 : super.cX());
   }

   @Override
   public fby b(bwg $$0) {
      fby[] $$1 = new fby[]{
         a((double)this.dr(), (double)$$0.dr(), $$0.dM()),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() - 22.5F),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() + 22.5F),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() - 45.0F),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() + 45.0F)
      };
      Set<jh> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      jh.a $$5 = new jh.a();

      for (fby $$6 : $$1) {
         $$5.b(this.dB() + $$6.d, $$3, this.dH() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dW().b_($$8).a(aya.b)) {
            double $$9 = this.dW().j($$8);
            if (csc.a($$9)) {
               fby $$10 = fby.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bws $$11 = (bws)var14.next();
                  fbt $$12 = $$0.f($$11);
                  if (csc.a(this.dW(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fby(this.dB(), this.cR().e, this.dH());
   }

   @Override
   protected void a(cpx $$0, fby $$1) {
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected fby b(cpx $$0, fby $$1) {
      return new fby(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cpx $$0) {
      return (float)(this.h(bxo.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(this.bx() ? axf.yB : axf.yA, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.dZ());
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
      if (this.bx()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(axf.yw);
      } else if (this.gl() && this.ae.a(60) == 0) {
         this.b(axf.yx);
      }

      if (!this.gb()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dxv $$0 = this.dW().a_(this.dw());
            dxv $$1 = this.bt();
            $$2 = $$0.a(axu.aW) || $$1.a(axu.aW) || this.b(aya.b) > 0.0;
            if (this.dl() instanceof cnk $$3 && $$3.p()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.h();
      this.go();
   }

   private boolean x() {
      return this.ci != null && this.ci.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void go() {
      if (this.bx()) {
         fcd $$0 = fcd.a(this);
         if ($$0.a(dpe.d, this.dw(), true) && !this.dW().b_(this.dw().d()).a(aya.b)) {
            this.d(true);
         } else {
            this.h(this.dz().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bxn.a t() {
      return chx.gt().a(bxo.v, 0.175F);
   }

   @Override
   protected axe u() {
      return !this.gl() && !this.x() ? axf.yv : null;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.yz;
   }

   @Override
   protected axe o_() {
      return axf.yy;
   }

   @Override
   protected boolean r(bvk $$0) {
      return !this.ca() && !this.a(aya.b);
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cnk.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      if ($$1.a_($$0).y().a(aya.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cnk b(ash $$0, bvb $$1) {
      return bvr.bt.a($$0, bvq.e);
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.az);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxt.oe);
      }
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return btj.a;
      } else {
         btj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxp $$4 = $$0.b($$1);
            return (btj)($$4.a(cxt.oe) ? $$4.a($$0, this, $$1) : btj.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.yC, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         bam $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bwi $$5 = bvr.bR.a($$0.a(), bvq.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cnq.b(cnq.a($$4), false));
               $$5.a(bvs.a, new cxp(cxt.ol));
               this.a(new cxp(cxt.oe), null);
            }
         } else if ($$4.a(10) == 0) {
            bvb $$6 = bvr.bt.a($$0.a(), bvq.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bvb.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwz a(dhz $$0, bth $$1, bwi $$2, @Nullable bwz $$3) {
      $$2.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
      $$2.a($$0, $$1, bvq.g, $$3);
      $$2.a(this, true);
      return new bvb.a(0.0F);
   }

   static class a extends cdr {
      private final cnk g;

      a(cnk $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jh k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bx() && this.a(this.g.dW(), this.e);
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
      protected boolean a(dhl $$0, jh $$1) {
         return $$0.a_($$1).a(dko.K) && $$0.a_($$1.d()).a(eum.a);
      }
   }

   static class b extends cfr {
      b(cnk $$0, dhi $$1) {
         super($$0, $$1);
      }

      @Override
      protected eun a(int $$0) {
         this.o = new eut();
         this.o.a(true);
         return new eun(this.o, $$0);
      }

      @Override
      protected boolean a(euo $$0) {
         return $$0 != euo.i && $$0 != euo.o && $$0 != euo.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dko.K) || super.a($$0);
      }
   }
}
