import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cnj extends chw implements bwc, bwv {
   private static final alz bZ = alz.b("suffocating");
   private static final bxl ca = new bxl(bZ, -0.34F, bxl.a.b);
   private static final float cb = 0.35F;
   private static final float cd = 0.55F;
   private static final alc<Integer> ce = alg.a(cnj.class, ale.b);
   private static final alc<Boolean> cf = alg.a(cnj.class, ale.k);
   private static final alc<Boolean> cg = alg.a(cnj.class, ale.k);
   private final bwb ch = new bwb(this.al, ce, cg);
   @Nullable
   private cel ci;

   public cnj(bvq<? extends cnj> $$0, dhh $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eun.j, -1.0F);
      this.a(eun.i, 0.0F);
      this.a(eun.n, 0.0F);
      this.a(eun.o, 0.0F);
   }

   public static boolean c(bvq<cnj> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
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
   public void a(cxo $$0, @Nullable axg $$1) {
      this.ch.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, axf.yD, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdw(this, 1.65));
      this.bT.a(2, new ccp(this, 1.0));
      this.ci = new cel(this, 1.4, $$0 -> $$0.a(ayd.aA), false);
      this.bT.a(3, this.ci);
      this.bT.a(4, new cnj.a(this, 1.0));
      this.bT.a(5, new cdc(this, 1.0));
      this.bT.a(7, new cea(this, 1.0, 60));
      this.bT.a(8, new cdl(this, cpw.class, 8.0F));
      this.bT.a(8, new cdy(this));
      this.bT.a(9, new cdl(this, cnj.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(cf, $$0);
      bxj $$1 = this.g(bxn.v);
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
   public boolean a(etw $$0) {
      return $$0.a(aya.b);
   }

   @Override
   protected fbx a(bvj $$0, bvm $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * bae.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dhk $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bwf cX() {
      return (bwf)(this.j() && this.da() instanceof cpw $$0 && $$0.b(cxs.ol) ? $$0 : super.cX());
   }

   @Override
   public fbx b(bwf $$0) {
      fbx[] $$1 = new fbx[]{
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

      for (fbx $$6 : $$1) {
         $$5.b(this.dB() + $$6.d, $$3, this.dH() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jm.a);
         }
      }

      for (jh $$8 : $$2) {
         if (!this.dW().b_($$8).a(aya.b)) {
            double $$9 = this.dW().j($$8);
            if (csb.a($$9)) {
               fbx $$10 = fbx.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bwr $$11 = (bwr)var14.next();
                  fbs $$12 = $$0.f($$11);
                  if (csb.a(this.dW(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fbx(this.dB(), this.cR().e, this.dH());
   }

   @Override
   protected void a(cpw $$0, fbx $$1) {
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected fbx b(cpw $$0, fbx $$1) {
      return new fbx(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cpw $$0) {
      return (float)(this.h(bxn.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(this.bx() ? axf.yB : axf.yA, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.dZ());
   }

   @Override
   protected void a(double $$0, boolean $$1, dxu $$2, jh $$3) {
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
            dxu $$0 = this.dW().a_(this.dw());
            dxu $$1 = this.bt();
            $$2 = $$0.a(axu.aW) || $$1.a(axu.aW) || this.b(aya.b) > 0.0;
            if (this.dl() instanceof cnj $$3 && $$3.p()) {
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
         fcc $$0 = fcc.a(this);
         if ($$0.a(dpd.d, this.dw(), true) && !this.dW().b_(this.dw().d()).a(aya.b)) {
            this.d(true);
         } else {
            this.h(this.dz().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bxm.a t() {
      return chw.gt().a(bxn.v, 0.175F);
   }

   @Override
   protected axe u() {
      return !this.gl() && !this.x() ? axf.yv : null;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.yz;
   }

   @Override
   protected axe o_() {
      return axf.yy;
   }

   @Override
   protected boolean r(bvj $$0) {
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
   protected cfr b(dhh $$0) {
      return new cnj.b(this, $$0);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      if ($$1.a_($$0).y().a(aya.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cnj b(ash $$0, bva $$1) {
      return bvq.bt.a($$0, bvp.e);
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.az);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxs.oe);
      }
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return bti.a;
      } else {
         bti $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxo $$4 = $$0.b($$1);
            return (bti)($$4.a(cxs.oe) ? $$4.a($$0, this, $$1) : bti.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.yC, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         bam $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bwh $$5 = bvq.bR.a($$0.a(), bvp.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cnp.b(cnp.a($$4), false));
               $$5.a(bvr.a, new cxo(cxs.ol));
               this.a(new cxo(cxs.oe), null);
            }
         } else if ($$4.a(10) == 0) {
            bva $$6 = bvq.bt.a($$0.a(), bvp.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bva.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bwy a(dhy $$0, btg $$1, bwh $$2, @Nullable bwy $$3) {
      $$2.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
      $$2.a($$0, $$1, bvp.g, $$3);
      $$2.a(this, true);
      return new bva.a(0.0F);
   }

   static class a extends cdq {
      private final cnj g;

      a(cnj $$0, double $$1) {
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
      protected boolean a(dhk $$0, jh $$1) {
         return $$0.a_($$1).a(dkn.K) && $$0.a_($$1.d()).a(eul.a);
      }
   }

   static class b extends cfq {
      b(cnj $$0, dhh $$1) {
         super($$0, $$1);
      }

      @Override
      protected eum a(int $$0) {
         this.o = new eus();
         this.o.a(true);
         return new eum(this.o, $$0);
      }

      @Override
      protected boolean a(eun $$0) {
         return $$0 != eun.i && $$0 != eun.o && $$0 != eun.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jh $$0) {
         return this.b.a_($$0).a(dkn.K) || super.a($$0);
      }
   }
}
