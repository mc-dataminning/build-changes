import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cnb extends cho implements bvu, bwn {
   private static final alp bZ = alp.b("suffocating");
   private static final bxd ca = new bxd(bZ, -0.34F, bxd.a.b);
   private static final float cb = 0.35F;
   private static final float cd = 0.55F;
   private static final aks<Integer> ce = akw.a(cnb.class, aku.b);
   private static final aks<Boolean> cf = akw.a(cnb.class, aku.k);
   private static final aks<Boolean> cg = akw.a(cnb.class, aku.k);
   private final bvt ch = new bvt(this.al, ce, cg);
   @Nullable
   private ced ci;

   public cnb(bvi<? extends cnb> $$0, dgz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(euh.j, -1.0F);
      this.a(euh.i, 0.0F);
      this.a(euh.n, 0.0F);
      this.a(euh.o, 0.0F);
   }

   public static boolean c(bvi<cnb> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      jh.a $$5 = $$3.k();

      do {
         $$5.c(jm.b);
      } while ($$1.b_($$5).a(axq.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(aks<?> $$0) {
      if (ce.equals($$0) && this.dW().C) {
         this.ch.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      this.ch.a($$0);
   }

   @Override
   public void a(um $$0) {
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
   public void a(cxg $$0, @Nullable aww $$1) {
      this.ch.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, awv.yT, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdo(this, 1.65));
      this.bT.a(2, new cch(this, 1.0));
      this.ci = new ced(this, 1.4, $$0 -> $$0.a(axt.aA), false);
      this.bT.a(3, this.ci);
      this.bT.a(4, new cnb.a(this, 1.0));
      this.bT.a(5, new ccu(this, 1.0));
      this.bT.a(7, new cds(this, 1.0, 60));
      this.bT.a(8, new cdd(this, cpo.class, 8.0F));
      this.bT.a(8, new cdq(this));
      this.bT.a(9, new cdd(this, cnb.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(cf, $$0);
      bxb $$1 = this.g(bxf.v);
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
   public boolean a(etq $$0) {
      return $$0.a(axq.b);
   }

   @Override
   protected fbr a(bvb $$0, bve $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * azu.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bvx cX() {
      return (bvx)(this.j() && this.da() instanceof cpo $$0 && $$0.b(cxk.ou) ? $$0 : super.cX());
   }

   @Override
   public fbr b(bvx $$0) {
      fbr[] $$1 = new fbr[]{
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

      for (fbr $$6 : $$1) {
         $$5.b(this.dB() + $$6.d, $$3, this.dH() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dW().b_($$8).a(axq.b)) {
            double $$9 = this.dW().j($$8);
            if (crt.a($$9)) {
               fbr $$10 = fbr.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bwj $$11 = (bwj)var14.next();
                  fbm $$12 = $$0.f($$11);
                  if (crt.a(this.dW(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fbr(this.dB(), this.cR().e, this.dH());
   }

   @Override
   protected void a(cpo $$0, fbr $$1) {
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected fbr b(cpo $$0, fbr $$1) {
      return new fbr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cpo $$0) {
      return (float)(this.h(bxf.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(this.bx() ? awv.yR : awv.yQ, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.dZ());
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
      if (this.bx()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awv.yM);
      } else if (this.gl() && this.ae.a(60) == 0) {
         this.b(awv.yN);
      }

      if (!this.gb()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dxo $$0 = this.dW().a_(this.dw());
            dxo $$1 = this.bt();
            $$2 = $$0.a(axk.aW) || $$1.a(axk.aW) || this.b(axq.b) > 0.0;
            if (this.dl() instanceof cnb $$3 && $$3.p()) {
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
         fbw $$0 = fbw.a(this);
         if ($$0.a(dov.d, this.dw(), true) && !this.dW().b_(this.dw().d()).a(axq.b)) {
            this.d(true);
         } else {
            this.h(this.dz().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bxe.a t() {
      return cho.gt().a(bxf.v, 0.175F);
   }

   @Override
   protected awu u() {
      return !this.gl() && !this.x() ? awv.yL : null;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.yP;
   }

   @Override
   protected awu o_() {
      return awv.yO;
   }

   @Override
   protected boolean r(bvb $$0) {
      return !this.ca() && !this.a(axq.b);
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
   protected cfj b(dgz $$0) {
      return new cnb.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      if ($$1.a_($$0).y().a(axq.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cnb b(arx $$0, bus $$1) {
      return bvi.bt.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.az);
   }

   @Override
   protected void f(arx $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxk.on);
      }
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return bta.a;
      } else {
         bta $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxg $$4 = $$0.b($$1);
            return (bta)($$4.a(cxk.on) ? $$4.a($$0, this, $$1) : bta.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.yS, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         bac $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bvz $$5 = bvi.bR.a($$0.a(), bvh.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cnh.b(cnh.a($$4), false));
               $$5.a(bvj.a, new cxg(cxk.ou));
               this.a(new cxg(cxk.on), null);
            }
         } else if ($$4.a(10) == 0) {
            bus $$6 = bvi.bt.a($$0.a(), bvh.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bus.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwq a(dhq $$0, bsy $$1, bvz $$2, @Nullable bwq $$3) {
      $$2.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
      $$2.a($$0, $$1, bvh.g, $$3);
      $$2.a(this, true);
      return new bus.a(0.0F);
   }

   static class a extends cdi {
      private final cnb g;

      a(cnb $$0, double $$1) {
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
      protected boolean a(dhc $$0, jh $$1) {
         return $$0.a_($$1).a(dkf.K) && $$0.a_($$1.d()).a(euf.a);
      }
   }

   static class b extends cfi {
      b(cnb $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      protected eug a(int $$0) {
         this.o = new eum();
         this.o.a(true);
         return new eug(this.o, $$0);
      }

      @Override
      protected boolean a(euh $$0) {
         return $$0 != euh.i && $$0 != euh.o && $$0 != euh.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dkf.K) || super.a($$0);
      }
   }
}
